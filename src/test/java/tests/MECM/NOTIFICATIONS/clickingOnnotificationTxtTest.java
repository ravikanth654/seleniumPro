package tests.MECM.NOTIFICATIONS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.NOTIFICATIONS.notifications;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

public class clickingOnnotificationTxtTest extends TestInit
{
    @Test
    public void clickingOnnotificationTxt()throws Exception {
        ExtentTest t1 = pNode.createNode("clickingOnnotificationTxt", "clickingOnnotificationTxt");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        notifications.init(t1).notificationClick();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//div[@id='mySidenav']//ul//li"));
        js.executeScript("arguments[0].click();", button);
       // notifications.init(t1).notificationsClick();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        String url2="operations";

       // Assertion.verifyContains(url,url2,"Navigating",t1);

    }
}
