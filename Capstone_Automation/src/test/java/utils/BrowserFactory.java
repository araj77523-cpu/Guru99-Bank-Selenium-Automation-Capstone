package utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

    public static WebDriver openBrowser() {

        WebDriver driver = null;

        try {
            
            Properties prop = new Properties();
            FileInputStream fin = new FileInputStream("C:\\Users\\v-rajankit\\eclipse-workspace\\Capstone_Automation\\Config.properties");
            prop.load(fin);

            String browserType = prop.getProperty("browser");

            System.out.println("Browser = " + browserType);

            
            if (browserType.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            }
            else if (browserType.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
            else {
                System.out.println("Invalid browser mentioned");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return driver;
    }
}
