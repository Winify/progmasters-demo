package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Page;

public class PhpTravelsAdminPage extends Page {
    
    @FindBy(name = "email")
    public WebElement emailField;
    
    @FindBy(name = "password")
    public WebElement passwordField;
    
    @FindBy(css = "button[type=submit]")
    public WebElement loginBtn;

    @FindBy(css = "div.user")
    public WebElement userText;
    
    public PhpTravelsAdminPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) throws InterruptedException {

        emailField.sendKeys(email);
        passwordField.sendKeys(password);

        Thread.sleep(1000);
        loginBtn.click();
    }
}
