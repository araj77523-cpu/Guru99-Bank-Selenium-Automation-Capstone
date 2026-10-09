package Pages;

import com.microsoft.playwright.Page;

public class LoginFormPage {

	private Page page;
	
	private String email = "input[data-qa='login-email']";
    private String password = "input[name='password']";
	private String loginButton = "button[data-qa='login-button']";
	private String loggedInText = "//*[@id=\"slider-carousel\"]/div/div[3]/div[1]/h1/span";
	private String products = "a[href='/products']";
	
	// Constructor
	public LoginFormPage(Page page) {
        this.page = page;
    }


    // Enter Email
    public void enterEmail(String userEmail) {
        page.locator(email).fill(userEmail);
    }

    // Enter Password
    public void enterPassword(String userPassword) {
        page.locator(password).fill(userPassword);
    }

    // Click Login Button
    public void clickLoginButton() {
        page.locator(loginButton).click();
    }
    
    public String getLoggedInText() {
        return page.locator(loggedInText).innerText();
    }
	
    public void clickProduct(){
     page.locator(products).click();
	
    }
}
