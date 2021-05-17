package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class HomePageTests extends TestBase{

    HomePage homepage;
    ProductPage productPage;
    @BeforeMethod
    public void pageInit()
    {
        homepage = PageFactory.initElements(driver,HomePage.class);
        productPage = PageFactory.initElements(driver,ProductPage.class);
    }
    @Test
    public void userCanSelectProductInMenuTest()
    {
        homepage.selectCategory();
        homepage.selectProduct();
        Assert.assertTrue(productPage.isItProductPage());
    }
    @Test
    public void selectLanguageTest() throws InterruptedException {
        homepage.openComboBoxLanguages();
        homepage.selectLanguage();
        Assert.assertTrue(homepage.isSelectedLangugePage());
    }
}
