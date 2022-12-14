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

public class checkAllDetailsInEmployeeTest extends TestInit
{
    @Test
    public void checkAllDetailsInEmployee() throws Exception {
        ExtentTest t1 = pNode.createNode("checkAllDetailsInEmployee ", "checkAllDetailsInEmployee");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(4000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td[11]//i"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(3000);
        WebElement button1vv = driver.findElement(By.xpath("//a[.='EMPLOYEES']"));
        js.executeScript("arguments[0].click();", button1vv);
        Thread.sleep(4000);
        int a = inTrips.init(t1).insideCOuntsOfEmployeeHeader();
        String b = inTrips.init(t1).employeeNameOne();
        String c = inTrips.init(t1).empIdOne();
        String d = inTrips.init(t1).empMobileOne();
        String e = inTrips.init(t1).empScheduledTimeOne();
        String f = inTrips.init(t1).empCheckTimeOne();
        String g = inTrips.init(t1).empCheckOutOne();
        Thread.sleep(3000);
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        WebElement button1 = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
        jss.executeScript("arguments[0].click();", button1);
        Thread.sleep(4000);

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
        String cc = inTrips.init(t1).empIdOne();
        String dd = inTrips.init(t1).empMobileOne();
        String ee = inTrips.init(t1).empScheduledTimeOne();
        String ff = inTrips.init(t1).empCheckTimeOne();
        String gg = inTrips.init(t1).empCheckOutOne();


     //   Assertion.verifyEqual(a,aa,"total count",t1);
        Assertion.verifyEqual(b,bb,"Employee Name ",t1);
        Assertion.verifyEqual(c,cc,"Employee ID",t1);
        Assertion.verifyEqual(d,dd,"Employee Mobile",t1);
        Assertion.verifyEqual(e,ee,"Employee Scheduled Time",t1);
        Assertion.verifyEqual(f,ff,"Employee CheckIn Time",t1);
        Assertion.verifyEqual(g,gg,"Employee CheckOut Time",t1);



    }
}
