package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
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

public class checkVehicleAssignedNo_inVehicleTabTest extends TestInit
{
    @Test
    public void checkVehicleAssignedNo_inVehicleTab() throws Exception {
        ExtentTest t1 = pNode.createNode("checkVehicleAssignedNo_inVehicleTab ", "checkVehicleAssignedNo_inVehicleTab");
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
        Thread.sleep(2000);
        String vehicle = inTrips.init(t1).vehicleAssignedAdhoc();
        System.out.println(vehicle);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td[7]//span"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(3000);
        String inReg = fleetVehiclesPage.init(t1).inReg();
        System.out.println("inReg "+inReg);

        Assertion.assertEqual(inReg,vehicle,"same",t1);

    }
}
