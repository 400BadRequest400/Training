package regression;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;

public class SecondWindow extends CommonAPI {

    @FindBy (xpath = "//a[contains(text(),'Prime Now')]")
    WebElement primenow;


    public void setPrimenow(){
        Actions act = new Actions(driver);
        act.keyDown(Keys.SHIFT).click(primenow).perform();


        Set<String> ides= driver.getWindowHandles();
        Iterator<String>its=ides.iterator();
        String parentwindow =its.next();
        String childwindow=its.next();

        driver.switchTo().window(childwindow);
        //primenow.click();





    }






}
