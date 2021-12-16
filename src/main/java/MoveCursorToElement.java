import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoveCursorToElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserUtil.browserUtil();


        driver.get("http://mrbool.com/");

        Thread.sleep(3000);

        By content = By.xpath("//a[@class='menulink']");

        By courses = By.linkText("COURSES");

        Element_Utils eu = new Element_Utils(driver);

        eu.hoverCoursor(content);

        Thread.sleep(2000);

        eu.getElement(courses).click();



    }

}
