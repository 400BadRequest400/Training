package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.NewWindowClass;

public class NewWindowTest extends CommonAPI {

    NewWindowClass window;

    @BeforeMethod
    public  void init (){

        window= PageFactory.initElements(driver,NewWindowClass.class);
    }

    @Test
    public void handlnewwindowTest(){

        window.handlnewwindow();



    }
}
