package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class IframeClass extends CommonAPI {



    @FindBy(id="draggable")
    WebElement drage;

    @FindBy(id="droppable")
    WebElement drop;

    @FindBy (xpath = "//*[@id=\"sidebar\"]/aside[1]/ul/li[5]/a")
     WebElement sortclick;


public void Iframe(){


    System.out.println(driver.findElement(By.tagName("iframe")).getSize());
    //driver.switchTo().frame(0);
    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
    Actions actions = new Actions(driver);
    //actions.clickAndHold(drage).moveToElement(drop).build().perform();
    actions.dragAndDrop(drage,drop).build().perform();
    driver.switchTo().defaultContent();

}
public void sort(){
    sortclick.click();



}




}
