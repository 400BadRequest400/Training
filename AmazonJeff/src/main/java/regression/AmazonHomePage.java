package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

public class AmazonHomePage extends CommonAPI {

    @FindBy(id = "searchDropdownBox")
    WebElement department;

    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburger;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[34]/li[6]/a/div")
    WebElement firetv;

    @FindBy(id = "nav-link-accountList")
    WebElement accountlist;

    @FindBy(xpath = "//span[contains(text(),'Find a Gift')]")
    WebElement gift;

    @FindBy(css = "a[class='nav-sprite nav-logo-tagline nav-prime-try']")
    WebElement prime;

    @FindBy(css = "a[class='nav-npt-a']")
    WebElement started;

    @FindBy(css = "a[id='nav-link-prime']")
    WebElement tryprime;

    @FindBy(xpath = "//*[@id=\"nav-flyout-prime\"]/div[2]/div[1]/div[3]/form")
    WebElement primebutton;

    @FindBy(id = "prime-header-CTA")
    WebElement tryprime2;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(xpath = "//input[@name='rememberMe']")
    WebElement checkbox;

    @FindBy(id = "signInSubmit")
    WebElement signin;


    public void setDepartment(){
        department.click();
        Select select = new Select(department);
        select.selectByVisibleText("Baby");
        sleepFor(3);
    }
    public void setHamburger(){
        hamburger.click();
        firetv.click();
    }
    public void setAccountlist(){
        Actions action = new Actions(driver);
        action.moveToElement(accountlist).build().perform();
        gift.click();
    }
    public void setPrime(){
        TestLogger.log(getClass().getSimpleName() + ": " + " message ");
        Actions action = new Actions(driver);
        action.moveToElement(prime).build().perform();
        started.click();
        Assert.assertTrue(true);
    }
    public void setTryprime(){
        TestLogger.log(getCurrentPageUrl());
        Actions action = new Actions(driver);
        action.moveToElement(tryprime).build().perform();
        primebutton.click();
        Assert.assertTrue(true);
    }
    public void setSignin(String Email, String pass){
        tryprime.click();
        sleepFor(2);
        tryprime2.click();
        sleepFor(2);
        email.sendKeys(Email);
        sleepFor(2);
        password.sendKeys(pass);
        sleepFor(2);
        checkbox.click();
        sleepFor(2);
        signin.click();
    }

}
