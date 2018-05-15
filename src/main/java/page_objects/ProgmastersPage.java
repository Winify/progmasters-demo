package page_objects;

import org.openqa.selenium.WebDriver;

public class ProgmastersPage {

    public static ProgmastersGooglePage navigateToGoogle(WebDriver driver) {
        driver.navigate().to("https://www.google.com");

        return new ProgmastersGooglePage(driver);
    }
}
