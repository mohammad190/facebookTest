package TestHomePageFeatures;

import HomePageFeatures.LoginFeatures;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestLoginFeatures extends CommonAPI{

    @Test
    public void homePageFacebook() throws IOException {

        LoginFeatures loginFeatures = PageFactory.initElements(driver, LoginFeatures.class);
        loginFeatures.homePage("abcd1234@yahoo.com", "abcd5687");
        takeScreenShot(driver,"AfterTest","C:\\Users\\sujon\\IdeaProjects\\facebookAutomation\\Facebook\\screenshots\\");

    }

}
