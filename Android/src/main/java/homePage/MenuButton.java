package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MenuButton {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Show Menu']")
    WebElement menubutton;
    public void validateMenuButton(){
        System.out.println(menubutton.isDisplayed());
        Assert.assertEquals(menubutton.isDisplayed(), true, "Menu button isn't displayed");
        menubutton.click();
    }
}
