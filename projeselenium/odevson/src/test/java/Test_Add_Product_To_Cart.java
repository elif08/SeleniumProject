import org.junit.jupiter.api.Order;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class Test_Add_Product_To_Cart extends BaseTest {
    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;


    @Test
    @Order(1)
    public void search_a_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Oyuncak");
        Assertions.assertTrue(productPage.isOnProductPage()), ("Not on products page");

    }

    @Test
    @Order(2)
    public void search_a_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(i:1);
        Assertions.assertTrue(productPage.isOnProductPage(), ("Not on product detail page"));

    }

    @Test
    @Order(3)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(), "product count did not increase!");

    }
    @Test
    @Order(4);
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(), "product was not added to cart");
    }


}

