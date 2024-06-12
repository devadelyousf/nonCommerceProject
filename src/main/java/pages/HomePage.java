package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandel;

public class HomePage extends MethodsHandel {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By loginLink=By.cssSelector(".ico-login");

    private final By digitalDownloadsLink=By.cssSelector(".title a[href=\"/digital-downloads\"]");


    public DigitalDownloadPage clickOnDigitalDownloadsLink(){
        click(digitalDownloadsLink);
        return new DigitalDownloadPage(driver);
    }

    public LoginPage clickOnLoginButton(){
        click(loginLink);
        return new LoginPage(driver);
    }
}
