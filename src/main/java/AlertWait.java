import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertWait {

    public static void main(String[] args) {


        WebDriver driver = BrowserUtil.browserUtil();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        Element_Utils eu = new Element_Utils(driver);

        By alert_Button = By.xpath("//button[text()='Click for JS Alert']");

        eu.getElement(alert_Button).click();

        Alert al = eu.waitForAletTobePresent();

       System.out.println( al.getText());

       al.dismiss();

    }


}
