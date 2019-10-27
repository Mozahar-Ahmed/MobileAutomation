package homePageTest;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homePage.MenuButton;

public class MenuButtonTest extends MobileAPI {
  MenuButton menuButton;
  @BeforeMethod
    public void initiation(){
     menuButton= PageFactory.initElements(appiumDriver,MenuButton.class);
  }
  @Test
  public void menuButtonValidation(){
      menuButton.validateMenuButton();
  }

}
