package homePageTest;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homePage.ViewAccounts;

public class ViewAccountTest extends MobileAPI {
    ViewAccounts viewAccounts;
    @BeforeMethod
    public void init(){
        viewAccounts= PageFactory.initElements(appiumDriver,ViewAccounts.class);
    }
    @Test
    public void validateViewAccounts(){
        viewAccounts.validateViewAccounts();
        viewAccounts.validateViewAccountsClickable();
    }

}
