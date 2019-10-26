package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.smartcardio.CommandAPDU;

public class MenuButton extends MobileAPI {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Show Menu']")
    WebElement menubutton;
    public void validateMenuButton(){
        System.out.println(menubutton.isDisplayed());
        Assert.assertEquals(menubutton.isDisplayed(), true, "Menu button isn't displayed");
        menubutton.click();
    }
}
