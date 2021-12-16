import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Element_Utils {

    WebDriver driver;

    public Element_Utils(WebDriver driver){

        this.driver = driver;

    }



    public WebElement getElement(By locator){

        WebElement element = driver.findElement(locator);

        return element;

    }


    public List<WebElement> getElements(By locator){

        List <WebElement> ar = driver.findElements(locator);

        ar.stream().forEach(ele ->System.out.println(ele.getText()));

        return ar;

    }

    public void dropDownHandler(WebElement ele , String country){

        Select sc = new Select(ele);

        sc.selectByValue(country);

    }

    public List<WebElement> dropDownOptions(WebElement ele){

        Select sc = new Select(ele);

       List<WebElement> eleList =  sc.getOptions();

       System.out.println(eleList.size());

      /* for (WebElement element : eleList){

           System.out.println(element.getText());

       }*/

       return eleList;

    }

    public List<WebElement> dropDownWithoutSelect(By locator){

        List<WebElement> wiithoutSelect= driver.findElements(locator);

        return wiithoutSelect;

    }

    public void hoverCoursor(By locator){

        WebElement ele = getElement(locator);

        Actions actions = new Actions(driver);

        actions.moveToElement(ele).perform();

    }

    public void dragAndDrop(By source , By target){

        WebElement sc = getElement(source);

        WebElement tg = getElement(target);

        Actions ac = new Actions(driver);

        ac.clickAndHold(sc).moveToElement(tg).release().build().perform();


    }

    public void righClick(By locator){

        WebElement ele = getElement(locator);

        Actions ac = new Actions(driver);

        ac.contextClick(ele).perform();

    }

    public Boolean elementCheck(By locator){

        List<WebElement> elecheckList = getElements(locator);

        if (elecheckList.size()>=1){


            System.out.println("True");

            return true;



        }

        else {

            System.out.println("False");

            return false;

        }

    }

    public void WindowpopUpHandler(WebDriver driver) throws InterruptedException {

        Set<String> windowHandles  = driver.getWindowHandles();

        Iterator <String> it = windowHandles.iterator();

        String parentWindowId = it.next();
        String childWindowId  = it.next();

        driver.switchTo().window(parentWindowId);

        driver.switchTo().window(childWindowId);

        Thread.sleep(4000);

        driver.close();

        driver.switchTo().window(parentWindowId);

        Thread.sleep(4000);

        driver.quit();



    }

    /* Implicit Wat is Global wait
    * it can be omly be applied on Webelements
    * cannot be used for get url , get title which are no Webelelments
    * */
    public void implicitlyWait(WebDriver driver , int seconds){

        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);


    }


    public WebElement webDriverWait(By locator){

        WebDriverWait ww = new WebDriverWait(driver,10);

       WebElement ele =  ww.until(ExpectedConditions.presenceOfElementLocated(locator));

       return ele;


    }

    public boolean webdriverWaitTitleCheck(WebDriver driver, String title){

        WebDriverWait ww2 =new WebDriverWait(driver, 10);

        return ww2.until(ExpectedConditions.titleContains(title));


    }

    public WebElement fluentWait(WebDriver driver , By locator){

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

        WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return ele;

    }


    public Alert waitForAletTobePresent(){

        WebDriverWait wait = new WebDriverWait(driver,10);

       return wait.until(ExpectedConditions.alertIsPresent());


    }



}
