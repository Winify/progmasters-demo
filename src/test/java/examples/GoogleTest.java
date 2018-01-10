package examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page_objects.GooglePage;
import utils.TestUtils;

import static org.testng.Assert.assertEquals;

public class GoogleTest extends TestUtils {

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String browserType) {
        System.out.println("SETUP - [" + browserType + "] Böngésző megnyitása");
        setUpDriver(browserType);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            System.out.println("TEARDOWN - Böngésző leállítása");
            driver.quit();
        }
    }

    @Test
    public void testGoogleSearch() {
        System.out.println("TEST - Google oldalra lépés");
        GooglePage page = GooglePage.get(driver);

        System.out.println("TEST - Keresés indítása");
        page.searchFor("Selenium Testing");

        System.out.println("ASSERT - Oldal címének ellenőrzése");
        assertEquals(driver.getTitle(), "Selenium Testing - Google-keresés");
    }
}
