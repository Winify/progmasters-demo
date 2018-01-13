package utils;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPageFactory {

    public abstract AbstractPage createPage(WebDriver driver);
}
