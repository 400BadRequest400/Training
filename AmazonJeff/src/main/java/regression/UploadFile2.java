package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFile2 extends CommonAPI {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "pass")
    WebElement pass;

    @FindBy(id = "u_0_2")
    WebElement connexion;

    public void signin(String username, String password){
        email.sendKeys(username);
        sleepFor(3);
        pass.sendKeys(password);
        sleepFor(3);
        connexion.click();

    }

}
