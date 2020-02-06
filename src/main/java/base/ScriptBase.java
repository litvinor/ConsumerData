package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScriptBase {
    public static WebDriver driver;
    public void testOpenBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("<url>");
        Thread.sleep(1000);

    }
}
