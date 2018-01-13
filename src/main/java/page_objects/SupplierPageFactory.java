package page_objects;

import org.openqa.selenium.WebDriver;
import utils.AbstractPageFactory;

public class SupplierPageFactory extends AbstractPageFactory {
    @Override
    public SupplierPage createPage(WebDriver driver) {
        return new SupplierPage(driver);
    }
}
