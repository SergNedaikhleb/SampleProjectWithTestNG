package testNGParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataParallel {

    @DataProvider(parallel=true)
    public Object[][] getData() {
        return new Object[][]{{"test 1"}, {"test 2"}, {"test 3"}};
    }


     @Test(dataProvider="getData")
     public void test_01(String value) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("http://www.w3schools.com/");
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/i")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id='gsc-i-id1']")).sendKeys(value);
            Thread.sleep(5000);

         driver.quit();
        }
    }

