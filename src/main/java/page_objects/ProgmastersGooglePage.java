package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgmastersGooglePage {

    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchForm;

    ProgmastersGooglePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void searchFor(String key) {
        GoogleResultsPage page = search(key);
        page.clickOnFirstResult();
    }

    private GoogleResultsPage search(String key){
        searchForm.sendKeys(key);
        searchForm.submit();


        return new GoogleResultsPage(driver);
    }


    void getElementBy(String by){
        driver.findElement(By.id(by));

    }
}
