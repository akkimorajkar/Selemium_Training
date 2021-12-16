import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DragAndDrop {


    public static void main(String[] args) {

        WebDriver driver = BrowserUtil.browserUtil();


        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

        By sorce = By.id("draggable");

        By target = By.id("droppable");

        Element_Utils eu = new Element_Utils(driver);

        eu.dragAndDrop(sorce,target);

    }

}
