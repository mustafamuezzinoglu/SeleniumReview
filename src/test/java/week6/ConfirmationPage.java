package week6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ConfirmationPage {

    public ConfirmationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "subheader")
    public WebElement text;
}
