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
private final By hoverOnComputerLink=
        By.xpath("//ul[@class=\"top-menu notmobile\"]//a[contains(text(), 'Computers')]");
private final By clickOnDesktopLink=
        By.xpath("//ul[@class=\"top-menu notmobile\"]//a[contains(text(), 'Desktops')]");
    public DigitalDownloadPage clickOnDigitalDownloadsLink(){
        click(digitalDownloadsLink);
        return new DigitalDownloadPage(driver);
    }
    public LoginPage clickOnLoginButton(){
        click(loginLink);
        return new LoginPage(driver);
    }

private   void hoverOverComputer(){
        hoverOnElement(hoverOnComputerLink);
}
private void clickOnDesktop(){
        clickWithAction(clickOnDesktopLink);
}
public DesktopProductPage selectDesktopProducts(){
        hoverOverComputer();
        clickOnDesktop();
        return new DesktopProductPage(driver);
}


}
