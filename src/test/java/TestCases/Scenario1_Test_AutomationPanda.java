package TestCases;

import Pages.AutomationPageHomePage;
import Pages.AutomationPandaContactPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Scenario1_Test_AutomationPanda extends BaseClass {
    AutomationPageHomePage automationPageHomePage;
    AutomationPandaContactPage automationPandaContactPage;
    @BeforeClass
    public void openURL(){
        automationPageHomePage = PageFactory.initElements(driver, AutomationPageHomePage.class);
        automationPandaContactPage =  PageFactory.initElements(driver, AutomationPandaContactPage.class);
    }

    @Test
    public void TestAutomationPanda_Contact(){
        automationPageHomePage.ClickonContact();
        automationPandaContactPage.EnterName("Ranadip");
        automationPandaContactPage.EnterEmail("ranadipbashi@gmail.com");
        automationPandaContactPage.EnterMassage("this is massage");
        automationPandaContactPage.ClickContactMeButton();
        Assert.assertEquals("Your message has been sent",automationPandaContactPage.GetSuccessMassageText());
    }

    @AfterClass
    public void closeBrowserWindow(){
        driver.quit();
    }

}
