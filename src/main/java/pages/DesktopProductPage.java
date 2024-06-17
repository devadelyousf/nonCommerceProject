package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandel;

public class DesktopProductPage extends MethodsHandel {
    public DesktopProductPage(WebDriver driver) {
        super(driver);
    }

    private final By clickAddToCardButton=
            By.xpath("(//button[contains(text(),\"Add to cart\")])[2]");
    private final By closeButton=
            By.xpath("//div[@id=\"bar-notification\"]//a[contains(text(),\"cart\")]");
    private final By hoverOnParagraph=
            By.xpath("//div[@id=\"bar-notification\"]");
    private void clickOnShoppingCart(){
        click(closeButton);
    }
    private void clickToAddItemToCart(){
        click(clickAddToCardButton);
    }

    private void hoverOnShoppingCart(){
        hoverOnElement(hoverOnParagraph);
    }

public ShoppingCartPage goToCard(){
    clickToAddItemToCart();
    hoverOnShoppingCart();
    clickOnShoppingCart();
    return new ShoppingCartPage(driver);
}
}
