package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;

public class BaseTests {

    public static WebDriver driver;

    public void browserSetup() throws IOException {
        String browser = System.getProperty("browser");
        if(browser != "" && browser != null) {
            if (browser.equalsIgnoreCase("Chrome")){
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
                driver.manage().window().maximize();
            }
            else if (browser.equalsIgnoreCase("Firefox")) {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);
                driver.manage().window().maximize();
            }

        }

    }

    public void browserTearDown(){
        driver.quit();
    }
}
