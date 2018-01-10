package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Page;

import static org.testng.Assert.assertEquals;

public class GooglePage extends Page {

    @FindBy(name = "q")
    private WebElement searchBar;

    @FindBy(css = "[value='Google-keresés']")
    private WebElement searchBtn;

    private GooglePage(WebDriver driver) {
        super(driver);
    }

    public static GooglePage get(WebDriver driver) {
        String url = "https://www.google.com";
        driver.get(url);

        assertEquals(driver.getTitle(), "Google");

        return new GooglePage(driver);
    }

    public void searchFor(String searchKey) {

        searchBar.clear();
        searchBar.sendKeys(searchKey);
        waitFor(500);

        searchBtn.click();
    }
}
