package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Page;

import static org.testng.Assert.assertEquals;

public class PhpTravelsPage extends Page {

    private PhpTravelsPage(WebDriver driver) {
        super(driver);
    }

    public static PhpTravelsPage get(WebDriver driver) {
        String url = "http://phptravels.com/demo/";
        driver.get(url);

        assertEquals(driver.getTitle(), "PHPTRAVELS | Demo");

        return new PhpTravelsPage(driver);

    }

    public void navigateToPage(PhpTravelsLinks link) {
        driver.findElement(By.cssSelector("[href='" + link.getHref() + "']")).click();

        switchToNextWindow(driver);
    }
}
