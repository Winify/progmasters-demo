package progmasters;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page_objects.PhpTravelsAdminPage;
import utils.TestUtils;

public class PhpTravelsLoginTest extends TestUtils {

    String email = "admin@phptravels.com";
    String password = "demoadmin";

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String browserType) {
        System.out.println("SETUP - [" + browserType + "] Böngésző megnyitása");
        setUpDriver(browserType);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }

    @Test
    public void testPhpTravelsLogin() throws InterruptedException {

        driver.get("https://www.phptravels.net/admin");
        PhpTravelsAdminPage page = new PhpTravelsAdminPage(driver);

        Thread.sleep(1000);
        page.login(email, password);

        Thread.sleep(2000);
        Assert.assertEquals(page.userText.getText(), "Super Admin");

    }
}
