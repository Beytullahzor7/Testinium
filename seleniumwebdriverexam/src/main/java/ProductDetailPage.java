import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By selectSizeLocator = By.cssSelector("a[size='9-12 Ay']");
    By addToCartLocator = By.id("pd_add_to_cart");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void selectSize() {
        click(selectSizeLocator);

    }

    public void addToCart() {
        click(addToCartLocator);
    }
}
