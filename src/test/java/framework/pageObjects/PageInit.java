package framework.pageObjects;

import com.aventstack.extentreports.ExtentTest;
import framework.util.common.Assertion;
import framework.util.common.DriverFactory;
import framework.util.common.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;


public class  PageInit {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static ExtentTest pageInfo;
    private static GenericMethods gM;

    public PageInit(ExtentTest t1) {
        pageInfo = t1;
        driver = DriverFactory.getDriver();
        gM = new GenericMethods(driver);
        wait = new WebDriverWait(driver, 8);
        PageFactory.initElements(driver, this);
    }

    protected void logInfo(String info) {
        //System.out.println(info);
        pageInfo.info(info); // log for Extent Report
    }

//    public static void highLighterMethod(WebDriver driver, WebElement element){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
//    }

    public static void highLighterMethod(WebDriver driver, WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
        try {Thread.sleep(1000);}
        catch (InterruptedException e){System.out.println(e.getMessage());}
        js.executeScript("arguments[0].setAttribute('style','border: solid 0px white');", element);
    }


    protected void setText(WebElement elem, String text, String elementName) {

        try {
            highLighterMethod(driver,elem);
            wait.until(ExpectedConditions.elementToBeClickable(elem)).clear();
            wait.until(ExpectedConditions.elementToBeClickable(elem)).sendKeys(text);
            logInfo("set " + elementName + "'s text as '" + text + "'");
        } catch (Exception e) {
            try{
                pageInfo.warning("Exception Occurred: " + e.getMessage());
                pageInfo.info("Retry Set Text");
                highLighterMethod(driver,elem);
                wait.until(ExpectedConditions.elementToBeClickable(elem)).clear();
                wait.until(ExpectedConditions.elementToBeClickable(elem)).sendKeys(text);
                logInfo("set " + elementName + "'s text as '" + text + "'");
            }catch (Exception e1){
                pageInfo.fail("Failed to set " + text + " to " + elementName);
                pageInfo.error(e1.toString());
                e1.printStackTrace();
                try {
                    Assertion.raiseExceptionAndContinue(e1, pageInfo);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }





    protected void setTextUsingJs(WebElement elem, String text, String elementName) {
        try {
            highLighterMethod(driver,elem);
            wait.until(ExpectedConditions.elementToBeClickable(elem)).clear();
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
            js.executeScript("arguments[0].value='" + text + "';", elem);
            logInfo("set " + elementName + "'s text as '" + text + "'");
        } catch (Exception e) {
            pageInfo.fail("Failed to set " + text + " for " + elementName);
            pageInfo.error(e.toString());
            e.printStackTrace();
            try {
                Assertion.raiseExceptionAndContinue(e, pageInfo);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    protected void selectVisibleText(WebElement elem, String text, String elementName) {
        Select sel =  null;
        try{
            highLighterMethod(driver,elem);
            sel = new Select(elem);
            elem.click();
        }catch (NoSuchElementException e){
            pageInfo.fail(e.getMessage());
            Assert.fail(e.getMessage());
        }

        try {
            highLighterMethod(driver,elem);
            gM.waitSelectOptionText(sel, text);
            sel.selectByVisibleText(text);
            logInfo("select from " + elementName + ". Selected text '" + text + "'");
        } catch (Exception e) {
            try {
                pageInfo.warning("Exception Occurred: " + e.getMessage());
                pageInfo.info("Retry Selecting By Visible Text");
                gM.waitSelectOptionText(sel, text);
                sel.selectByVisibleText(text);
                logInfo("select from " + elementName + ". Selected text '" + text + "'");
            } catch (Exception e1) {
                pageInfo.fail("Failed to Select " + text + " from " + elementName);
                pageInfo.error(e1.toString());
                e1.printStackTrace();
                try {
                    elem.click();
                    Assertion.raiseExceptionAndStop(e1, pageInfo);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    protected void selectValue(WebElement elem, String value, String elementName) {
        Select sel =  null;
        try{
            highLighterMethod(driver,elem);
            sel = new Select(elem);
            elem.click();
        }catch (NoSuchElementException e){
            pageInfo.fail(e.getMessage());
            Assert.fail(e.getMessage());
        }
        try {
            gM.waitSelectOptionValue(sel, value);
            sel.selectByValue(value);
            logInfo("select from " + elementName + ". Selected value '" + value + "'");
        } catch (Exception e) {
            try {
                pageInfo.warning("Exception Occurred: " + e.getMessage());
                pageInfo.info("Retry Selecting By Value");
                gM.waitSelectOptionValue(sel, value);
                sel.selectByValue(value);
                logInfo("select from " + elementName + ". Selected value '" + value + "'");
            } catch (Exception e1) {
                pageInfo.fail("Failed to Select " + value + " from " + elementName);
                pageInfo.error(e1.toString());
                e1.printStackTrace();
                try {
                    elem.click();
                    Assertion.raiseExceptionAndStop(e1,      pageInfo);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    protected void selectIndex(WebElement elem, int index, String elementName) {
        Select sel =  null;
        try{
            highLighterMethod(driver,elem);
            sel = new Select(elem);
            elem.click();
        }catch (NoSuchElementException e){
            pageInfo.fail(e.getMessage());
            Assert.fail(e.getMessage());
        }

        try {
            highLighterMethod(driver,elem);
            sel.selectByIndex(index);
            logInfo("select from " + elementName + ". Selected index '" + index + "'");
        } catch (Exception e) {
            try {
                pageInfo.warning("Exception Occurred: " + e.getMessage());
                pageInfo.info("Retry Selecting By Index");
                sel.selectByIndex(index);
                logInfo("select from " + elementName + ". Selected index '" + index + "'");
            } catch (Exception e1) {
                pageInfo.fail("Failed to Select " + index + " from " + elementName);
                pageInfo.error(e1.toString());
                e1.printStackTrace();
                try {
                    highLighterMethod(driver,elem);
                    elem.click();
                    Assertion.raiseExceptionAndStop(e1, pageInfo);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    protected void clickOnElement(WebElement elem, String elementName) {

        try {
            highLighterMethod(driver,elem);
            wait.until(ExpectedConditions.elementToBeClickable(elem)).click();
            logInfo("Click on " + elementName);
        } catch (Exception e) {
            try {
                if(e.getMessage().contains("unexpected alert open")){
                    pageInfo.warning("Un Expected Alert has opened");
                    driver.switchTo().alert().accept();
                }
                e.printStackTrace();
                pageInfo.warning("Exception Occured: " + e.getMessage());
                pageInfo.info("Retry Clicking");
                highLighterMethod(driver,elem);
                wait.until(ExpectedConditions.elementToBeClickable(elem)).click();
                logInfo("Click on " + elementName);
            } catch (Exception e1) {
                pageInfo.fail("Failed to Click on " + elementName);
                pageInfo.error(e1.toString());
                e1.printStackTrace();
                try {
                    Assertion.raiseExceptionAndContinue(e1, pageInfo);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    protected void clickOnElementUsingJs(WebElement elem, String elementName) {
        try {
            highLighterMethod(driver,elem);
            wait.until(ExpectedConditions.elementToBeClickable(elem));
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
            js.executeScript("arguments[0].click();", elem);
            logInfo("Click on " + elementName + " using Js");
        } catch (Exception e) {
            pageInfo.fail("Failed to Click on " + elementName);
            pageInfo.error(e.toString());
            e.printStackTrace();
        }
    }

    protected void clickOnElementUsingJsByClass(WebElement elem, String elementName) {
        try {
            highLighterMethod(driver,elem);
            wait.until(ExpectedConditions.elementToBeClickable(elem));
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
            //        j.executeScript("x=document.getElementsByClassName('loginsigninbutton');x[1].click();");

            js.executeScript("var x=document.getElementsByClassName('" + elem + "');x[1].click();");
            logInfo("Click on " + elementName + " using Js");
        } catch (Exception e) {
            pageInfo.fail("Failed to Click on " + elementName);
            pageInfo.error(e.toString());
            e.printStackTrace();
        }
    }

    protected void setDate(WebElement elem, String value, String description) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
            js.executeScript("arguments[0].value='" + value + "';", elem);
            logInfo("Set Date " + description + "Value as: " + value);
        } catch (Exception e) {
            pageInfo.fail("Failed to Set Date on " + description);
            pageInfo.error(e.toString());
            e.printStackTrace();
            try {
                Assertion.raiseExceptionAndContinue(e, pageInfo);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

    }

    protected boolean isStringPresentInWebTable(WebElement table, String text) {
        if (table.findElements(By.xpath(".//tr/td[contains(text(), '" + text + "')]")).size() > 0)
            return true;
        else
            return false;
    }

    protected boolean isStringPresentInWebTableAsLabel(WebElement table, String text) {
        if (table.findElements(By.xpath(".//tr/td/label[contains(text(), '" + text + "')]")).size() > 0)
            return true;
        else
            return false;
    }

    //TODO to be done
   /* protected void navigateTo(String parentPageCode, String childPageCode, String pageName) throws Exception {
        genericMethods.leftNavigation(parentPageCode, childPageCode);
        pageInfo.info("Navigate to Page: " + pageName);
    }*/

    protected int getTableRowCount(WebElement table) {
        return table.findElements(By.tagName("tr")).size();
    }

    public static Object[] fetchLabelTexts(String xpath, String... attribute)
    {
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        List<String> elementFieldText = new ArrayList<>();

        if(attribute.length > 0){
            String value = attribute[0];

            for(int i = 0; i<elements.size(); i++){
                elementFieldText.add(elements.get(i).getAttribute(value).trim());
            }
        }
        else {
            for (int i = 0; i < elements.size(); i++) {
                elementFieldText.add(elements.get(i).getText().trim());
            }
        }
        Object [] actualFieldText = elementFieldText.toArray();

        Arrays.sort(actualFieldText);

        return actualFieldText;
    }
}