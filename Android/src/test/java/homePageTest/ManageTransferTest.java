package homePageTest;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homePage.ManageTransfer;

public class ManageTransferTest extends MobileAPI {
    ManageTransfer manageTransfer;
    @BeforeMethod
    public void setManageTransfer(){
        manageTransfer= PageFactory.initElements(appiumDriver,ManageTransfer.class);
    }
    @Test
    public void manageTransferValidation(){
        manageTransfer.validateMnageTransferDisplayed();
        manageTransfer.validateManageTransferClickable();
    }
}
