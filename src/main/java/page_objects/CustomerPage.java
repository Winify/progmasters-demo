package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPage;

public class CustomerPage extends AbstractPage {

    @FindBy(xpath = "asd")
    public WebElement loginField;

    CustomerPage(WebDriver driver) {
        super(driver);
    }
}
