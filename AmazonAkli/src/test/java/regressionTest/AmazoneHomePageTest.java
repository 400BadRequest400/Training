package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.AmazoneHomepage;
import reporting.TestLogger;

public class AmazoneHomePageTest extends CommonAPI {

AmazoneHomepage homepage;


   @BeforeMethod
    public void init (){
        homepage = PageFactory.initElements(driver,AmazoneHomepage.class);

   }

   @Test(enabled = false)
   public void selectionTest (){

       homepage.setDepartment();
   }

    @Test(enabled = false)
    public void hamburgertest (){

        homepage.setHamburger();
    }
   @Test(enabled = false)
    public void mouseMovtest() {
    homepage.setAccountlist();
}
    @Test(enabled = false)
  public void setprimetest(){
       homepage.setPrime();


}
    @Test
    public void setTryprimetest(){
        //homepage.setTryprime();
        sleepFor(4);
        homepage.SignUp("akliakliakli","passssssssssssss");

    }

}
