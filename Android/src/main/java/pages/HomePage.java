package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HomePage extends MobileAPI {
@FindBy (xpath = "*//android.widget.Button[@text='ACCOUNTS']")
    WebElement accounts;
    @FindBy (xpath = "*//android.widget.Button[@text='TRANSFER']")
    WebElement transfer;
    @FindBy (xpath = "*//android.widget.Button[@text='DEPOSIT']")
    WebElement deposit;
    @FindBy (xpath = "*//android.widget.Button[@text='SEND MONEY']")
    WebElement sendMoney;
   public void uiValidation(){
       sleepFor(10);
       SoftAssert softAssert= new SoftAssert();
       softAssert.assertEquals(accounts.isDisplayed(), true,"accounts isn't displayed");
       softAssert.assertEquals(transfer.isDisplayed(), true,"transfer isn't displayed");
       softAssert.assertEquals(deposit.isDisplayed(), true,"deposit isn't displayed");
       softAssert.assertEquals(sendMoney.isDisplayed(), true,"send money isn't displayed");
       softAssert.assertAll();

   }
   public void clickOnAccount(){
       accounts.click();

   }
}
