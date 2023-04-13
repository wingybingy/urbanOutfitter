import com.beust.ah.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
public class HomeTest extends setUp{

    homePage home;

    @BeforeMethod
    void setUpTest(){
        setUpDriver("https://www.urbanoutfitters.com/");
        home = PageFactory.initElements(driver, homePage.class);
    }

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        quitBrowser();
    }

    @Test
    void testpromoMessageText(){
        String actualText = home.promoMessageText();
        Assert.assertEquals(actualText,"Free Shipping On Orders $75+ Details");
    }

    @Test
    void testRewardsText(){
        String actualText = home.rewardsText();
        Assert.assertEquals(actualText,"UO Rewards");
    }

    @Test
    void testRewards(){
        home.rewardsClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/uo-rewards");
    }

    @Test
    void testWomenText(){
        String actualText = home.womenHeaderText();
        Assert.assertEquals(actualText,"Women's");
    }

    @Test
    void testWomenHeader(){
        home.womenHeaderClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/womens-clothing");
    }

    @Test
    void validateWomenSkirt(){
        Assert.assertTrue(home.CheckWomenSkirt(driver));
    }

    @Test
    void womenSkirtText(){
        String actualText= home.womenSkirtText(driver);
        Assert.assertEquals(actualText,"Skirts");
    }

    @Test
    void testWomenSkirt(){
        home.womenSkirtClick(driver);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.urbanoutfitters.com/skirts");
    }

    @Test
    void ValidateCargoGrid(){
        home.cargoGridClick(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("cargo"));
    }

    @Test
    void validateCopyRightText(){
        Assert.assertTrue(home.copyRightText().contains("2023"));
    }

    @Test
    void testMenText(){
        String actualText = home.menHeaderText();
        Assert.assertEquals(actualText,"Men's");
    }

    @Test
    void testMenHeader(){
        home.menHeaderClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/mens-clothing");
    }

    @Test
    void validateFooterLink(){
        ArrayList<String> link = home.linkText();
        Assert.assertTrue(link.contains("Shipping"));
    }

    @Test
    void testHomeHeaderText(){
        String actualText = home.homeHeaderText();
        Assert.assertEquals(actualText,"Home");
    }

    @Test
    void testHomeHeader(){
        home.homeHeaderClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/home");
    }

    @Test
    void urbanRenewalHeaderText(){
        String actualText = home.urbanRenewalHeaderText();
        Assert.assertEquals(actualText,"Urban Renewal");
    }

    @Test
    void testUrbanRenewalHeader(){
        home.urbanRenewalHeaderClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/urban-renewal-all");
    }

    @Test
    void testMusicHeaderText(){
        String actualText = home.musicHeaderText();
        Assert.assertEquals(actualText,"Music");
    }

    @Test
    void testMusicHeader(){
        home.musicHeaderClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/vinyl-records-cassettes");
    }

    @Test
    void lifeStyleHeaderText(){
        String actualText = home.lifeStyleHeaderText();
        Assert.assertEquals(actualText,"lifeStyle");
    }

    @Test
    void testLifeStyleHeader(){
        home.lifeStyleHeaderClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/lifeStyle");
    }

    @Test
    void beautyHeaderText(){
        String actualText = home.beautyHeaderText();
        Assert.assertEquals(actualText,"Beauty");
    }

    @Test
    void testBeautyHeader(){
        home.beautyHeaderClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/beauty-products");
    }

    @Test
    void brandsHeaderText(){
        String actualText = home.brandsHeaderText();
        Assert.assertEquals(actualText,"Brands");
    }

    @Test
    void testBrandsHeader(){
        home.brandsHeaderClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/shop-brands");
    }

    @Test
    void saleHeaderHeaderText(){
        String actualText = home.saleHeaderText();
        Assert.assertEquals(actualText,"Sale");
    }

    @Test
    void testSaleHeaderHeader(){
        home.saleHeaderClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/sale");
    }

    @Test
    void testCart(){
        home.cartClick();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.urbanoutfitters.com/cart");
    }

    @Test
    void testSaleNewTab(){
        home.saleHeaderNewTab(driver);
    }

    @Test
    void testBrandsNewTab(){
        home.brandsHeaderNewTab(driver);
    }

    @Test
    void testBeautyNewTab(){
        home.brandsHeaderNewTab(driver);
    }




}
