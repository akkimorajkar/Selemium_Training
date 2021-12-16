import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait {

    public static void main(String[] args) {

        WebDriver driver = BrowserUtil.browserUtil();


        driver.get("https://myaccount.google.com/?utm_source=sign_in_no_continue&pli=1");

        By home = By.xpath("/html/body/c-wiz[3]/div/div[2]/c-wiz/c-wiz/div/div[1]/div[3]/c-wiz/nav/ul/li[1]/a");

        By personal_Info = By.id("/html/body/c-wiz[3]/div/div[2]/c-wiz/c-wiz/div/div[1]/div[3]/c-wiz/nav/ul/li[2]/a/div[2]");

        By about = By.xpath("/html/body/c-wiz[3]/div/div[2]/c-wiz/c-wiz/div/div[1]/div[3]/c-wiz/nav/ul/li[2]/a/div[2]");

        Element_Utils eu = new Element_Utils(driver);

        eu.implicitlyWait(driver,10);

        eu.getElement(home).click();

        eu.getElement(personal_Info).click();

        eu.getElement(about).click();

    }

}
