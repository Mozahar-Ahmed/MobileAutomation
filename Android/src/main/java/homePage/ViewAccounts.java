package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ViewAccounts {
    @FindBy(xpath = "//android.widget.TextView[@text='View Accounts']")
    WebElement viewAccounts;
    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    WebElement signinPage;
    public void validateViewAccounts(){
        System.out.println(viewAccounts.isDisplayed());
        Assert.assertEquals(viewAccounts.isDisplayed(),true,"View Accounts is not get displayed");
    }
    public void validateViewAccountsClickable(){
        viewAccounts.click();
        Assert.assertEquals(signinPage.isDisplayed(),true,"view account is not clickable");
    }
}
