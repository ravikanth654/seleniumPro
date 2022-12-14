package tests.myMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageScroll
{
    protected static WebDriver driver;
    public static String pageScrollDown(String xpath) throws InterruptedException
    {
        //WebElement element = driver.findElement(By.xpath((xpath)));
        WebElement element =driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
    return xpath;
    }

}
