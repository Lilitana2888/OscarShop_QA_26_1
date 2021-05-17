package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends PageBase{

    public HomePage(WebDriver dr) {
        super(dr);
    }
    @FindBy(className = "dropdown-submenu")
    WebElement subMenuBooks;
    @FindBy(className = "product_pod")
    List<WebElement> productlist;

    public void selectCategory() {
        subMenuBooks.click();
    }

    public void selectProduct() {
        productlist.get(0).click();
    }

    @FindBy(xpath = "//select[@name='language']")
    WebElement comboBoxLanguages;

    public void openComboBoxLanguages() throws InterruptedException {
        comboBoxLanguages.click();

    }
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement GoButton;

    public void selectLanguage() {
        Select select = new Select(comboBoxLanguages);
        select.selectByValue("ru");
        GoButton.click();


    }

    public boolean isSelectedLangugePage() {

        String url = driver.getCurrentUrl();
        return  url.endsWith("/ru/");// can use format and change languages

    }
}
