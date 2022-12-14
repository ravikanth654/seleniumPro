package tests.MECM.TRIPS.INTRIP.INTRIPS_DETAILS_TEST;

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

public class checkNoOfEmployeesTest extends TestInit
{
    @Test
    public void checkNoOfEmployees() throws Exception {
        ExtentTest t1 = pNode.createNode("checkNoOfEmployees ", "checkNoOfEmployees");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(4000);

        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);

        }

        String otype = inTrips.init(t1).noOfEmployee();
        int no = Integer.parseInt(otype);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(3000);

        inTrips.init(t1).clickingOnTripDetails();
        Thread.sleep(2000);
        inTrips.init(t1).clickOnEmployeeDropdown();
        Thread.sleep(2000);
        int intype = inTrips.init(t1).insideCOuntsOfEmployeeHeader();


        Assertion.assertEqual(no,intype,"same",t1);

    }
}
