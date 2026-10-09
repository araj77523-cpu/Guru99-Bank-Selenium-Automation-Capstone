package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.microsoft.playwright.Page;
import Factory.PageFactory;

public class BaseTest {

    protected PageFactory pf;
    protected Page page;

    @BeforeClass
    public void setup() {
        pf = new PageFactory();
        page = pf.initBrowser("Chromium");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        if (pf != null) {
            pf.closeBrowser();
        }
    }
}