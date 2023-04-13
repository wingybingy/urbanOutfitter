import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class amazon extends setUp{

    @FindBy(xpath = "//*[@id=\"searchDropdownBox\"]")
    WebElement dropDown;

    List<WebElement> dropDownSelect(){
        Select select = new Select(dropDown);
        return select.getOptions(); 
    }


}
