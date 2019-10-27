package loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Signup {
    @FindBy(xpath = "//android.widget.Button[@text='Sign up']")
    WebElement signup;
    @FindBy(xpath = "//android.widget.Button[@text='Personal Account']")
    WebElement personalAccount;
    public void  validateSignupBtnDisplayed(){
        Assert.assertEquals(signup.isDisplayed(),true);
    }
    public void validateSignupClickable(){
        signup.click();
        Assert.assertEquals(personalAccount.isDisplayed(), true);
    }
}
