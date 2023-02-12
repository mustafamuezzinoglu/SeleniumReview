package week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); if we dont use this line we will get  no such element because the text is loading 5 seconds so
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //if we use it auto wait to 10 seconds
        driver.get("https://practice.cydeo.com/dynamic_loading/4");

        WebElement text = driver.findElement(By.cssSelector("div#finish>h4"));
        System.out.println("text.getText() = " + text.getText());


    }
}
