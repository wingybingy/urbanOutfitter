import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class googleTest extends setUp{

    googlePage google;

    @BeforeMethod
    void openBrowser(){
        setUpDriver("https://www.google.com/");
        google = PageFactory.initElements(driver, googlePage.class);
    }

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        quitBrowser();
    }

    @Test
    void testNoThanksText(){
        Assert.assertEquals(google.noThanksText(driver),"No thanks");
    }

    @Test
    void testTextText(){
        Assert.assertEquals(google.textText(driver),"Sign in to Google");
    }

    @Test
    void validateSignInButton(){
        Assert.assertTrue(google.signInButtonDisplay(driver));
    }
}
