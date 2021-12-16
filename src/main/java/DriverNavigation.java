import org.openqa.selenium.WebDriver;

public class DriverNavigation {



    public static void main(String[] args) throws InterruptedException {

       WebDriver driver;

       driver = BrowserUtil.browserUtil();

       driver.get("https://www.google.com");

       driver.navigate().to("https://www.amazon.com");

       driver.navigate().back();

       driver.navigate().forward();

       Thread.sleep(5000);

       driver.quit();


    }


}
