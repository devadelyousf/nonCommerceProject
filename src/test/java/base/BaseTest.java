package base;

import data.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import reader.ReadDataFromJson;
import utils.ScreenRecorderUtil;
import utils.UtilsTests;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    UtilsTests utilsTests;
    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
    }
    @BeforeMethod
    public void goHomePage(Method method) throws Exception {
        ScreenRecorderUtil.startRecord(method.getName());
        driver.get(dataModelFromJson().URL);
    }
    @AfterMethod
    public void afterMethod(Method method) throws Exception {
        utilsTests=new UtilsTests(driver);
        utilsTests.takeScreenShots(method);
        ScreenRecorderUtil.stopRecord();
    }
    @AfterClass
    public void quite(){
        driver.quit();
    }

    protected DataModel dataModelFromJson() throws FileNotFoundException {
     ReadDataFromJson readDataFromJson=new ReadDataFromJson();
        return readDataFromJson.ReadJsonFile();
    }
}
