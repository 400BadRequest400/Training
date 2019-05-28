package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.UploadFile;

public class UploadFileTest extends CommonAPI {

    UploadFile upload;
    @BeforeMethod
    public void init(){
        upload = PageFactory.initElements(driver, UploadFile.class);
    }
    @Test
    public void uploadafileTest(){
        upload.uploadafile();
    }
}
