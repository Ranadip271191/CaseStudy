package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPandaContactPage {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public AutomationPandaContactPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='g3-name']")
    WebElement Name;

    @FindBy(xpath = "//input[@name='g3-email']")
    WebElement Email;

    @FindBy(xpath = "//textarea[@name='g3-message']")
    WebElement Massage;

    @FindBy(xpath = "//strong[text()='Contact Me']")
    WebElement ContactMeButton;

    @FindBy(xpath = "//h4[text()='Your message has been sent']")
    WebElement SuccessMassage;

    public void EnterName(String name) {
        Name.sendKeys(name);
    }
    public void EnterEmail(String email) {
        Email.sendKeys(email);
    }
    public void EnterMassage(String massage) {
        Massage.sendKeys(massage);
    }
    public void ClickContactMeButton() {
        ContactMeButton.click();
    }
    public String GetSuccessMassageText() {
        return SuccessMassage.getText();
    }
}
