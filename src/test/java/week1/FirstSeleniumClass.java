package week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        WebDriver driverChrome = new ChromeDriver();
        WebDriver driverFirefox = new ChromeDriver();

        driverChrome.get("https://practice.cydeo.com/");

        driverFirefox.get("https://google.com");


    }
}
