package testClasses;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ViewAccounts;

public class ViewAccountTest extends MobileAPI {
    ViewAccounts viewAccounts;
    @BeforeMethod
    public void init(){
        viewAccounts= PageFactory.initElements(appiumDriver,ViewAccounts.class);
    }
    @Test
    public void validateViewAccounts(){
        viewAccounts.validateViewAccounts();
    }

}
