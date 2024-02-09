package base;

import data.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
    }
    @BeforeMethod
    public void goHomePage() throws FileNotFoundException {
        driver.get(dataModelFromJson().URL);
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
