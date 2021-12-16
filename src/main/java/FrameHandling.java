import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameHandling {


    public static void main(String[] args) {

        WebDriver driver = BrowserUtil.browserUtil();


        driver.get("http://www.londonfreelance.org/courses/frames/");

        By cotent = By.name("content");

        Element_Utils eu = new Element_Utils(driver);

        driver.switchTo().frame(eu.getElement(cotent));

        System.out.println(eu.getElement(By.xpath("/html/body/p[2]")).getText());


    }
}
