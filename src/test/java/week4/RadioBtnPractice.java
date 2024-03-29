package week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioBtnPractice {

    public static void main(String[] args) {

        clickbtn("Mail");


    }

    public static void clickbtn(String btnName) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.tutorialstonight.com/html-radio-button");

        WebElement btn = null;
        switch (btnName) {
            case ("Email"):
                btn = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
                break;
            case ("Phone"):
                btn = driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
                break;
            case ("Mail"):
                btn = driver.findElement(By.xpath("(//input[@type='radio'])[6]"));
                break;
        }

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btn);

    }
}