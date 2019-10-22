package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MobileAPI {
@FindBy(xpath = "//android.widget.EditText[@text='User name']")
    WebElement userField;
    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    WebElement passField;
public void fillupData(){
    sleepFor(10);
    userField.sendKeys("randomUser");
    userField.sendKeys("fhgt12458");
    sleepFor(10);
}
}
