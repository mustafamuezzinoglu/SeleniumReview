package week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssLocators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/inputs");

//        syntax of css selectors
//         tagName[attribute='value']

        WebElement input = driver.findElement(By.cssSelector("div[class='large-12 columns']"));
        input.click();

        //2. second way of providing syntax, this one used only for id or className
        //tagName.classValue    or   tagName#id
        // if you use class value, you have to replace the space(if there is) with .

        // sometimes we need to locate one element then go to child element, this time, we have to use > sign
        // div.example>form
        // in the css, we can go from parent to child, but we CAN NOT go from child to parent.

        // using index number in Css locator
        // if we have more than one same type of elements, we can use indexing
        // css locator:nth-of-type(index number)  --> index number is starting from 1
//        if its java index is starting 0 if its html index is starting 1
        // select#state>option:nth-of-type(4)

    }
}
