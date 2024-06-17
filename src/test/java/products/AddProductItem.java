package products;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BillingAddressPage;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertTrue;

public class AddProductItem extends BaseTest {
    public void functionOfBillingPage() throws FileNotFoundException, InterruptedException {
        var desktopProductPage = homePage.selectDesktopProducts();
        var shoppingCartPage = desktopProductPage.goToCard();
        var checkoutAsGuestPage = shoppingCartPage.submitOrderWithCheckboxButton();
        checkoutAsGuestPage.clickOnCheckAsGuest();
        BillingAddressPage billingAddressPage=new BillingAddressPage(driver);
        billingAddressPage.sendFirstname(dataModelFromJson().Register.Firstname);
        billingAddressPage.sendLastname(dataModelFromJson().Register.Lastname);
        billingAddressPage.sendEmail(dataModelFromJson().Register.Email);
        billingAddressPage.sendCountry("Egypt");
        billingAddressPage.sendCity(dataModelFromJson().Register.City);
        billingAddressPage.sendAddress(dataModelFromJson().Register.Address);
        billingAddressPage.sendPostalCode(dataModelFromJson().Register.Postalcode);
        billingAddressPage.sendPhoneNumber(dataModelFromJson().Register.Phonenumber);
        billingAddressPage.clickButtonSubmit();
        billingAddressPage.clickingWithContinueButton();
        billingAddressPage.clickOnPaymentMethodContinueButton();
        billingAddressPage.clickOnPaymentInfoContinueButton();
        billingAddressPage.finalStepInOrder();
        Thread.sleep(3000);
        String expectedResult=dataModelFromJson().OrderValidation;
        String actualResult=billingAddressPage.getSuccessfulMessage();
        System.out.println(actualResult);
        assertTrue(expectedResult.contains(actualResult));
    }



    @Test
    public void AddItemInCart() throws FileNotFoundException, InterruptedException {
        functionOfBillingPage();
    }
}
