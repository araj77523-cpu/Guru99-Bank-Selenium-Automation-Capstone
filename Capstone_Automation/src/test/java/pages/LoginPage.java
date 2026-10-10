package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ExcelReader;

public class LoginPage {

    WebDriver driver;

    @FindBy(name = "uid")
    WebElement userID_WE;

    @FindBy(name = "password")
    WebElement password_WE;

    @FindBy(name = "btnLogin")
    WebElement loginBTN_WE;

    @FindBy(name = "btnReset")
    WebElement resetBTN_WE;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   
    public boolean checkLoginPageTitle() {
        return driver.getTitle().equals("Guru99 Bank Home Page");
    }

   
    public boolean checkLoginPageUI() {

        ArrayList<WebElement> elements = new ArrayList<>();
        elements.add(userID_WE);
        elements.add(password_WE);
        elements.add(loginBTN_WE);
        elements.add(resetBTN_WE);

        for (WebElement e : elements) {
            if (!e.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    
    public HomePage loginToApplication() throws Exception {

        String[][] data = ExcelReader.readTestData(
                "C:\\\\Program Files\\\\",
                "TestsData.xlsx",
                "Sheet1"
        );

        String uid = data[0][0];
        String pwd = data[0][1];

        userID_WE.sendKeys(uid);
        password_WE.sendKeys(pwd);
        loginBTN_WE.click();

        return PageFactory.initElements(driver, HomePage.class);
    }
}
