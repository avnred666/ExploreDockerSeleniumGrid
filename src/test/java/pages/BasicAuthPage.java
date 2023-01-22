package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.UIUtilities;

public class BasicAuthPage extends UIUtilities {

    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "p")
    WebElement message;

    public String getMessage(){
        return message.getText();
    }
}
