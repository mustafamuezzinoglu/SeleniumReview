package week5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeReview extends TestBase {

    // providing iframe id
    @Test
    public void test1() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();
    }

    // locate iframe then provide the web element
    @Test
    public void test2() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        WebElement iframe = driver.findElement(By.name("iframeResult"));  //locate iframe
        driver.switchTo().frame(iframe); //then provide element
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();
    }

    // provide index of that frame
    @Test
    public void test3() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.switchTo().frame(1); //by using index number
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();

    }
}
