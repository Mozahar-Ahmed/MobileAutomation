package loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  {
    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    WebElement userName;
    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    WebElement password;
    @FindBy(xpath = "//android.widget.Button[@text='Forgot your password?']")
    WebElement forgotPassword;
    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    WebElement login;


    public void typeUserName(String Name ) {
        userName.sendKeys(Name);
}
    public void typePassword(String pw){
        password.sendKeys(pw);
    }
    public void clickOnForgotPassword() {
        forgotPassword.click();
    }
    public void clickOnLoginButton(){
        String loginBtn = login.getText();
        login.click();
        System.out.println(loginBtn + ": has been clicked");
    }

}
