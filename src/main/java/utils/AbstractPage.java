package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public abstract class AbstractPage {

    protected final WebDriver driver;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void switchToNextWindow(WebDriver driver) {

        Set handles = driver.getWindowHandles();

        driver.close();
        driver.switchTo().window((String) handles.toArray()[1]);
    }

}
