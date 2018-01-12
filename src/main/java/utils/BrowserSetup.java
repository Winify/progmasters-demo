package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class BrowserSetup {

    private enum BrowserType {
        FF("firefox", WebDriverManager.firefoxdriver(), FirefoxDriver::new),
        CHROME("chrome", WebDriverManager.chromedriver(), ChromeDriver::new),
        INVALID;

        private String browserCode;
        private WebDriverManager driverManager;
        private Supplier<WebDriver> driverSupplier;

        BrowserType() {
            this(null, WebDriverManager.chromedriver(), ChromeDriver::new);
        }

        BrowserType(String browserCode, WebDriverManager driverManager, Supplier<WebDriver> driverSupplier) {
            this.browserCode = browserCode;
            this.driverManager = driverManager;
            this.driverSupplier = driverSupplier;
        }

        public WebDriverManager getDriverManager() {
            return driverManager;
        }

        public WebDriver toDriver() {
            return driverSupplier.get();
        }

        public static BrowserType fromCode(String browserCode) {
            for (BrowserType type : values()) {
                if (browserCode.equals(type.browserCode)) {
                    return type;
                }
            }

            return INVALID;
        }
    }

    public static WebDriver getLocalDriver(String browserTypeCode) {

        BrowserType browserType = BrowserType.fromCode(browserTypeCode);
        browserType.getDriverManager().setup();

        return browserType.toDriver();
    }
}
