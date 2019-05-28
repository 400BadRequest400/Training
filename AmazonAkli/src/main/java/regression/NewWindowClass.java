package regression;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class NewWindowClass extends CommonAPI {




    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/p[2]/a[1]/img[1]\n")
    WebElement login;

    @FindBy(xpath = "//div[contains(text(),'Forgot User ID?')]")
    WebElement forgetpin;

    @FindBy(xpath = "/html[1]/body[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[2]")
    WebElement account;


    public void handlnewwindow() {
        System.out.println(driver.getTitle());
        login.click();
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> its = ids.iterator();
        String parentID = its.next();
        String childID = its.next();
        driver.switchTo().window(childID);
        forgetpin.click();
        sleepFor(2);


        System.out.println(driver.findElement(By.tagName("iframe")).getSize());
        driver.switchTo().frame(0);
        account.click();
        sleepFor(3);

























        /* Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();
        if (text.equalsIgnoreCase("Please enter your userid ")){
            System.out.println("test passed");
        }else {
            System.out.println("test faild");
        }  */






    }


}
