package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.TextFromWebElements;

public class TextFromWebElementsTest extends CommonAPI {

    TextFromWebElements text;

    @BeforeMethod
    public void init(){
        text = PageFactory.initElements(driver, TextFromWebElements.class);
    }
    @Test
    public void getTextFromWebElementsTest(){
        text.getTextFromWebElements("//table[@class='navFooterMoreOnAmazon']");

    }


}
