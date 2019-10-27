package homePageTest;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homePage.Logo;

public class LogoTest extends MobileAPI {
    Logo logo;
    @BeforeMethod
    public void initialization(){
        logo= PageFactory.initElements(appiumDriver,Logo.class);
    }
    @Test
    public void logoValidation(){
        logo.validateLogo();
    }

}
