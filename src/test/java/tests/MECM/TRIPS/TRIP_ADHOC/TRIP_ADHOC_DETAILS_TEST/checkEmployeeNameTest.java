package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
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

import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class checkEmployeeNameTest extends TestInit
{
    @Test
    public void checkEmployeeName() throws Exception {
        ExtentTest t1 = pNode.createNode("checkEmployeeName ", "checkEmployeeName");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(4000);

        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);

        }
        String employeeName = inTrips.init(t1).employeeName();
        System.out.println(employeeName);
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement button = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(3000);

        WebElement button1v = driver.findElement(By.xpath("//a[.=' TRIP DETAILS ']"));
        js.executeScript("arguments[0].click();", button1v);

        Thread.sleep(2000);
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        WebElement button11 = driver.findElement(By.xpath("//a[.=' EMPLOYEES ']//..//i"));
        js.executeScript("arguments[0].click();", button11);
        Thread.sleep(3000);


        String bb = inTrips.init(t1).employeeNameOne();
        Assertion.assertEqual(employeeName,bb,"both same ",t1);

    }
}
