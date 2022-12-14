package tests.myMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clickAble
{
    public static boolean isClickable(WebElement webe)
    {
        try
        {
            WebDriver yourWebDriver = null;
            WebDriverWait wait = new WebDriverWait(yourWebDriver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(webe));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
