import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By emailLocator = By.id("LoginEmail");
    By passwordLocator = By.id("Password");
    By submitLocator = By.id("loginLink");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void username(String text) {
        type(emailLocator ,text);
    }

    public void password(String text) {
        type(passwordLocator ,text);
    }

    public void submit() {
        click(submitLocator);
    }
}
