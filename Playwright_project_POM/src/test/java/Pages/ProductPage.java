package Pages;

import com.microsoft.playwright.Page;

public class ProductPage {

	private Page page;
	
    private String Search = "input[id='search_product']";
    private String Searchbuttonclick = "button[id='submit_search']";
    private String Menexpand = "a[href='#Men']";
    private String Tshirts = "a[href='/category_products/3']";
    private String Viewdetails = "a[href='/product_details/2']";
    private String Quantity = "//input[@id='quantity']";
    private String Addtocart = "button[class='btn btn-default cart']";
    private String ContinueShoppingbutton = "button[class='btn btn-success close-modal btn-block']";
    private String Reviewwritename = "input[id='name']";
    private String Reviewwritemail = "input[id='email']";
    private String Reviewwritfeedback = "textarea[id='review']";
    private String Reviewwritbutton = "button[id='button-review']";
	
 
    public ProductPage(Page page) {
        this.page = page;
    }
    
	public void getSearch(String productName) {
		page.locator(Search).fill(productName);
		
	}

	public void getSearchbuttonclick() {
		page.locator(Searchbuttonclick).click();
	}
	
	public void getMenexpand() {
		page.locator(Menexpand).click();
	}
	
	public void getTshirts() {
		page.locator(Tshirts).click();
	}
	
	public void getViewdetails() {
		page.locator(Viewdetails).click();
	}
	
	public void enterQuantity(String quantity) {
	    page.locator(Quantity).fill(quantity);
	}
   
	public void getAddtocart() {
		page.locator(Addtocart).click();
	}
	
	public void getContinueShoppingbutton() {
		page.locator(ContinueShoppingbutton).click();
	}
	
	public void getReviewwritename(String name) {
		page.locator(Reviewwritename).fill(name);
		
	}
	
	public void getReviewwritemail(String email) {
		page.locator(Reviewwritemail).fill(email);
		
	}
	
	public void getReviewwritfeedback(String feedback) {
		page.locator(Reviewwritfeedback).fill(feedback);
		
	}
	
	public void getReviewwritsubmitbutton() {
		page.locator(Reviewwritbutton).click();
		
	}
}
