package TestCases;


import Library.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;
    @BeforeSuite
    @Parameters("TestName")
    public void initiateURL(String TestName) throws IOException {
        String BrowserName = utils.getDataFromPropertyFile("Browser");
        String path = System.getProperty("user.dir");
        if (BrowserName.equals("Safari")){
            driver = new SafariDriver();
        }else if (BrowserName.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", path+"/chromedriver");
            driver = new ChromeDriver();
        } else if (BrowserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver",path+"/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = utils.getDataFromPropertyFile(TestName);
        driver.get(url);
    }


}
