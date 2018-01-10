package examples;

import org.testng.annotations.*;
import page_objects.PhpTravelsLinks;
import page_objects.PhpTravelsPage;
import utils.TestUtils;

import static org.testng.Assert.assertEquals;

public class PhpTravelsTest extends TestUtils {

    private PhpTravelsPage page;

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

    @BeforeMethod
    public void refreshPage() {
        System.out.println("TEST - PHPTravels oldalra lépés");
        page = PhpTravelsPage.get(driver);
    }

    @Test
    public void testCustomerPage() {
        System.out.println("TEST - Általános felhasználói oldalra lépés");
        page.navigateToPage(driver, PhpTravelsLinks.Customer);

        System.out.println("ASSERT - Oldal url ellenőrzése");
        assertEquals(driver.getCurrentUrl(), "http://www.phptravels.net/");
    }


    @Test
    public void testAdministratorPage() {
        System.out.println("TEST - Adminisztrátor felhasználói oldalra lépés");
        page.navigateToPage(driver, PhpTravelsLinks.Administrator);

        System.out.println("ASSERT - Oldal url ellenőrzése");
        assertEquals(driver.getCurrentUrl(), "http://www.phptravels.net/admin");
    }


    @Test
    public void testSupplierPage() {
        System.out.println("TEST - Támogatói felhasználói oldalra lépés");
        page.navigateToPage(driver, PhpTravelsLinks.Supplier);

        System.out.println("ASSERT - Oldal url ellenőrzése");
        assertEquals(driver.getCurrentUrl(), "http://www.phptravels.net/supplier");
    }
}
