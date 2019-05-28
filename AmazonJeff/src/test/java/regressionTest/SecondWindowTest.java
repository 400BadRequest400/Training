package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.SecondWindow;

public class SecondWindowTest extends CommonAPI {

    SecondWindow secondwindow;

    @BeforeMethod
    public void init(){
        secondwindow = PageFactory.initElements(driver, SecondWindow.class);
    }
    @Test
    public void AmazonmusicTest(){
        secondwindow.Amazonmusic();
    }
}
