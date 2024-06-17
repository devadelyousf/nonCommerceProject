package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.MethodsHandel;

import java.time.Duration;

public class BillingAddressPage extends MethodsHandel {
    Select select;
    public BillingAddressPage(WebDriver driver) {
        super(driver);
    }
    private final By firstNameInput=By.xpath("//input[@name=\"BillingNewAddress.FirstName\"]");
    private final By lastNameInput=By.xpath("//input[@name=\"BillingNewAddress.LastName\"]");
    private final By email=By.xpath("//input[@name=\"BillingNewAddress.Email\"]");
    private final By country=By.xpath("//div[@class=\"inputs\"]//select[@name=\"BillingNewAddress.CountryId\"]");
    private final By city=By.xpath("//input[@name=\"BillingNewAddress.City\"]");
    private final By address =By.xpath("//input[@name=\"BillingNewAddress.Address1\"]");
    private final By postalCodeZip=By.xpath("//input[@name=\"BillingNewAddress.ZipPostalCode\"]");
    private final By phoneNumber=By.xpath("//input[@name=\"BillingNewAddress.PhoneNumber\"]");
    private final By continueButton=
            By.xpath("//div[@id=\"billing-buttons-container\"]//button[@class=\"button-1 new-address-next-step-button\"]");
private final By continueOrder1=
        By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 shipping-method-next-step-button\"]");
private final By paymentMethodContinueButton=
        By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 payment-method-next-step-button\"]");
private final By paymentInfoContinueButton=
        By.xpath("//div[@id=\"payment-info-buttons-container\"]//button");
private final By finalStep=
        By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 confirm-order-next-step-button\"]");
private final By validationMessageOrder=
        By.xpath("//div[@class=\"title\"]//strong");
    public void sendFirstname(String firstname){
        sendKeys(firstNameInput,firstname);
    }
    public void sendLastname(String lastname){
        sendKeys(lastNameInput,lastname);
    }
    public void sendEmail(String emailAddress){
        sendKeys(email,emailAddress);
    }
    public void sendCountry(String countryName){
       select=new Select(driver.findElement(country));
       select.selectByVisibleText(countryName);
    }
    public void sendCity(String cityName){
        sendKeys(city,cityName);
    }
    public void sendAddress(String addressName){
        sendKeys(address,addressName);
    }
    public void sendPostalCode(String postal){
        sendKeys(postalCodeZip,postal);
    }
    public void sendPhoneNumber(String phone){
        sendKeys(phoneNumber,phone);
    }
    public void clickButtonSubmit(){
        click(continueButton);
    }
    public void clickingWithContinueButton(){
        click(continueOrder1);
    }
    public void clickOnPaymentMethodContinueButton(){
        click(paymentMethodContinueButton);
    }
    public void clickOnPaymentInfoContinueButton(){
        click(paymentInfoContinueButton);
    }
    public void finalStepInOrder(){

        click(finalStep);
    }
    public String getSuccessfulMessage(){
      return getText(validationMessageOrder);
    }
}
