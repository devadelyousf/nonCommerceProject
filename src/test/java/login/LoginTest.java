package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LoginTest extends BaseTest {
    @Test
    public void LoginWithEmailAndPassword() throws FileNotFoundException, InterruptedException {
     LoginPage loginPage= homePage.clickOnLoginButton();
     loginPage.sendEmail(readDataFromJson.ReadJsonFile().Login.ValidCredentials.Username);
     loginPage.sendPassword(readDataFromJson.ReadJsonFile().Login.ValidCredentials.Password);
     loginPage.clickOnLoginButton();
    }
}
