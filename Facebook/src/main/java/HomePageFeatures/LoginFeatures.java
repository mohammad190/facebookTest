package HomePageFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFeatures extends CommonAPI{

    @FindBy(id = "email")
    WebElement clickEmail;

   @FindBy(id = "pass")
    WebElement clickPass;

   @FindBy(id = "u_0_2")
    WebElement clickLogin;

   public void homePage(String email, String pass){
       clickEmail.sendKeys(email);
       clickPass.sendKeys(pass);
       clickLogin.click();
   }
}
