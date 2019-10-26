package testTD;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import pages.Logo;

public class LogoTest extends MobileAPI {
    Logo logo;
    public void initialization(){
       logo= PageFactory.initElements(appiumDriver,Logo.class);
    }

}
