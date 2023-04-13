import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class googlePage extends setUp {

    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")
    WebElement noThanks;

    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[1]/div")
    WebElement text;

    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/a")
    WebElement signInButton;

    String noThanksText(WebDriver dr){
        dr.switchTo().frame(0);
        return noThanks.getText();
    }

    String textText(WebDriver dr){
        dr.switchTo().frame(0);
        return text.getText();
    }

    boolean signInButtonDisplay(WebDriver dr){
        dr.switchTo().frame(0);
        return signInButton.isDisplayed();
    }
}
