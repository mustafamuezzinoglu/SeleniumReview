package week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.WaitUtility;
import week5.TestBase;

public class UploadTest extends TestBase {

    @Test
    public void test1() {

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        String path = "C:\\Users\\Asus\\IdeaProjects\\SeleniumReview\\src\\test\\java\\week6\\test document";
        WebElement uploadLink = Driver.getDriver().findElement(By.name("upload"));

        uploadLink.sendKeys(path);
        WaitUtility.sleep(2);
    }
}