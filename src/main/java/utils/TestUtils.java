package utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestUtils {

    protected WebDriver driver = null;

    protected void setUpDriver(String browserType) {
        driver = BrowserSetup.getLocalDriver(browserType);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

}
