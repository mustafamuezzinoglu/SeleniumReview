package week6;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import week5.TestBase;

public class ExplicitWaitTest extends TestBase {

    @Test
    public void test1() {
        driver.get("http://practice.cydeo.com/dynamic_loading/3");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf
                (driver.findElement(By.xpath("//button[@type='submit']"))));

        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
    }


}
