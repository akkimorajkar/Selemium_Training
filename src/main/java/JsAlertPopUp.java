import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JsAlertPopUp {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserUtil.browserUtil();


        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        By sign_In =  By.name("proceed");

        Element_Utils eu = new Element_Utils(driver);

        Thread.sleep(2000);

        eu.getElement(sign_In).click();

        Thread.sleep(2000);

       Alert alert =  driver.switchTo().alert();

       alert.dismiss();

       driver.switchTo().defaultContent();


    }

}
