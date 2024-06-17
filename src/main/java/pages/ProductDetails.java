package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandel;

public class ProductDetails extends MethodsHandel {
    WebDriver driver;
    public ProductDetails(WebDriver driver) {
        super(driver);
    }


    private final By addToCardLink=By.cssSelector(".add-to-cart-panel button");
    private final By shoppingCartButton=By.cssSelector(".close");
    private final By shoppingCart=By.cssSelector(".ico-cart");
    public void ClickAddCardButton(){
        click(addToCardLink);
    }

    public void ClickOnCloseButton(){
       click(shoppingCartButton);
    }
    public CartPage ClickOnShoppingLink(){
       click(shoppingCart);
        return new CartPage(driver);
    }

}
