package framework.util.common;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;


public class GenericMethods {
    //Logger logger;
    private static WebDriver driver;
    private static ExtentTest pageInfo;
    private static final Logger LOGGER = LoggerFactory.getLogger(GenericMethods.class);
    private static final SoftAssert sAssert = new SoftAssert();
    private static WebDriverWait wait;
    private static WebDriverWait waitLess;

    public GenericMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 8);
        waitLess = new WebDriverWait(driver, 1);
    }

    /**
     * Wait for a selectbox options to generate
     *
     * @param select
     */
    public void waitSelectOptions(Select select) {
        new FluentWait<WebDriver>(driver)
                .withTimeout(5, TimeUnit.SECONDS)
                .pollingEvery(10, TimeUnit.MILLISECONDS)
                .until(new Function<WebDriver, Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return (select.getOptions().size() > 1);
                    }
                });
    }

    /**
     * Only specific to Service Charge Page
     *
     * @param select
     */
    public void waitSelectOptionsSCharge(Select select) {
        new FluentWait<WebDriver>(driver)
                .withTimeout(5, TimeUnit.SECONDS)
                .pollingEvery(10, TimeUnit.MILLISECONDS)
                .until(new Function<WebDriver, Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return (select.getOptions().size() > 0);
                    }
                });
    }

    /**
     * Wait for a web element
     *
     * @param element
     */
    public void waitWebElementVisible(WebElement element) {
        new FluentWait<WebDriver>(driver)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(10, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .until(new Function<WebDriver, Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return (element.isDisplayed());
                    }
                });
    }

    /**
     * fluent Wait for a select box to load, with option specific text
     *
     * @param select - Select
     * @param text   - option visible text
     */
    public void waitSelectOptionText(Select select, String text) {
        new FluentWait<WebDriver>(driver)
                .withTimeout(8, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class)
                .until(new Function<WebDriver, Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return (getOptionText(select).contains(text));
                    }
                });
    }

    /**
     * fluent Wait for a select box to load, with option specific value
     *
     * @param select - Select
     * @param value  - option Value
     */
    public void waitSelectOptionValue(Select select, String value) {
        new FluentWait<WebDriver>(driver)
                .withTimeout(8, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .until(new Function<WebDriver, Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return (getOptionValues(select).contains(value));
                    }


                });
    }

    /**
     * Element is Dispalyed
     *
     * @param elem
     * @return
     */
    public boolean elementIsDisplayed(WebElement elem) {
        try {
            waitLess.until(ExpectedConditions.visibilityOf(elem));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Select Option from Drop Down with matching Partial Text
     *
     * @param sel
     * @param text
     */
    public void selectOptionByPartialText(Select sel, String text) {
        List<WebElement> options = sel.getOptions();
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).getText().contains(text)) {
                sel.selectByIndex(i);
                break;
            }
        }
    }

    public List<String> getOptions(WebElement elem) {
        Select sel = new Select(elem);
        List<WebElement> we = sel.getOptions();
        List<String> ls = new ArrayList<String>();
        for (WebElement a : we) {
            if (!a.getText().equals("Select")) {
                ls.add(a.getText());
            }
        }
        return ls;
    }

    /**
     * Get values of the options available for a slect box
     *
     * @param sel - Select
     * @return
     */
    public List<String> getOptionValues(Select sel) {
        List<WebElement> we = sel.getOptions();
        List<String> ls = new ArrayList<String>();
        for (WebElement a : we) {
            if (!a.getText().equals("Select")) {
                ls.add(a.getAttribute("value"));
            }
        }
        return ls;
    }

    public List<String> getOptionValues(WebElement element) {
        Select sel = new Select(element);
        List<WebElement> we = sel.getOptions();
        List<String> ls = new ArrayList<String>();
        for (WebElement a : we) {
            if (!a.getText().equals("Select")) {
                ls.add(a.getAttribute("value"));
            }
        }
        return ls;
    }

    public List<String> getOptionText(WebElement elem) {
        Select sel = new Select(elem);
        List<WebElement> we = sel.getOptions();
        List<String> ls = new ArrayList<String>();
        for (WebElement a : we) {
            if (!a.getText().equals("Select")) {
                ls.add(a.getText());
            }
        }
        return ls;
    }

    public List<String> getOptionText(Select sel) {
        List<WebElement> we = sel.getOptions();
        List<String> ls = new ArrayList<String>();
        for (WebElement a : we) {
            if (!a.getText().equals("Select")) {
                ls.add(a.getText().trim());
            }
        }
        return ls;
    }
}
