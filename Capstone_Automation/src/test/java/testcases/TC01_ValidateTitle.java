package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TC01_ValidateTitle extends BaseTest {

    @Test (priority = 1)
    public void validateTitle() {

        LoginPage lp = new LoginPage(driver);

        boolean result = lp.checkLoginPageTitle();

        Assert.assertTrue(result);
    }
}
