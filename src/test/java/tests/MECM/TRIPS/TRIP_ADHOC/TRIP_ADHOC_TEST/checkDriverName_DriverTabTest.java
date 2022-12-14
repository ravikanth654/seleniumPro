package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.awt.*;
import java.awt.event.KeyEvent;

public class checkDriverName_DriverTabTest extends TestInit
{
    @Test
    public void checkDriverName_DriverTab() throws Exception {
        ExtentTest t1 = pNode.createNode("checkDriverName_DriverTab ", "checkDriverName_DriverTab");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        tripAdhoc.init(t1).tripAdhoc();
         Thread.sleep(3000);

        inTrips.init(t1).startDate("30122019");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(6000);


        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
        String name = inTrips.init(t1).driverNameAdhoc();
        System.out.println(name);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td[8]//span"));
        js.executeScript("arguments[0].click();", button);
        // inTrips.init(t1).vehicleAssignedClick();
        Thread.sleep(3000);
        String insideDriverName = fleetDriverPage.init(t1).insideDriverName();
        System.out.println(insideDriverName);

        Assertion.assertEqual(insideDriverName,name,"same",t1);
    }
}
