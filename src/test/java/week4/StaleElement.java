package week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com/");

//        WebElement gmail = driver.findElement(By.xpath("//a[@aria-label='Gmail']"));
//
//        System.out.println("gmail.getText() = " + gmail.getText());
//
//        driver.navigate().refresh();
//
//        WebElement gmail1 = driver.findElement(By.xpath("//a[@aria-label='Gmail']"));
//        System.out.println("gmail1.getText() = " + gmail1.getText());

        WebElement googleUyg = driver.findElement(By.xpath("//a[@aria-label='Google uygulamaları']"));
        googleUyg.click();

        WebElement drive = driver.findElement(By.cssSelector("a[href='https://drive.google.com/']"));
        drive.click();


    }
}
