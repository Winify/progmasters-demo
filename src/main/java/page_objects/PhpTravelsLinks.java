package page_objects;

import org.openqa.selenium.By;

public enum PhpTravelsLinks {
    Customer(By.cssSelector("[href='//www.phptravels.net']")),
    Administrator(By.cssSelector("[href='//www.phptravels.net/admin']")),
    Supplier(By.cssSelector("[href='//www.phptravels.net/supplier']"));

    private By by;

    PhpTravelsLinks(By by) {
        this.by = by;
    }

    public By getBy() {
        return by;
    }
}
