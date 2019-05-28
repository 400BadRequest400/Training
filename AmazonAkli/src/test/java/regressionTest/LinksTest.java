package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.LinksClass;

public class LinksTest extends CommonAPI {
    LinksClass text;

    @BeforeMethod
    public void init(){
        text = PageFactory.initElements(driver, LinksClass.class);
    }
    @Test
    public void getTextFromWebElementsTest(){
        text.getTextFromWebElements("//table[@class='navFooterMoreOnAmazon']");

    }







}
