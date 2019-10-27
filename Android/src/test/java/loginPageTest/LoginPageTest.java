package loginPageTest;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homePage.HomePage;
import loginPage.LoginPage;

public class LoginPageTest extends MobileAPI {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setLoginGate() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        loginPage = PageFactory.initElements(appiumDriver, LoginPage.class);
    }
    @Test(enabled = false)
    public void forgotPasswordFunctionality() {
        homePage.clickOnAccounts();
        loginPage.clickOnForgotPassword();
    }
    @Test(enabled = true)
    public void login() {
        homePage.clickOnAccounts();
        loginPage.typeUserName("demouser95");
        loginPage.typePassword("abcd1234");
        loginPage.clickOnLoginButton();
    }
}
