package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AbstractPage;
import utils.AbstractPageFactory;

import java.util.function.Supplier;

public enum PhpTravelsLinks {
    CustomerLink(By.cssSelector("[href='//www.phptravels.net']"), CustomerPageFactory::new),
    AdministratorLink(By.cssSelector("[href='//www.phptravels.net/admin']"), AdministratorPageFactory::new),
    SupplierLink(By.cssSelector("[href='//www.phptravels.net/supplier']"), SupplierPageFactory::new);

    private By by;
    private Supplier<AbstractPageFactory> pageFactorySupplier;

    PhpTravelsLinks(By by, Supplier<AbstractPageFactory> pageFactorySupplier) {
        this.by = by;
        this.pageFactorySupplier = pageFactorySupplier;
    }

    public By getBy() {
        return by;
    }

    public AbstractPage toPageFactory(WebDriver driver) {
        return pageFactorySupplier.get().createPage(driver);
    }
}
