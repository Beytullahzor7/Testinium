import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage extends BasePage {

    By  addItemLocator = By.cssSelector("a[class='oq-up plus']");
    By deleteCart1Locator = By.id("Cart_ProductDelete_706563283");
    By deleteCart2Locator = By.id("Cart_ProductDelete_706563283");
    By checkEmptyLocator = By.cssSelector("p.cart-empty-title");
    By checkProductNumberLocator = By.id("spanCart");
    By checkProductNumberLocator2 = By.cssSelector("span[id='spanCart']");



    public CartPage(WebDriver driver) {

        super(driver);
    }

    public boolean checkIfProductNumber() {
        return getCardCount() == 2;
    }

    public void delete() {
        click(deleteCart1Locator);
        click(deleteCart2Locator);
    }

    public boolean checkIfEmpty() {
        return getTextEmpty().isEmpty();

    }

    public void add() {
        click(addItemLocator);
    }

    private int getCardCount(){
        String count = find(checkProductNumberLocator2).getText();
        return Integer.parseInt(count);
    }

    private String getTextEmpty(){
        find(checkEmptyLocator).getText();
        return getTextEmpty();
    }
}
