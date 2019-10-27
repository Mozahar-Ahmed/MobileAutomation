package homePage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import reporting.TestLogger;

public class HomePage extends MobileAPI {
    @FindBy(xpath = "*//android.widget.Button[@text='ACCOUNTS']")
    WebElement accounts;
    @FindBy(xpath = "*//android.widget.Button[@text='TRANSFER']")
    WebElement transfer;
    @FindBy(xpath = "*//android.widget.Button[@text='DEPOSIT']")
    WebElement deposit;
    @FindBy(xpath = "*//android.widget.Button[@text='SEND MONEY']")
    WebElement sendMoney;
    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    WebElement product;

    public void validateUserInterface() {
        sleepFor(5);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accounts.isDisplayed(), true, "accounts isn't displayed");
        softAssert.assertEquals(transfer.isDisplayed(), true, "transfer isn't displayed");
        softAssert.assertEquals(deposit.isDisplayed(), true, "deposit isn't displayed");
        softAssert.assertEquals(sendMoney.isDisplayed(), true, "send money isn't displayed");
        softAssert.assertEquals(product.isDisplayed(), true, "product isn't displayed");
        softAssert.assertAll();
    }

    public void clickOnAccounts() {
        String account = accounts.getText();
        accounts.click();
        TestLogger.log("message");
        System.out.println(account + ": has been clicked");
    }
    public void clickOnTransfer(){
        String transfr = accounts.getText();
        accounts.click();
        TestLogger.log("");
        System.out.println(accounts + ": has been clicked");
    }
    public void swipeDown() {
        sleepFor(5);
        MobileAPI.functionSwipe("up", 200, 200);
    }
}