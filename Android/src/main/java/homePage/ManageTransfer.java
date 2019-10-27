package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ManageTransfer {
    @FindBy (xpath = "//android.widget.TextView[@text='Manage Transfers']")
    WebElement manageTransfer;
    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    WebElement signinPage;

    public void validateMnageTransferDisplayed(){
        Assert.assertEquals(manageTransfer.isDisplayed(),true,"manage transfer is not get displayed");
    }
    public void validateManageTransferClickable(){
        manageTransfer.click();
        Assert.assertEquals(signinPage.isDisplayed(),true,"manage transfer is not clickable");
    }

}
