package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.AmazonHomePage;

public class AmazonHomePageTest extends CommonAPI {

    AmazonHomePage homePage;
    @BeforeMethod
    public void init(){
        homePage = PageFactory.initElements(driver, AmazonHomePage.class);
    }
    @Test(enabled = false)
    public void selectionTest(){
        homePage.setDepartment();
    }
    @Test(enabled = false)
    public void setHamburgerTest(){
        homePage.setHamburger();
    }
    @Test(enabled = false)
    public void setAccountlistTest(){
        homePage.setAccountlist();
    }
    @Test(enabled = false)
    public void setPrimeTest(){
        homePage.setPrime();
        sleepFor(2);
    }
    @Test(enabled = false)
    public void setTryprimeTest(){
        homePage.setTryprime();
        sleepFor(3);
    }
    @Test
    public void setSigninTest(){
        homePage.setSignin("Jeff@selenium.com", "Jeff");
        sleepFor(2);
    }



}
