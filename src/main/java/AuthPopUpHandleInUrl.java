import org.openqa.selenium.WebDriver;

public class AuthPopUpHandleInUrl {

    public static void main(String[] args) {

            WebDriver driver = BrowserUtil.browserUtil();


        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

    }

}
