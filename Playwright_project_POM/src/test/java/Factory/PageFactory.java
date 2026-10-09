package Factory;

import com.microsoft.playwright.*;

public class PageFactory {

    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    Page page;

    public Page initBrowser(String browserName) {

        playwright = Playwright.create();

        switch (browserName.toLowerCase()) {

        case "chromium":
        case "chrome":
            browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                    .setHeadless(false));
            break;

        case "firefox":
            browser = playwright.firefox().launch(
                new BrowserType.LaunchOptions()
                    .setHeadless(false));
            break;

        case "safari":
        case "webkit":
            browser = playwright.webkit().launch(
                new BrowserType.LaunchOptions()
                    .setHeadless(false));
            break;

        default: System.out.println("Please pass the right browser name....");
        
        }

        browserContext = browser.newContext();
        page = browserContext.newPage();

        page.navigate("https://automationexercise.com/");

        return page;
    }
    
    public void closeBrowser() {

        if (browserContext != null) {
            browserContext.close();
        }

        if (browser != null) {
            browser.close();
        }

        if (playwright != null) {
            playwright.close();
        }
    }

}