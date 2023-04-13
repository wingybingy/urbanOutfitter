import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class homePage extends setUp{
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/header/div/div[2]/div/div[1]/div/p")
    WebElement promoMessage;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/header/div/div[2]/div/div[2]/div[2]/ul/li[1]")
    WebElement rewards;

    @FindBy(id = "[id=\"l1-womens-clothing\"]")
    WebElement womenHeader;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/header/div/div[3]/div/div[2]/div/div/div[2]/ul/li[1]/div[3]/div/div/div[1]/div[1]/div/ul[1]/li[9]")
    WebElement womenSkirt;

    @FindBy(xpath = "//*[@id=\"aprwk1-us-ca-hp-top-hero\"]/div/div/div/div/a")
    WebElement cargoGrid;

    @FindBy(css = "[class=\"c-pwa-legal__copyright\"]")
    WebElement copyRight;

    @FindBy(id = "[id=\"l1-mens-clothing\"]")
    WebElement menHeader;

    @FindBy(css = "[class=\"c-pwa-footer-columns__list-item\"]")
    List<WebElement> footer;

    @FindBy(id = "id=\"l1-home\"")
    WebElement homeHeader;

    @FindBy(id = "id=\"l1-urban-renewal-all\"")
    WebElement urbanRenewalHeader;

    @FindBy(id = "id=\"l1-vinyl-records-cassettes\"")
    WebElement musicHeader;

    @FindBy(id = "id=\"l1-lifestyle\"")
    WebElement lifeStyleHeader;

    @FindBy(id = "id=\"l1-beauty-products\"")
    WebElement beautyHeader;

    @FindBy(id = "id=\"l1-shop-brands\"")
    WebElement brandsHeader;

    @FindBy(id = "id=\"l1-sale\"")
    WebElement saleHeader;

    @FindBy(css = "[class=\"c-pwa-site-basket__icon c-pwa-site-basket__icon c-pwa-icon\"]")
    WebElement cart;

    String promoMessageText(){
        return promoMessage.getText();
    }

    String rewardsText(){
        return rewards.getText();
    }

    void rewardsClick(){
        rewards.click();
    }

    String womenHeaderText(){ return womenHeader.getText(); }

    void womenHeaderClick(){ womenHeader.click();}

    boolean CheckWomenSkirt(WebDriver dr){
        moveToElement(dr, womenHeader);
        waitForVisibility(dr, 3, womenSkirt);
        return womenSkirt.isDisplayed();
    }

    String womenSkirtText (WebDriver dr){
        moveToElement(dr, womenHeader);
        waitForVisibility(dr, 3, womenSkirt);
        return womenSkirt.getText();
    }

    void womenSkirtClick(WebDriver dr){
        moveToElement(dr, womenHeader);
        waitForVisibility(dr, 3, womenSkirt);
        womenSkirt.click();
    }

    void cargoGridClick(WebDriver dr){
        doubleClick(dr, cargoGrid);
    }

    String copyRightText(){
        return  copyRight.getText();
    }

    String menHeaderText(){ return menHeader.getText(); }

    void menHeaderClick(){ menHeader.click();}

    ArrayList<String> linkText(){
        ArrayList<String> text = new ArrayList<>();

        for (WebElement a: footer){
            text.add(a.getText());
        }
        return text;
    }

    String homeHeaderText(){ return homeHeader.getText(); }

    void homeHeaderClick(){ homeHeader.click();}

    String urbanRenewalHeaderText(){ return urbanRenewalHeader.getText(); }

    void urbanRenewalHeaderClick(){ urbanRenewalHeader.click();}

    String musicHeaderText(){ return musicHeader.getText(); }

    void musicHeaderClick(){ musicHeader.click();}

    String lifeStyleHeaderText(){ return lifeStyleHeader.getText(); }

    void lifeStyleHeaderClick(){ lifeStyleHeader.click();}

    String beautyHeaderText(){ return beautyHeader.getText(); }

    void beautyHeaderClick(){ beautyHeader.click();}

    String brandsHeaderText(){ return brandsHeader.getText(); }

    void brandsHeaderClick(){ brandsHeader.click();}

    String saleHeaderText(){ return saleHeader.getText(); }

    void saleHeaderClick(){ saleHeader.click();}

    void cartClick(){ cart.click();}

    void saleHeaderNewTab(WebDriver dr) {
        Actions actions = new Actions(dr);
        actions.keyDown(Keys.CONTROL).moveToElement(saleHeader).click().perform();
        ArrayList<String> tabs = new ArrayList<String>(dr.getWindowHandles());
        dr.switchTo().window(tabs.get(1));
    }

    void brandsHeaderNewTab(WebDriver dr) {
        Actions actions = new Actions(dr);
        actions.keyDown(Keys.CONTROL).moveToElement(brandsHeader).click().perform();
        ArrayList<String> tabs = new ArrayList<String>(dr.getWindowHandles());
        dr.switchTo().window(tabs.get(1));
    }

    void beautyHeaderNewTab(WebDriver dr) {
        Actions actions = new Actions(dr);
        actions.keyDown(Keys.CONTROL).moveToElement(beautyHeader).click().perform();
        ArrayList<String> tabs = new ArrayList<String>(dr.getWindowHandles());
        dr.switchTo().window(tabs.get(1));
    }


}
