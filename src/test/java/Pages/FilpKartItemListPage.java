package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class FilpKartItemListPage {
    WebDriver driver;
    public void FilpKartItemListPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBys({
            @FindBy(xpath = "//div[@class='_13oc-S']"),
    })
    public List<WebElement> itemlist;

    @FindBy(xpath = "//div[@class='_4rR01T'][1]")
    WebElement FirstItem;

    public void clickOnFirstItem(){
        FirstItem.click();
    }
    public String getFirstItemName() {
        return FirstItem.getText();
    }

}
