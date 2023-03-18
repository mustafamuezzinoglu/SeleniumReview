package week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        // xpath is another custom locators  we have two types of syntax of xpath

//         1. absolute xpath : it starts with single slash ( / ), starts from html tag, go down the element you want to locate , step by step onr bye one

//        2. relative xpath


//    first method  ---> //tagName[@attributeName='value']
//    second method ---> //tagName[contains(@attribute, 'value’)]
//    third method  ---> //tagName[.='text'] (same as //tagName[text()='text’], . represents text)

//   or you can         //*[@attribute='value’] ( use * when we don't want use tag name)
//                      //*[@*='*']



        /*
        in xpath we also can go from parent to child, use /
         in xpath, we can go from CHILD to PARENT, use /..



         in xpath, we also can use siblings method, to select by siblings

         //option[.='Colorado']/preceding-sibling::option
         //option[.='Colorado']/following-sibling::option

         we can provide index number in [], starting from 1
         //option[.='Colorado']/following-sibling::option[1]

         (//option[.='Colorado']/following-sibling::option)[1]

         */




















    }
}
