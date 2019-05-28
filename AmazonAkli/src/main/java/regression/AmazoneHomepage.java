package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

public class AmazoneHomepage extends CommonAPI {

    @FindBy(id = "searchDropdownBox")
    WebElement department;

    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/i")
    WebElement hamburger;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[34]/li[3]/a/div")
    WebElement musicclick;

    @FindBy(id = "nav-link-accountList")
    WebElement Accountlist;

    @FindBy(xpath = "//*[@id=\"nav-al-your-account\"]/a[1]/span")
    WebElement navallaccou;


    @FindBy(css = "a[class='nav-sprite nav-logo-tagline nav-prime-try']")
    WebElement prime;

    @FindBy(css = "a[class='nav-npt-a']")
    WebElement getstarted;

    @FindBy(xpath = "//a[@id='nav-link-prime']")
    WebElement tryprime;

    @FindBy(xpath = "//*[@id=\"nav-flyout-prime\"]/div[2]/div[1]/div[3]/a")
    WebElement primeclick;

    @FindBy(xpath ="//input[@class='prime-cta-signup-button-input']")
    WebElement tryprimeclick;

    @FindBy(id="ap_email")
    WebElement Email;

     @FindBy (id="ap_password")
     WebElement password;

     @FindBy (xpath = "//input[@name='rememberMe']")
     WebElement checkbox;

     @FindBy (id="signInSubmit")
     WebElement signclick;


    public void setDepartment() {
        department.click();
        Select select = new Select(department);
        select.selectByVisibleText("Baby");
    }

    public void setHamburger() {
        hamburger.click();
        musicclick.click();
    }


    public void setAccountlist() {
        Actions action = new Actions(driver);
        action.moveToElement(Accountlist).build().perform();
        navallaccou.click();

    }


    public void setPrime() {
        Actions action = new Actions(driver);
        action.moveToElement(prime).build().perform();
        getstarted.click();
        Assert.assertTrue(true);
        TestLogger.log(getClass().getSimpleName() + ": " + " message ");


    }

    public void setTryprime(){
       Actions action = new Actions(driver);
       action.moveToElement(tryprime).build().perform();
       primeclick.click();
        TestLogger.log(getClass().getSimpleName());
        Assert.assertTrue(true);




    }


    public void SignUp(String email ,String passw){
        Actions action = new Actions(driver);
        action.moveToElement(tryprime).build().perform();
        primeclick.click();
        TestLogger.log(getClass().getSimpleName());
        Assert.assertTrue(true);

        tryprimeclick.click();
        Email.sendKeys(email);
        sleepFor(2);
        password.sendKeys(passw);
        sleepFor(2);
        checkbox.click();
        sleepFor(2);
        signclick.click();


    }


}
