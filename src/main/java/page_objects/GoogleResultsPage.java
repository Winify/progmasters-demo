package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

class GoogleResultsPage {

    @FindBy(css = "h3.r")
    private List<WebElement> h3results;

    GoogleResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    void clickOnFirstResult() {
        this.h3results.get(0).click();
    }
}
