import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AssertionsExample {
    WebDriver driver;

    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    void logoTest()
    {
        WebElement logo = driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
    }

    @Test(priority = 2)
    void homePageTitle()
    {
        String title =  driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title is not matched");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }

}
