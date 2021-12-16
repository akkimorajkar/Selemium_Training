import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class BrowserUtil {

    public static WebDriver browserUtil(){

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        return driver;

    }


}
