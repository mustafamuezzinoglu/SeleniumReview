package week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewCssAndXpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

/*
1 css locator
tagName[attributeName='value']
tagName.classValue and  tagName#idValue

div[type='text']
div#radio using for id value
div.radio using for class value

use > sign to go to child from parent
div.radio > h1 first way use >
div.radio  h1 second way is using a space

we can not go from child to parent

nth-of-type(number)

2.xpath locator
1) absoulute xpath -- start from the first element which is html than got ot your element
2) relative xpath -- start from whereever you want to go








 */



    }
}
