package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductPage;

public class ProductPageTest extends BaseTest {

    ProductPage productPage;

    @Test
    public void verifyProduct() {
    	
    page.navigate("https://automationexercise.com/products");

        productPage = new ProductPage(page);
 
        productPage.getSearch("Tshirt");

        productPage.getSearchbuttonclick();
        
        productPage.getMenexpand();

        productPage.getViewdetails();
 
        productPage.enterQuantity("5");
        
        productPage.getAddtocart();
        
        productPage.getContinueShoppingbutton();
        
        productPage.getAddtocart();
        
        productPage.getContinueShoppingbutton();
        
        productPage.getReviewwritename("Ankit Raj");
        
        productPage.getReviewwritemail("Araj77@gmail.com");
        
        productPage.getReviewwritfeedback("Thinking about work again, what feels most urgent to get clarity on?");
        
        productPage.getReviewwritsubmitbutton();
    }
}