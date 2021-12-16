import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPopUpHandle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserUtil.browserUtil();


        driver.get("https://www.monsterindia.com/seeker/registration");

        Thread.sleep(3000);

        // Type =File should be there

        Element_Utils eu = new Element_Utils(driver);

        By fileUpload = By.name("file");

        eu.getElement(fileUpload).sendKeys("C:\\Users\\moraj\\Documents\\New Text Document.txt");


    }

}
