package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipKartItemPage {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public FlipKartItemPage(WebDriver driver) {
        this.driver = driver;
    }
     @FindBy (xpath = "//h1[@class='yhB1nd']/span")
     WebElement ItemName;

    public String getItemName(){
        return ItemName.getText();
    }
}
