package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandel;

public class LoginPage extends MethodsHandel {
    public LoginPage(WebDriver driver) {
        super(driver);

    }

    private final By emailInput=By.id("Email");
    private final By passwordInput=By.id("Password");
    private final By loginButton=By.cssSelector(".login-button");
    private final By messageLogin=By.cssSelector(".message-error ");


public  String messageLoginValidation(){
  return   getText(messageLogin);
}
    public void sendEmail(String email){
        sendKeys(emailInput,email);
    }
    public void sendPassword(String password){
        sendKeys(passwordInput,password);
    }
    public void clickOnLoginButton(){
        click(loginButton);
    }
}
