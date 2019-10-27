package homePageTest;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homePage.HomePage;

public class HomePageTest extends MobileAPI {
    HomePage homePage;

    @BeforeMethod
    public void homePageGate() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
    }

    @Test(enabled = false)
    public void interfaceValidation() {
        homePage.validateUserInterface();
    }

    @Test(enabled = false)
    public void accountsValidation() {
        homePage.clickOnAccounts();
    }

    @Test(enabled = false)
    public void transferValidation() {
        homePage.clickOnTransfer();
    }

    @Test(enabled = true)
    public void swipDownFunctionality() {
        homePage.swipeDown();
    }


}
