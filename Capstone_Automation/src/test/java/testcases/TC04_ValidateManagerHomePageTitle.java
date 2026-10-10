package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;

public class TC04_ValidateManagerHomePageTitle extends BaseTest {

    @Test (priority = 4)
    public void validateHomePageTitle() throws Exception {

        LoginPage lp = new LoginPage(driver);

        HomePage hp = lp.loginToApplication();

        boolean result = hp.checkHomePageTitle();

        Assert.assertTrue(result);
    }
}
