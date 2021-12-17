import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrangeHrm {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        driver = BrowserUtil.browserUtil();

        Element_Utils eu = new Element_Utils(driver);

        driver.get("https://www.orangehrm.com/contact-sales/");

        Thread.sleep(3000);

        By name = By.id("Form_submitForm_FirstName");

        By lastName = By.name("LastName");

        By links = By.tagName("a");

        By country = By.id("Form_submitForm_Country");

        By companyName = By.id("Form_submitForm_CompanyName");

        By companySize = By.xpath("//select[@id='Form_submitForm_NoOfEmployees']//option");

        eu.getElement(name).sendKeys("Akshay");

        eu.getElement(lastName).sendKeys("Morajkar");

        eu.getElement(companyName).sendKeys("Jp");

        eu.getElements(links);

        WebElement countryElement = eu.getElement(country);

        // eu.dropDownHandler(countryElement , "India");

        List<WebElement> dropDownOptions = eu.dropDownOptions(countryElement);

        /*for (int i = 0 ; i <dropDownOptions.size() ; i++){

            if (dropDownOptions.get(i).getText().equalsIgnoreCase("India")) {

                eu.dropDownHandler(countryElement , "Bangladesh");

                break;

            }

            else {

                System.out.println(dropDownOptions.get(i).getText());

            }

        }*/

            List<WebElement> companySizeList = eu.dropDownWithoutSelect(companySize);

        for (WebElement ele: companySizeList) {


            System.out.println(ele.getText());

        }





        //driver.quit(); //

    }

}
