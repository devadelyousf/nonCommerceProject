package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandel;

public class DigitalDownloadPage extends MethodsHandel {
    WebDriver driver;
    public DigitalDownloadPage(WebDriver driver) {
        super(driver);
    }

    private final By addToCard=By.cssSelector("div[data-productid=\"35\"] .product-box-add-to-cart-button");

    public ProductDetails clickAddToCardLink(){
        click(addToCard);
        return new ProductDetails(driver);
    }
}
