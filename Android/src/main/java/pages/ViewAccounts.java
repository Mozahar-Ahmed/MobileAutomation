package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ViewAccounts extends MobileAPI {
    @FindBy(xpath = "//android.widget.TextView[@text='View Accounts']")
    WebElement viewAccounts;
    public void validateViewAccounts(){
        System.out.println(viewAccounts.isDisplayed());
        Assert.assertEquals(viewAccounts.isDisplayed(),true,"View Accounts is not get displayed");
    }
}
