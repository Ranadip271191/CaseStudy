package Library;

import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class utils {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public utils(WebDriver driver) {
        this.driver = driver;
    }


    public String getCurrentWindowID(){
        return driver.getWindowHandle();
    }
    public Set<String> getListOfwindowID(){
        return driver.getWindowHandles();
    }

    public void switchToChildWindow(Set allWindows,String currentwindow){
        Iterator<String> i = allWindows.iterator();
        while(i.hasNext()){
            String childwindow = i.next();
            if(!childwindow.equalsIgnoreCase(currentwindow)){
                driver.switchTo().window(childwindow);
                System.out.println("The child window is "+childwindow);
            } else {
                System.out.println("There are no children");
            }
        }

    }
    public static String getDataFromPropertyFile(String value) throws IOException {
        FileReader reader=new FileReader("src/test/java/Resources/config.properties");
        Properties p=new Properties();
        p.load(reader);
        return p.getProperty(value);

    }
}
