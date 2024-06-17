package products;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.DigitalDownloadPage;
import pages.ProductDetails;

public class ProductTest extends BaseTest {
    @Test
    public void AddProductInCart() {
   DigitalDownloadPage digitalDownloadPage= homePage.clickOnDigitalDownloadsLink();
  ProductDetails productDetails= digitalDownloadPage.clickAddToCardLink();
  productDetails.ClickAddCardButton();
  productDetails.ClickOnCloseButton();
 CartPage cartPage= productDetails.ClickOnShoppingLink();
 cartPage.ClickOnDeleteButton();
}}
