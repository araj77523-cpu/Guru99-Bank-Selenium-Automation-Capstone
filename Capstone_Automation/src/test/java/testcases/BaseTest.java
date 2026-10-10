package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utils.BrowserFactory;
import utils.ConfigReader;
import pages.LoginPage;

public class BaseTest {

    public WebDriver driver;
    String url = ConfigReader.get("url");

  
    LoginPage loginPageObj;

    @BeforeMethod
    public void initTest() {

        
        driver = BrowserFactory.openBrowser();
        driver.manage().window().maximize();
        driver.get(url);

        
        loginPageObj = new LoginPage(driver);
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
}
