package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TextFromWebElements extends CommonAPI {

    //@FindBy(xpath = "//table[@class='navFooterMoreOnAmazon']")
    //WebElement locator;

    public static List<String> getTextFromWebElements(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.xpath(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
            System.out.println(web.getText());

        }
        System.out.println("=====================");
        System.out.println(text);
        System.out.println(text.size());


        return text;
    }
}
