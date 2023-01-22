package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.UIUtilities;

public class HomePage extends UIUtilities {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Basic Auth')]")
    WebElement basicAuthLink;

    @FindBy(xpath = "//a[contains(text(),'Hovers')]")
    WebElement hoversLink;

    public void clickBasicAuthLink(){
        basicAuthLink.click();
    }

    public void clickHoversLink(){
        hoversLink.click();
    }
}
