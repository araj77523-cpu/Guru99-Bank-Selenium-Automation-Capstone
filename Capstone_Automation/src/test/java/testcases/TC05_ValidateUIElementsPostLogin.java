package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;

public class TC05_ValidateUIElementsPostLogin extends BaseTest {

    @Test (priority = 5)
    public void validateHomeUI() throws Exception {

        LoginPage lp = new LoginPage(driver);

        HomePage hp = lp.loginToApplication();

        boolean result = hp.checkHomePageUI();

        Assert.assertTrue(result);
    }
}
