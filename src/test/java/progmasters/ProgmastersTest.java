package progmasters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.ProgmastersGooglePage;
import page_objects.ProgmastersPage;

public class ProgmastersTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void shouldGoToProgmastersHomepage(){

        ProgmastersGooglePage page = ProgmastersPage.navigateToGoogle(driver);
        page.searchFor("Progmasters");

        Assert.assertEquals(driver.getTitle(), "PROGmasters - Kezdj új életet és legyél programozó!");
    }
}
