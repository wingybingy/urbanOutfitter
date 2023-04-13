import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class amazonTest extends setUp{

    amazon amazon;

    @BeforeMethod
    void openBrowser(){
        setUpDriver("https://www.amazon.com/");
        amazon = PageFactory.initElements(driver, amazon.class);
    }

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        quitBrowser();
    }

    @Test
    void testDropDown(){
       String expected[] = {"All Departments","Alexa Skills"};
        List<WebElement> actual = amazon.dropDownSelect();

        for( int i = 0; i < 2; i++){
            Assert.assertEquals(actual.get(i).getText(),expected[i]);
        }
    }
}

