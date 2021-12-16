import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JQueryDropDownHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserUtil.browserUtil();

        final String select_All_Values = "All";


        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        Thread.sleep(2000);

        By dropDown_Button = By.className("comboTreeArrowBtnImg");

        By dropDown_Button2 = By.id("comboTree593107ArrowBtn");

        By multi_Selection_Dropdown = By.xpath("//span[@class='comboTreeItemTitle']");

        By multi_Selection_Dropdown2 = By.xpath("//li[@class='ComboTreeItemChlid']");

        Element_Utils eu = new Element_Utils(driver);

        eu.getElement(dropDown_Button).click();

        Thread.sleep(2000);

        //eu.getElements(multi_Selection_Dropdown);

        try {
            List <WebElement> ele_List = eu.getElements(multi_Selection_Dropdown);

            multiSelectDropDown(ele_List,select_All_Values);
        }
        catch (Exception e){


        }


        driver.switchTo().defaultContent();

        eu.getElement(dropDown_Button2).click();

        List <WebElement> ele_List2 = eu.getElements(multi_Selection_Dropdown2);

        multiSelectDropDown(ele_List2,select_All_Values);






    }

    public static void multiSelectDropDown(List<WebElement> eleList, String... value){

        if (!value[0].equalsIgnoreCase("All")) {

            for (int i = 0; i < eleList.size(); i++) {

                for (int j = 0; j < value.length; j++) {

                    if (eleList.get(i).getText().equalsIgnoreCase(value[j])) {

                        eleList.get(i).click();

                    }

                }

            }
        } else {

            for (WebElement ele : eleList) {

                ele.click();

            }

        }


    }

}
