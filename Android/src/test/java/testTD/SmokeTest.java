package testTD;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class SmokeTest extends MobileAPI {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        loginPage = PageFactory.initElements(appiumDriver, LoginPage.class);
    }

    @Test(enabled = true)
    public void testUI() {
        homePage.uiValidation();
    }

    @Test(enabled = false)
    public void login() {
        homePage.clickOnAccount();
        loginPage.fillupData();
    }

}
