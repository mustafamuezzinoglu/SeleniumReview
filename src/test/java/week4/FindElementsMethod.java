package week4;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;

public class FindElementsMethod {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

// why findElements() is returning empty list if no matching element?
//        because when we call findElements method it will create an empty list first then to find the web elements. if there are no matching elements list will be keep empty

       List<WebElement> links=  driver.findElements(By.xpath("//li[@class='list-group-item']"));
        System.out.println("links.get(1).getText() = " + links.get(1).getText());
        System.out.println("links.size() = " + links.size());


    }
}