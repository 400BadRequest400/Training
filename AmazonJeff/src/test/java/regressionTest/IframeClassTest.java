package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.IframeClass;

public class IframeClassTest extends CommonAPI {

    IframeClass frame;

    @BeforeMethod
    public void init(){
        frame = PageFactory.initElements(driver, IframeClass.class);
    }
    @Test
    public void IframeTest(){
        frame.Iframe();
    }

}
