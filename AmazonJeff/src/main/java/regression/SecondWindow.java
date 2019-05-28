package regression;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;

public class SecondWindow extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Amazon Music')]")
    WebElement AmazonMusic;

    public void Amazonmusic(){
        System.out.println("The First Window Title : "+driver.getTitle());

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).click(AmazonMusic).perform();
        sleepFor(3);

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentwindow = it.next();
        String childwindow = it.next();

        driver.switchTo().window(childwindow);
        sleepFor(2);
        System.out.println("The Second Window Title: "+driver.getTitle());


    }
}
