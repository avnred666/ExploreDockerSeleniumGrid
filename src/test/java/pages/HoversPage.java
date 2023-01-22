package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.UIUtilities;

public class HoversPage extends UIUtilities {

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='figure'][1]")
    WebElement figure1;

    @FindBy(xpath = "//div[@class='figure'][1]/div/h5")
    WebElement figureText;

    public void hoverOverFigure1(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(figure1).perform();
    }

    public String getFigureText(){
        return figureText.getText();
    }
}

