package week5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandleReview extends TestBase {

    @Test
    public void testWindowsHandleReview() {

        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
        driver.findElement(By.linkText("new window")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
//            if (driver.getTitle().equals("g")) {
//                break;
//            }
        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }

}
