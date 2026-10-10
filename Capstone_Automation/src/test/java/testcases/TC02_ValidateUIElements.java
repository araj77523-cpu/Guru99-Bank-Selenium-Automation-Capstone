package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TC02_ValidateUIElements extends BaseTest {

    @Test (priority = 2)
    public void validateUI() {

        LoginPage lp = new LoginPage(driver);

        boolean result = lp.checkLoginPageUI();

        Assert.assertTrue(result);
    }
}
