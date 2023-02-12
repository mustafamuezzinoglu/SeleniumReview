package week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueButton = driver.findElement(By.id("blue"));
        WebElement redButton = driver.findElement(By.id("red"));
        redButton.click();
        Thread.sleep(2000);
        blueButton.click();

        System.out.println("redButton.isDisplayed() = " + redButton.isDisplayed()); //true
        System.out.println("redButton.isSelected() = " + redButton.isSelected()); //
        System.out.println("redButton.getText() = " + redButton.getText()); //it gives empty because its text in the label tag you have create an another locator
        System.out.println("redButton.isEnabled() = " + redButton.isEnabled()); //true

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        int countIsEnabled=0;
        int countIsDisabled=0;
        for (WebElement eachRadioButton : radioButtons) {
            eachRadioButton.click();
            Thread.sleep(1000);
            if (eachRadioButton.isEnabled()) {
                countIsEnabled++;
            } else {
                countIsDisabled++;
            }
            System.out.println("eachRadioButton.isEnabled() = " + eachRadioButton.isEnabled());
        }
        System.out.println("countIsEnabled = " + countIsEnabled);
        System.out.println("countIsDisabled = " + countIsDisabled);


    }
}
