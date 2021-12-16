import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchSelect {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserUtil.browserUtil();

        driver.get("https://www.google.com");

        By search_Box = By.name("q");

        By search_Suggestions = By.xpath("//div[@class='UUbT9']//span");

        Element_Utils eu = new Element_Utils(driver);

        Thread.sleep(2000);


        eu.getElement(search_Box).sendKeys("Selenium");

        Thread.sleep(3000);


       List<WebElement> list_Search_items =  eu.dropDownWithoutSelect(search_Suggestions);

       for (WebElement ele : list_Search_items){

           if (ele.getText().equalsIgnoreCase("selenium interview questions")){

               ele.click();

           }

       }






    }

}
