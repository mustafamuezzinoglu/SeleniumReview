package week6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import week5.TestBase;

public class JSExecutorTest extends TestBase {

    @Test
    public void test1() {
        driver.get("https://www.google.com/");
        WebElement googleSearch = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
        WebElement inputbox = driver.findElement(By.cssSelector("div.YacQv"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','muezzinoglu')", inputbox);
        js.executeScript("arguments[0].click();", googleSearch);

    }

    @Test
    public void test2() {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement enable = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        enable.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('value', 'Cydeo10')", input);
        BrowserUtils.sleep(5);
        WebElement input = driver.findElement(By.xpath("//form[@id='input-example']/input"));
        input.sendKeys("Cydeo10");
        // TODO: 26-Feb-23  
    }
}
