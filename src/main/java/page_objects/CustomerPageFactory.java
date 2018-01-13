package page_objects;

import org.openqa.selenium.WebDriver;
import utils.AbstractPageFactory;

public class CustomerPageFactory extends AbstractPageFactory {

    @Override
    public CustomerPage createPage(WebDriver driver) {
        return new CustomerPage(driver);
    }
}
