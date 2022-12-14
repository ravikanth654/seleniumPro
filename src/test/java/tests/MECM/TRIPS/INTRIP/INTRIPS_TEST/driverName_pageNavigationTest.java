package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;

public class driverName_pageNavigationTest extends TestInit
{
    @Test
    public void driverName_pageNavigation() throws Exception {
        ExtentTest t1 = pNode.createNode("driverName_pageNavigation ", "driverName_pageNavigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).startDate("30122019");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(6000);
        String url2 = "driver";

        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td[7]//span"));
        js.executeScript("arguments[0].click();", button);
        // inTrips.init(t1).vehicleAssignedClick();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();

        Assertion.verifyContains(url, url2, "driverName_pageNavigation", t1);

    }
}
