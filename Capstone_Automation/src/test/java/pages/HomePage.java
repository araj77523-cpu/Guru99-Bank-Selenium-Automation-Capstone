package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

   
    @FindBy(xpath = "//td[contains(text(),'Manger Id')]")
    WebElement managerIdText_WE;

   
    @FindBy(linkText = "New Customer")
    WebElement newCustomerLink_WE;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public boolean checkHomePageTitle() {

        String expectedTitle = "Guru99 Bank Manager HomePage";
        String actualTitle = driver.getTitle();

        return actualTitle.equals(expectedTitle);
    }


    public boolean isManagerIdDisplayed() {

        try {
            return managerIdText_WE.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    public boolean checkHomePageUI() {

        try {
            return newCustomerLink_WE.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
