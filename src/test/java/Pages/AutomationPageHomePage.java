package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPageHomePage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public AutomationPageHomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='https://automationpanda.com/contact/']")
    WebElement Contact;

    public void ClickonContact() {
        Contact.click();
    }
}
