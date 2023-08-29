package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilpkartHomePage {
    //-

    WebDriver driver;
    public void FilpkartHomePage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    WebElement  LoginPopUpXbutton;

    @FindBy(xpath = "//input[@name='q']")
    WebElement  SerarchBox;

    @FindBy(xpath = "//button[@aria-label='Search for Products, Brands and More']")
    WebElement  Serarchbutton;

    //- L0Z3Pu
    @FindBy(xpath = "//button[@class='L0Z3Pu']")
    WebElement  Serarchbutton2;

    public void closeLoginPopup(){
        LoginPopUpXbutton.click();
    }
    public void EnterTextSearchBox(String text){
        SerarchBox.sendKeys(text);
    }
    public void clickSearchbutton(){
        Serarchbutton.click();
    }
    public void clickSearchbutton2(){
        Serarchbutton2.click();
    }
}
