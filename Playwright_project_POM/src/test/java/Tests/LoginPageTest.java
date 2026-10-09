package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.LoginFormPage;

public class LoginPageTest extends BaseTest {

    LoginPage loginpage;
    LoginFormPage loginFormPage;

    @Test
    public void verifyLoginPage() {

        loginpage = new LoginPage(page);
        loginFormPage = new LoginFormPage(page);

        // Verify Home Page Title
        Assert.assertEquals(page.title(),"Automation Exercise");

        System.out.println("Home Page Title: " + page.title());

        // Verify Home Page URL
        Assert.assertEquals(page.url(),"https://automationexercise.com/");

        System.out.println("Home Page URL: " + page.url());

        // Click Signup / Login
        loginpage.clickLogin();

        // Verify Login Heading
        String heading = loginpage.getLoginHeading();

        Assert.assertEquals(heading,"Login to your account");

        System.out.println("Login Heading: " + heading);

        // Enter Credentials
        loginFormPage.enterEmail("Ankitraj222@gmail.com");
        loginFormPage.enterPassword("Approvals@123");

        // Click Login
        loginFormPage.clickLoginButton();

        // Verify Logged In Text
        String loggedInText = loginFormPage.getLoggedInText();

        System.out.println("Logged In Text: " + loggedInText);

        Assert.assertEquals(loggedInText,"Automation","Login unsuccessful"
        );
    }
}