package login;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.io.FileNotFoundException;


public class AssertLoginMessageTest extends BaseTest {

    @DataProvider
    public Object[][] ProvideDateLoginMessage() throws FileNotFoundException {
        return dataModelFromJson().AssertLogin;
    }

    @Test(dataProvider = "ProvideDateLoginMessage")
    public void LoginWithEmailAndPassword(String username,String password) throws FileNotFoundException {
        LoginPage loginPage= homePage.clickOnLoginButton();
        loginPage.sendEmail(username);
        loginPage.sendPassword(password);
        loginPage.clickOnLoginButton();
        String expectedResult=dataModelFromJson().MessageWithLogin;
        String actualResult=loginPage.messageLoginValidation();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
