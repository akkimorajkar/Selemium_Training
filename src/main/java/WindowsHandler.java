import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsHandler {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserUtil.browserUtil();


        driver.get("https://www.amazon.in/s?hidden-keywords=hand+mixers+%26+blenders&pf_rd_i=4951860031&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=55f463d9-f42f-41c7-ae5d-364809f8f710&pf_rd_r=M2T02CVWP0EF4T88K9EC&pf_rd_s=merchandised-search-10&ref=QAQuad11CTA_en_IN_1");

        Thread.sleep(4000);

        By popUpBtn = By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[1]/h2/a/span");

        Element_Utils eu = new Element_Utils(driver);

        eu.getElement(popUpBtn).click();

        Thread.sleep(2000);

        eu.WindowpopUpHandler(driver);

    }





}
