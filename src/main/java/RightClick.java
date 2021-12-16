import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RightClick {

    public static void main(String[] args) {

        WebDriver driver = BrowserUtil.browserUtil();


        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        By right_Click_Me = By.xpath("//span[contains(@class,'context-menu-one')]");

        By right_click_Options = By.xpath("//li[contains(@class,'context-menu-icon')]/span");

        Element_Utils eu = new Element_Utils(driver);

        eu.righClick(right_Click_Me);

        List<WebElement> eleList = eu.getElements(right_click_Options);

        for (WebElement ele : eleList){

            if (ele.getText().equalsIgnoreCase("Copy")){

                ele.click();

                break;

            }




        }


    }

}
