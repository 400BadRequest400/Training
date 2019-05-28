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

    @FindBy(xpath = "//a[@class='hidden-phone visible-dektop loginnowlink overlay-login']//img")
    WebElement login;

    @FindBy(xpath = "//div[@class='cl fl ls_login']")
    WebElement log;

    @FindBy(xpath = "//div[@class='cl fl width354 pt13']//div[@class='fl']//div[1]")
    WebElement user;


    public void HandleNewWindow(){
        System.out.println("First Window Title: "+driver.getTitle());
        login.click();

        Set<String> ids= driver.getWindowHandles();
        Iterator<String> its = ids.iterator();

        String Parentid= its.next();
        String childid = its.next();

        driver.switchTo().window(childid);
        sleepFor(2);
        System.out.println("Second Window Title: "+driver.getTitle());

        user.click();
        sleepFor(2);

    }
}
