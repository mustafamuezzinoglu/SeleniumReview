package week5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownTest {
    static WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://getbootstrap.com/docs/5.0/forms/select/");
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-select']"));
//        WebElement dropdown1 = driver.findElement(By.xpath("//option[@value='1']")); if we use option as tagname selenium does not locate and give unexpectedtagnameexception
        Select select = new Select(dropdown);
//        Select select1 = new Select(dropdown1); so it doesnt work this select class

        System.out.println("select1.getFirstSelectedOption() = " + select.getFirstSelectedOption().getText());
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println("option.getText " + option.getText());
        }
        select.selectByIndex(1);
        select.selectByVisibleText("Two");
        select.selectByValue("3");
    }

    @Test
    public void test2() {
        driver.get("https://getbootstrap.com/docs/5.0/forms/select/");
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-select']"));
        Select select = new Select(dropdown);

        select.selectByIndex(3);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Three", "Validating Dropdown 4th option");
        Assert.assertFalse(select.isMultiple());
    }


}
