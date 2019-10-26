package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Logo extends MobileAPI {
    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.tdbank:id/action_bar_icon']")
    WebElement logo;
    public void validateLogo(){
        System.out.println(logo.isDisplayed());
        Assert.assertEquals(logo.isDisplayed(),true, "Logo isn't displayed");
    }
}
