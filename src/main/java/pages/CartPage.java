package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodsHandel;


public class CartPage extends MethodsHandel {

    public CartPage(WebDriver driver) {
        super(driver);
    }

   private final By deleteButton= By.cssSelector(".continue-shopping-button");

    public void ClickOnDeleteButton(){
        click(deleteButton);
    }
}
