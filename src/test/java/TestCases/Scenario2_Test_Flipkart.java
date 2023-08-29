package TestCases;

import Library.utils;
import Pages.FilpKartItemListPage;
import Pages.FilpkartHomePage;
import Pages.FlipKartItemPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
;

import java.awt.*;

import java.util.Set;


public class Scenario2_Test_Flipkart extends BaseClass {

    FilpkartHomePage flipkarthomepage;
    FilpKartItemListPage filpKartItemListPage;
    FlipKartItemPage flipKartItemPage;
    utils utlis;

    @BeforeClass
    public void openURL() throws AWTException {
        utlis = new utils(driver);
        flipkarthomepage = PageFactory.initElements(driver, FilpkartHomePage.class);
        filpKartItemListPage = PageFactory.initElements(driver, FilpKartItemListPage.class);
        flipKartItemPage = PageFactory.initElements(driver, FlipKartItemPage.class);

    }

    @Test
    public void TestFlipkart_Item() throws AWTException, InterruptedException {
        try {
            flipkarthomepage.closeLoginPopup();
        }catch (Exception e){}
        driver.manage().window().maximize();
        flipkarthomepage.EnterTextSearchBox("Iphone 14");
        try {
            flipkarthomepage.clickSearchbutton();
        }catch (Exception e){
            flipkarthomepage.clickSearchbutton2();
        }
        int NumberOfitems=filpKartItemListPage.itemlist.size();
        System.out.println("Number of items on item list page ->"+NumberOfitems);
        filpKartItemListPage.clickOnFirstItem();
        String ExpFirstItemName =  filpKartItemListPage.getFirstItemName();
        String currentwindow = utlis.getCurrentWindowID();
        Set<String> allWindows = utlis.getListOfwindowID();
        utlis.switchToChildWindow(allWindows,currentwindow);
        Thread.sleep(3000);
        System.out.println("titke is ->"+driver.getTitle());
        String ActualItenName = flipKartItemPage.getItemName();
        Assert.assertEquals(ExpFirstItemName,ActualItenName);

    }

    @AfterClass
    public void closeBrowserWindow(){
        driver.quit();
    }

}
