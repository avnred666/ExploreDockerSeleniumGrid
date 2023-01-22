package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.HoversPage;
import utilities.BaseTests;
import utilities.ConfigProperties;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static utilities.BaseTests.driver;

public class Internet_Hovers{
    ConfigProperties config = new ConfigProperties();
    HomePage homePage;
    HoversPage hoversPage;
    BaseTests baseTests = new BaseTests();


    public Internet_Hovers() throws IOException {
    }

    @When("user clicks on Hovers link")
    public void userClicksOnHoversLink() throws IOException {
        baseTests.browserSetup();
        homePage = PageFactory.initElements(driver,HomePage.class);
        hoversPage = PageFactory.initElements(driver, HoversPage.class);
        driver.get(config.getURL());
        homePage.clickHoversLink();
    }

    @And("user hovers over first figure")
    public void userHoversOverFirstFigure() {
        hoversPage.hoverOverFigure1(driver);
    }

    @Then("the text returned is {string}")
    public void theTextReturnedIs(String message) {
        assertEquals(hoversPage.getFigureText(),message);
        baseTests.browserTearDown();
    }
}
