import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends BasePage{

    By CartLocator = By.cssSelector("a.header-cart");
    By fastShipping = By.cssSelector("a[href='/tr-TR/TR/FastDelivery']");
    By LoginLocator = By.xpath("//a[@href ='https://www.lcwaikiki.com/tr-TR/TR/giris']");

    SearchBox searchBox;

    public Homepage(WebDriver driver) {

        super(driver);
        searchBox = new SearchBox(driver); //deger atadım artık null degil
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public void goToCart() {
        click(CartLocator);
    }

    public boolean isOnHomePage() {
        return isDisplayed(fastShipping);
    }

    public void goToLogin() {
        click(LoginLocator);

    }
}
