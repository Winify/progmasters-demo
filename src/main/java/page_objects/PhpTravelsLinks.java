package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AbstractPage;

import java.util.function.Function;

public enum PhpTravelsLinks {
    CustomerLink(By.cssSelector("[href='//www.phptravels.net']"), CustomerPage::new),
    AdministratorLink(By.cssSelector("[href='//www.phptravels.net/admin']"), AdministratorPage::new),
    SupplierLink(By.cssSelector("[href='//www.phptravels.net/supplier']"), SupplierPage::new);

    private By by;
    private Function<WebDriver, AbstractPage> pageFactorySupplier;

    PhpTravelsLinks(By by, Function<WebDriver, AbstractPage> pageFactorySupplier) {
        this.by = by;
        this.pageFactorySupplier = pageFactorySupplier;
    }

    public By getBy() {
        return by;
    }

    public AbstractPage toPageFactory(WebDriver driver) {
        return pageFactorySupplier.apply(driver);
    }
}
