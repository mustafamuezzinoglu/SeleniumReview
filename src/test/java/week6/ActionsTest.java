package week6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import week5.TestBase;

public class ActionsTest extends TestBase {

    // hover
    @Test
    public void testActions() {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement hover = driver.findElement(By.id("sub-menu"));
        Actions action = new Actions(driver);
        action.moveToElement(hover).perform();
        driver.findElement(By.id("link2")).click();
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    // double click
    @Test
    public void testActions2() {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement doubleClick = driver.findElement(By.id("double-click"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClick).perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You double clicked me!!!, You got to be kidding me");
        alert.accept();
    }

    // double click in chain
    @Test
    public void testActions3() {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement doubleClick = driver.findElement(By.id("double-click"));
        Actions action = new Actions(driver);
        action.moveToElement(doubleClick).perform();
        action.doubleClick().perform();
//      action.moveToElement(doubleClick).doubleClick().perform();
        BrowserUtils.sleep(3);

    }

    // drag and drop
    @Test
    public void testActions4() {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        action.dragAndDrop(source, target).perform();
        BrowserUtils.sleep(3);
    }

    // keyboard actions
    @Test
    public void testActions5() {
        driver.get("https://practice.cydeo.com/key_presses");
        Actions action = new Actions(driver);
        WebElement result = driver.findElement(By.id("result"));

        action.sendKeys(Keys.SPACE).perform();
        BrowserUtils.sleep(2);
        Assert.assertEquals(result.getText(), "You entered: SPACE");


        action.sendKeys(Keys.ESCAPE).perform();
        BrowserUtils.sleep(2);
        Assert.assertEquals(result.getText(), "You entered: ESCAPE");

        action.sendKeys(Keys.SHIFT).perform();
        BrowserUtils.sleep(2);
        Assert.assertEquals(result.getText(), "You entered: SHIFT");

        action.sendKeys(Keys.TAB).perform();
        BrowserUtils.sleep(2);
        Assert.assertEquals(result.getText(), "You entered: TAB");

        action.sendKeys("H").perform();
        BrowserUtils.sleep(2);
        Assert.assertEquals(result.getText(), "You entered: H");
    }

}
