package page_objects;

import org.openqa.selenium.WebDriver;
import utils.AbstractPageFactory;

public class AdministratorPageFactory extends AbstractPageFactory {
    @Override
    public AdministratorPage createPage(WebDriver driver) {
        return new AdministratorPage(driver);
    }
}
