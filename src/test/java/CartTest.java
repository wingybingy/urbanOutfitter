import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends setUp{

    cartPage cart;

    @BeforeMethod
    void openBrowser(){
        setUpDriver("https://www.urbanoutfitters.com/cart");
        cart = PageFactory.initElements(driver, cartPage.class);
    }

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        quitBrowser();
    }

    @Test
    void testShoppingBag(){
        String actual = cart.shoppingBagText();
        Assert.assertEquals(actual,"Shopping Cart");
    }
}
