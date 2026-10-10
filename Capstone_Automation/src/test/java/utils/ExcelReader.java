package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

   
    public static String[][] readTestData(String filepath, String fileName, String tabName) throws Exception {

        File file = new File(filepath + fileName); 
        FileInputStream fin = new FileInputStream(file);

       
        String fileExt = fileName.substring(fileName.indexOf("."));
        Workbook wb = null;

        if (fileExt.equals(".xlsx")) {
            wb = new XSSFWorkbook(fin);
        } else if (fileExt.equals(".xls")) {
            wb = new HSSFWorkbook(fin);
        } else {
            System.out.println("Invalid file format!");
            return null;
        }

        Sheet sheet = wb.getSheet(tabName);

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        Iterator rowIterator = sheet.rowIterator();
        Row headerRow = (Row) rowIterator.next();
        int columnCount = headerRow.getPhysicalNumberOfCells();

       
        String[][] data = new String[rowCount][columnCount];

        for (int i = 1; i <= rowCount; i++) {

            Row rowSheet = sheet.getRow(i);

            for (int j = 0; j < rowSheet.getLastCellNum(); j++) {

                data[i - 1][j] = rowSheet.getCell(j).getStringCellValue();
            }
        }

        wb.close();
        fin.close();

        return data;
    }
}
