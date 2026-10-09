package Pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    private String login = "a[href='/login']";
    private String heading = "div.login-form h2";
   

    public LoginPage(Page page) {
        this.page = page;
    }

    public void clickLogin() {
        page.locator(login).click();
    }

    public String getLoginPageTitle() {
        return page.title();
    }

    public String getLoginPageURL() {
        return page.url();
    }

    public String getLoginHeading() {
        return page.locator(heading).innerText();
    }
  
    
}