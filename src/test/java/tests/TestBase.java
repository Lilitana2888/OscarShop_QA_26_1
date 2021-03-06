package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void init(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown()
    {
        driver.quit();
    }
}
