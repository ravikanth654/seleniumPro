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

public class checkHeadingStatusTest extends TestInit
{
    @Test
    public void checkHeadingStatus() throws Exception {
        ExtentTest t1 = pNode.createNode("checkHeadingStatus ", "checkHeadingStatus");
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
        String tstatus = inTrips.init(t1).tripStatus();
        System.out.println(tstatus);
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement button = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(3000);

        if(tstatus.equals("ASSIGNED"))
        {
            String hstatus = inTrips.init(t1).headingStatus();
            System.out.println(hstatus);
            Assertion.assertEqual(hstatus,"PENDING","both same ",t1);
        }
        else if(tstatus.equals("COMPLETED"))
        {
            String hstatus = inTrips.init(t1).headingStatus();
            System.out.println(hstatus);
            Assertion.assertEqual(hstatus,"COMPLETED","both same ",t1);
        }
        else if(tstatus.equals("ONGOING"))
        {
            String hstatus = inTrips.init(t1).headingStatus();
            System.out.println(hstatus);
            Assertion.assertEqual(hstatus,"ONGOING","both same ",t1);
        }
        else
        {
            String hstatus = inTrips.init(t1).headingStatus();
            System.out.println(hstatus);
            Assertion.assertEqual(hstatus,"CANCELLED","both same ",t1);
        }

}
}
