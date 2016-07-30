package dn.test.dnproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class LoginTest {
    ChromeDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
    }
    
    @Test
    public void LoginTest() {
        wd.get("www.google.com.ua");
        wd.findElement(By.id("IntEmail")).click();
        wd.findElement(By.id("IntEmail")).clear();
        wd.findElement(By.id("IntEmail")).sendKeys("tc@xpi.com");
        wd.findElement(By.id("InpPassword")).click();
        wd.findElement(By.id("InpPassword")).clear();
        wd.findElement(By.id("InpPassword")).sendKeys("Disclosurenet1");
        wd.findElement(By.xpath("//div[@id='loginForm_LoginFormHolder']/table/tbody/tr[2]/td[5]")).click();
        wd.findElement(By.id("ImbLogin")).click();
        wd.findElement(By.id("LblUserName")).click();
        wd.findElement(By.id("ext-gen673")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
