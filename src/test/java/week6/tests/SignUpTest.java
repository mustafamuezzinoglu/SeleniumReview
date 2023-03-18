package week6.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import week6.ConfirmationPage;
import week6.pages.SignUpPage;

import java.util.concurrent.TimeUnit;

public class SignUpTest {

    SignUpPage signUpPage = new SignUpPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();

    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

//        first way
//        signUpPage.nameInput.sendKeys("John");
//        signUpPage.emailInput.sendKeys("abc@abc.com");
//        signUpPage.btn.click();

//        second way

        signUpPage.login("John", "abc@abc.com");

        String actualText = confirmationPage.text.getText();
        String expectedText = "Thank you for signing up. Click the button below to return to the home page.";
        Assert.assertEquals(actualText, expectedText);

        driver.close();


    }
}
