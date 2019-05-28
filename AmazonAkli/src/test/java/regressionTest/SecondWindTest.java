package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.SecondWindow;

public class SecondWindTest extends CommonAPI {


    SecondWindow windowObje;

    @BeforeMethod
    public void init (){
        windowObje= PageFactory.initElements(driver,SecondWindow.class);

    }
    @Test
    public void setprimenowTest(){
        windowObje.setPrimenow();


    }








}
