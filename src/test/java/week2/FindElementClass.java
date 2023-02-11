package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/");

//        findElement
//       this method is using locator to locate web elements
//        we have 8 types of locators
//        1.id

//        WebElement foot = driver.findElement(By.id("page-footer"));
//        System.out.println("foot.getText() = " + foot.getText());
//        System.out.println("foot.getTagName() = " + foot.getTagName());

//        2.link text

//        WebElement brokenImages = driver.findElement(By.linkText("Broken Images"));
//        System.out.println("brokenImages.getText() = " + brokenImages.getText());
//        brokenImages.click();

//      3.partial link text
//        WebElement checkBox = driver.findElement(By.partialLinkText("Check"));
//        System.out.println("checkBox.getText() = " + checkBox.getText());
//        checkBox.click();

//        WebElement dynamicLoading = driver.findElement(By.partialLinkText("Dynamic"));
//        System.out.println("dynamic.getText() = " + dynamicLoading.getText()); //it give only first match

//       4. name

//        WebElement name = driver.findElement(By.name("viewport"));
//        System.out.println("name.getTagName() = " + name.getTagName());

//        5. class name

//        WebElement className = driver.findElement(By.className("h1"));
//        System.out.println("className.getTagName() = " + className.getTagName());
//        System.out.println("className.isDisplayed() = " + className.isDisplayed());
//        System.out.println("className.getText() = " + className.getText());

//        6.tag name

//        WebElement tagTitle = driver.findElement(By.tagName("h1"));
//        System.out.println("tagTitle.getText() = " + tagTitle.getText());
//        System.out.println("tagTitle.getTagName() = " + tagTitle.getTagName());

//        WebElement abtest = driver.findElement(By.linkText("A/B Testing"));
//        System.out.println("abtest.getText() = " + abtest.getText());

//        WebElement form = driver.findElement(By.linkText("Form Authentication"));
//        form.click();
//        WebElement inputUserName= driver.findElement(By.name("username"));
//        inputUserName.sendKeys("admin");






    }
}
