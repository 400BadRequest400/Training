package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadClass extends CommonAPI {


    @FindBy(id="file-upload")
    WebElement filechoose;
    @FindBy(id="file-submit")
    WebElement upload;

    public void setUploadfile(){

        String filepath=("/Users/user/Documents/Training/AmazonAkli/abc/Screen Shot 2019-05-10 at 5.56.53 PM.png");
        filechoose.sendKeys(filepath);
        upload.click();

    }
    public void uploadingF (){
        upLoadFile("#file-upload","/Users/user/Documents/Training/AmazonAkli/abc/Screen Shot 2019-05-10 at 5.56.53 PM.png");
        sleepFor(1);
    }


}
