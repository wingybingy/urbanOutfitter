import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class cartPage extends setUp{

    @FindBy(css = "[class=\"o-pwa-heading-action__heading o-pwa-heading-action__heading--page\"]")
    WebElement shoppingBag;

    @FindBy(css = "[class=\"o-pwa-accordion__toggle o-pwa-button-none\"]")
    WebElement promoCode;

    String shoppingBagText(){return shoppingBag.getText();}

    boolean promoCodeDisplay(){ return promoCode.isDisplayed();}

    

}
