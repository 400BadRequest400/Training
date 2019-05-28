package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class UploadFile extends CommonAPI {


    @FindBy(id = "file-upload")
    WebElement messi;

    @FindBy(id = "file-submit")
    WebElement submit;

    public void uploadafile(){
        TestLogger.log(getCurrentPageUrl());
        String path = "/Users/djafarouldslimane/Documents/Training/AmazonJeff/Pictures/226.jpg";
        messi.sendKeys(path);
        sleepFor(3);
        submit.click();
        sleepFor(20);

        Assert.assertTrue(true);
    }
}
