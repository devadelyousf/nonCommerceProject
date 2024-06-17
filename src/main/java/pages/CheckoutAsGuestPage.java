package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandel;

public class CheckoutAsGuestPage extends MethodsHandel {
    public CheckoutAsGuestPage(WebDriver driver) {
        super(driver);
    }
    private final By checkoutAsGuest=
            By.xpath("//button[@class=\"button-1 checkout-as-guest-button\"]");
    public BillingAddressPage clickOnCheckAsGuest(){
        click(checkoutAsGuest);
        return new BillingAddressPage(driver);
    }
}
