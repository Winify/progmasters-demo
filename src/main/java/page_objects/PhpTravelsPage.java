package page_objects;

import org.openqa.selenium.WebDriver;
import utils.AbstractPage;

import static org.testng.Assert.assertEquals;

public class PhpTravelsPage extends AbstractPage {

    private PhpTravelsPage(WebDriver driver) {
        super(driver);
    }

    public static PhpTravelsPage get(WebDriver driver) {
        String url = "http://phptravels.com/demo/";
        driver.get(url);

        assertEquals(driver.getTitle(), "PHPTRAVELS | Demo");

        return new PhpTravelsPage(driver);

    }

    public AbstractPage navigateToPage(PhpTravelsLinks link) {

        driver.findElement(link.getBy()).click();
        switchToNextWindow(driver);

        return link.toPageFactory(driver);
    }
}
