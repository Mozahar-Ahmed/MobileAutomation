package loginPageTest;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import loginPage.Signup;

public class SignupTest extends MobileAPI {

    Signup signup;
    @BeforeMethod
    public void setSignup(){
        signup= PageFactory.initElements(appiumDriver,Signup.class);
    }
    public void signupTest(){
        signup.validateSignupBtnDisplayed();
        signup.validateSignupClickable();
    }

}
