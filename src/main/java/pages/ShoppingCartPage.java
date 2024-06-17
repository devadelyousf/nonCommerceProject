package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandel;

public class ShoppingCartPage extends MethodsHandel {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    private final By checkBoxItem=
            By.xpath("//div[@class=\"terms-of-service\"]//input[@id=\"termsofservice\"]");
    private final By checkBoxButton=
            By.xpath("//div[@class=\"checkout-buttons\"]//button[@type=\"submit\"]");

    private void clickOnCheckboxButton(){
        click(checkBoxButton);
    }
    private void clickOnCheckBox(){
        click(checkBoxItem);
    }

    public CheckoutAsGuestPage submitOrderWithCheckboxButton(){
        clickOnCheckBox();
        clickOnCheckboxButton();
        return new CheckoutAsGuestPage(driver);
    }
}
