package controller;


import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginController extends ScriptBase {

   @FindBy(id = "username")
   WebElement username;
   @FindBy(id = "password")
   WebElement password;
   @FindBy(xpath ="//*[@id='submit']" )
   WebElement login;
   @FindBy(css="div.right.menu > div")
   WebElement user_menu;
   @FindBy(xpath = "//div[@class='item js-logout']")
   WebElement logout;
   @FindBy(xpath = "//li[contains(text(),'Invalid Username/Password')]")
   WebElement invalidMessage;

public LoginController(WebDriver driver){
    PageFactory.initElements(driver,this);
}
    public void loginSuccess(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        username.sendKeys("<user_name>");
        Thread.sleep(1000);
        password.sendKeys("<password>");
        login.click();
        Thread.sleep(20000);
        user_menu.click();
        Thread.sleep(1000);
        logout.click();
    }


    public void invaildLogin() throws InterruptedException {
        Thread.sleep(3000);
        username.sendKeys("<user_name>");
        password.sendKeys("<passoword>");
        Thread.sleep(1000);
        login.click();
        Thread.sleep(3000);
        Assert.assertEquals(invalidMessage, invalidMessage);
        System.out.println(invalidMessage);

    }

}
