package testNGParallelExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestWebsite extends BaseClass {

    @Test
    public void test_01() throws InterruptedException {
        driver.get("http://www.w3schools.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='main']/div[2]/a[2]")).click();
        Thread.sleep(5000);
    }

    @Test
    public void test_02() throws InterruptedException {
        driver.get("http://www.w3schools.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='main']/div[2]/a[2]")).click();
        Thread.sleep(5000);
    }
}
