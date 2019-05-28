package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class IframeClass extends CommonAPI {

    @FindBy(id = "draggable")
    WebElement drag;

    @FindBy(id = "droppable")
    WebElement drop;

    public void Iframe(){

        System.out.println(driver.findElement(By.tagName("iframe")).getSize());
        //driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

        Actions action = new Actions(driver);
        action.dragAndDrop(drag,drop).build().perform();
        //action.clickAndHold(drag).moveToElement(drop).build().perform();
        driver.switchTo().defaultContent();
    }
}
