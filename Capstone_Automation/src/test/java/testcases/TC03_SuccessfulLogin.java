package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;

public class TC03_SuccessfulLogin extends BaseTest {

    @Test (priority = 3)
    public void successfulLogin() throws Exception {

        LoginPage lp = new LoginPage(driver);

        HomePage hp = lp.loginToApplication();

        boolean result = hp.isManagerIdDisplayed();

        Assert.assertTrue(result);
    }
}
