import net.bytebuddy.dynamic.DynamicType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class setUp {

    WebDriver driver;
    void setUpDriver(String url){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    void selectDropdown(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    void moveMouse(WebDriver dr,WebElement element){
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
    }

    void doubleClick(WebDriver dr, WebElement element){
        Actions actions = new Actions(dr);
        actions.doubleClick(element).perform();
    }

    void waitForVisibility(WebDriver dr, int time, WebElement el){
        WebDriverWait wait = new WebDriverWait(dr, time);
        wait.until(ExpectedConditions.visibilityOf(el));
    }

    void waitForClickable(WebDriver dr, int time, WebElement el){
        WebDriverWait wait = new WebDriverWait(dr, time);
        wait.until(ExpectedConditions.visibilityOf(el));
    }

    void moveToElement(WebDriver dr, WebElement el){
        Actions actions = new Actions(dr);
        actions.moveToElement(el).perform();
    }
}
