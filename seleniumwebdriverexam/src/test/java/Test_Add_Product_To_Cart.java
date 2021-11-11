import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart extends BaseTest {

    LoginPage loginPage; //login sayfası
    Homepage homepage; //login sonrası arama yapacagımız yer
    ProductsPage productsPage; //click and scroll, click see more
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void Login(){
        homepage = new Homepage(driver);
        loginPage = new LoginPage(driver);

        homepage.goToLogin();
        loginPage.username("beytullahzor7@gmail.com");
        loginPage.password("Samsunspor55");
        loginPage.submit();
        Assertions.assertTrue(homepage.isOnHomePage(),
                "Not on Home page");
    }

    @Test
    @Order(2)
    public void search_product(){
        //homepage = new Homepage(driver);
        homepage.searchBox().search("pantolan");
    }

    @Test
    @Order(3)
    public void select_product(){ //click,  scroll down of the page, click see more
        productsPage = new ProductsPage(driver);
        //scroll down bottom of the page
        //click see more product
        productsPage.scrolldonw();
        productsPage.seeMore();
        productsPage.selectProduct(3);

    }

    @Test
    @Order(4)
    public void add_product_to_cart(){
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.selectSize();
        productDetailPage.addToCart();

        //fiyat doğruluğu karşılaştırma
    }

    @Test
    @Order(5)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homepage.goToCart();
        cartPage.add();

        Assertions.assertTrue(cartPage.checkIfProductNumber(),
                "There are 2 items"); //2 olduğu kontrolü

        cartPage.delete();

        Assertions.assertTrue(cartPage.checkIfEmpty(),
                "The cart is empty!"); //sepet boşluk kontrolü

    }



}
