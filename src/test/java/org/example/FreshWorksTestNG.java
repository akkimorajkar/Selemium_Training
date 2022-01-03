package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FreshWorksTestNG {

    WebDriver driver;

    @BeforeTest

    public WebDriver browserSetUp(){

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://support.freshdesk.com/support/login");

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);



        return driver;


    }

    @Test
    public void freshWorkscheckLogo(){

         Boolean logo = driver.findElement(By.className("icon-home for-not-mobile")).isDisplayed();

        Assert.assertTrue(logo);

    }

    @Test

    public void emailTextBox(){

        Assert.assertTrue(driver.findElement(By.id("user_session_email")).isDisplayed());
    }

    @Test
    public void supporttHomeLink(){

        String support_Text = driver.findElement(By.xpath("(//a[@href='/support/home'])[2]")).getText();

        Assert.assertEquals(support_Text,"Support Homie");

    }






    @AfterTest

    public void closeBrowser(){

        driver.quit();

    }




}
