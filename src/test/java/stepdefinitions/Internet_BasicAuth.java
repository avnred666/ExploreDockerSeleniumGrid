package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasicAuthPage;
import pages.HomePage;
import utilities.BaseTests;
import utilities.ConfigProperties;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static utilities.BaseTests.driver;

public class Internet_BasicAuth  {

    ConfigProperties config = new ConfigProperties();
    HomePage homePage;
    BasicAuthPage basicAuthPage;
    BaseTests baseTests = new BaseTests();


    public Internet_BasicAuth() throws IOException {
    }

    @Given("user launches website")
    public void user_launches_website() throws IOException {
        baseTests.browserSetup();
        homePage = PageFactory.initElements(driver,HomePage.class);
        basicAuthPage = PageFactory.initElements(driver,BasicAuthPage.class);
        driver.get(config.getURL());
    }
    @And("user clicks on Basic Auth link")
    public void user_clicks_on_basic_auth_link() throws InterruptedException {
        homePage.clickBasicAuthLink();
        Thread.sleep(1000);
    }
    @And("user enters username and password")
    public void user_enters_username_and_password() {
        driver.get("https://"+config.getUsername()+":"+config.getPassword()+"@the-internet.herokuapp.com/basic_auth");
    }
    @Then("user sees the message {string}")
    public void user_sees_the_message(String message) {
        assertEquals(basicAuthPage.getMessage(),message);
        baseTests.browserTearDown();
    }


}
