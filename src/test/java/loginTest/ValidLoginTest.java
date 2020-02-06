package loginTest;

import base.ScriptBase;
import controller.LoginController;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidLoginTest extends ScriptBase{

LoginController loginController;

    @BeforeTest
    public void beforeTest () throws InterruptedException {
        loginController=new LoginController(driver);
        testOpenBrowser();
    }

    @Test (priority = 1)
    public void verifySuccesfulLogin () throws InterruptedException {
        loginController=new LoginController(driver);
        loginController.loginSuccess(driver);


    }

    @Test (priority = 2)
    public void verifyInvalidLogin () throws InterruptedException {
        loginController.invaildLogin();


    }



    @AfterTest
    public void afterTest(){

        driver.quit();
}

}
