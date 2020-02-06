package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginController_WIP extends ScriptBase {

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

    public LoginController_WIP(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void loginSuccess(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        //WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("");
        //username.sendKeys("qa.superuser.amer@groupm.com");

        Thread.sleep(1000);
        //WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("");
        login.click();
        Thread.sleep(20000);
        //driver.findElement(By.cssSelector("div.right.menu > div")).getText();
        //WebElement element = driver.findElement(By.cssSelector("div.right.menu > div")).getText();
        //System.out.println( driver.findElement(By.cssSelector("div.right.menu > div")).getText());
        //driver.findElement(By.xpath("//div[@class='ui top right dropdown item  js-user-dd user-dd active visible']")).click();
        //driver.findElement(By.cssSelector("div.right.menu > div")).click();
        user_menu.click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//div[@class='item js-logout']")).click();
        //driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
        logout.click();
    }


    public void invaildLogin() throws InterruptedException {
        Thread.sleep(3000);
        //driver.findElement(By.id("username")).sendKeys("qa.superuser.amer@groupm.com");
        username.sendKeys("");
        Thread.sleep(1000);
        //driver.findElement(By.id("password")).sendKeys("Welcome@1234567");
        password.sendKeys("");
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id='submit']")).click();
        login.click();
        Thread.sleep(3000);

        //WebElement invalidMessage = driver.findElement(By.xpath("//li[contains(text(),'Invalid Username/Password')]"));

        Thread.sleep(3000);
        Assert.assertEquals(invalidMessage, invalidMessage);
        System.out.println(invalidMessage);

    }

}
