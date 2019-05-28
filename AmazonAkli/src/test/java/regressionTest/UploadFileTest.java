package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.UploadClass;

public class UploadFileTest extends CommonAPI {

    UploadClass uploadObj;

    @BeforeMethod
    public  void init(){
        uploadObj = PageFactory.initElements(driver,UploadClass.class);

    }
    @Test
    public void uploadMethod(){
        uploadObj.setUploadfile();
        sleepFor(3);


    }



}
