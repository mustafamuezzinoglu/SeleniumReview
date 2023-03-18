package week5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.WaitUtility;

public class AlertReview extends TestBase {

    // information alert
    @Test
    public void test1() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    // confirmation alert
    @Test
    public void test2() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
    }

    // confirmation alert
    @Test
    public void test3() {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        driver.findElement(By.xpath("//input[@name='prompt']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        WaitUtility.sleep(3);
        alert.sendKeys("mustafa");
        WaitUtility.sleep(3);
//        alert.accept();
    }
}
