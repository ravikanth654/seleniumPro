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

public class checkAllDetailsInEmployeeTest extends TestInit
{
    @Test
    public void checkAllDetailsInDriver() throws Exception {
        ExtentTest t1 = pNode.createNode("checkAllDetailsInDriver ", "checkAllDetailsInDriver");
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
        String no = inTrips.init(t1).noOfEmployee();
        int noEmp = Integer.parseInt(no);
        Thread.sleep(2000);


        if(noEmp==1)
        {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement button = driver.findElement(By.xpath("//td[10]//i"));
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

            int aa = inTrips.init(t1).insideCOuntsOfEmployeeHeader();
            String bb = inTrips.init(t1).employeeNameOne();
            String cc = inTrips.init(t1).empIdOne();
            String dd = inTrips.init(t1).empMobileOne();
            String ee = inTrips.init(t1).empScheduledTimeOne();
            String ff = inTrips.init(t1).empCheckTimeOne();
            String gg = inTrips.init(t1).empCheckOutOne();


            Assertion.verifyEqual(a,aa,"total count",t1);
            Assertion.verifyEqual(b,bb,"Employee Name ",t1);
            Assertion.verifyEqual(c,cc,"Employee ID",t1);
            Assertion.verifyEqual(d,dd,"Employee Mobile",t1);
            Assertion.verifyEqual(e,ee,"Employee Scheduled Time",t1);
            Assertion.verifyEqual(f,ff,"Employee CheckIn Time",t1);
            Assertion.verifyEqual(g,gg,"Employee CheckOut Time",t1);


        }
        else if(noEmp==2)
        {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement button = driver.findElement(By.xpath("//td[10]//i"));
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


            String b2 = inTrips.init(t1).employeeNameTwo();
            String c2 = inTrips.init(t1).empIdTwo();
            String d2 = inTrips.init(t1).empMobileTwo();
            String e2 = inTrips.init(t1).empScheduledTimeTwo();
            String f2 = inTrips.init(t1).empCheckTimeTwo();
            String g2 = inTrips.init(t1).empCheckOutTwo();

            JavascriptExecutor jss = (JavascriptExecutor) driver;
            WebElement button1 = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
            jss.executeScript("arguments[0].click();", button1);
            Thread.sleep(4000);

            WebElement button1v = driver.findElement(By.xpath("//a[.=' TRIP DETAILS ']"));
            js.executeScript("arguments[0].click();", button1v);

            ((JavascriptExecutor) driver)
                    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
            Thread.sleep(2000);
            WebElement button11 = driver.findElement(By.xpath("//a[.=' EMPLOYEES ']//..//i"));
            js.executeScript("arguments[0].click();", button11);
            Thread.sleep(3000);

            int aa = inTrips.init(t1).insideCOuntsOfEmployeeHeader();
            String bb = inTrips.init(t1).employeeNameOne();
            String cc = inTrips.init(t1).empIdOne();
            String dd = inTrips.init(t1).empMobileOne();
            String ee = inTrips.init(t1).empScheduledTimeOne();
            String ff = inTrips.init(t1).empCheckTimeOne();
            String gg = inTrips.init(t1).empCheckOutOne();

            String bb2 = inTrips.init(t1).employeeNameTwo();
            String cc2 = inTrips.init(t1).empIdTwo();
            String dd2 = inTrips.init(t1).empMobileTwo();
            String ee2 = inTrips.init(t1).empScheduledTimeTwo();
            String ff2 = inTrips.init(t1).empCheckTimeTwo();
            String gg2 = inTrips.init(t1).empCheckOutTwo();


            Assertion.verifyEqual(a,aa,"total count",t1);
            Assertion.verifyEqual(b,bb,"Employee Name ",t1);
            Assertion.verifyEqual(c,cc,"Employee ID",t1);
            Assertion.verifyEqual(d,dd,"Employee Mobile",t1);
            Assertion.verifyEqual(e,ee,"Employee Scheduled Time",t1);
            Assertion.verifyEqual(f,ff,"Employee CheckIn Time",t1);
            Assertion.verifyEqual(g,gg,"Employee CheckOut Time",t1);

            Assertion.verifyEqual(b2,bb2,"Employee Name ",t1);
            Assertion.verifyEqual(c2,cc2,"Employee ID",t1);
            Assertion.verifyEqual(d2,dd2,"Employee Mobile",t1);
            Assertion.verifyEqual(e2,ee2,"Employee Scheduled Time",t1);
            Assertion.verifyEqual(f2,ff2,"Employee CheckIn Time",t1);
            Assertion.verifyEqual(g2,gg2,"Employee CheckOut Time",t1);

        }
        else
        {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement button = driver.findElement(By.xpath("//td[10]//i"));
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


            String b2 = inTrips.init(t1).employeeNameTwo();
            String c2 = inTrips.init(t1).empIdTwo();
            String d2 = inTrips.init(t1).empMobileTwo();
            String e2 = inTrips.init(t1).empScheduledTimeTwo();
            String f2 = inTrips.init(t1).empCheckTimeTwo();
            String g2 = inTrips.init(t1).empCheckOutTwo();


            String b3 = inTrips.init(t1).employeeNameThree();
            String c3 = inTrips.init(t1).empIdThree();
            String d3 = inTrips.init(t1).empMobileThree();
            String e3 = inTrips.init(t1).empScheduledTimeThree();
            String f3 = inTrips.init(t1).empCheckTimeThree();
            String g3 = inTrips.init(t1).empCheckOutThree();

            JavascriptExecutor jss = (JavascriptExecutor) driver;
            WebElement button1 = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
            jss.executeScript("arguments[0].click();", button1);
            Thread.sleep(4000);

            WebElement button1v = driver.findElement(By.xpath("//a[.=' TRIP DETAILS ']"));
            js.executeScript("arguments[0].click();", button1v);

            ((JavascriptExecutor) driver)
                    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
            Thread.sleep(2000);
            WebElement button11 = driver.findElement(By.xpath("//a[.=' EMPLOYEES ']//..//i"));
            js.executeScript("arguments[0].click();", button11);
            Thread.sleep(3000);
            int aa = inTrips.init(t1).insideCOuntsOfEmployeeHeader();
            String bb = inTrips.init(t1).employeeNameOne();
            String cc = inTrips.init(t1).empIdOne();
            String dd = inTrips.init(t1).empMobileOne();
            String ee = inTrips.init(t1).empScheduledTimeOne();
            String ff = inTrips.init(t1).empCheckTimeOne();
            String gg = inTrips.init(t1).empCheckOutOne();

            String bb2 = inTrips.init(t1).employeeNameTwo();
            String cc2 = inTrips.init(t1).empIdTwo();
            String dd2 = inTrips.init(t1).empMobileTwo();
            String ee2 = inTrips.init(t1).empScheduledTimeTwo();
            String ff2 = inTrips.init(t1).empCheckTimeTwo();
            String gg2 = inTrips.init(t1).empCheckOutTwo();

            String bb3 = inTrips.init(t1).employeeNameThree();
            String cc3 = inTrips.init(t1).empIdThree();
            String dd3 = inTrips.init(t1).empMobileThree();
            String ee3 = inTrips.init(t1).empScheduledTimeThree();
            String ff3 = inTrips.init(t1).empCheckTimeThree();
            String gg3 = inTrips.init(t1).empCheckOutThree();


            Assertion.verifyEqual(a,aa,"total count",t1);
            Assertion.verifyEqual(b,bb,"Employee Name ",t1);
            Assertion.verifyEqual(c,cc,"Employee ID",t1);
            Assertion.verifyEqual(d,dd,"Employee Mobile",t1);
            Assertion.verifyEqual(e,ee,"Employee Scheduled Time",t1);
            Assertion.verifyEqual(f,ff,"Employee CheckIn Time",t1);
            Assertion.verifyEqual(g,gg,"Employee CheckOut Time",t1);

            Assertion.verifyEqual(b2,bb2,"Employee Name ",t1);
            Assertion.verifyEqual(c2,cc2,"Employee ID",t1);
            Assertion.verifyEqual(d2,dd2,"Employee Mobile",t1);
            Assertion.verifyEqual(e2,ee2,"Employee Scheduled Time",t1);
            Assertion.verifyEqual(f2,ff2,"Employee CheckIn Time",t1);
            Assertion.verifyEqual(g2,gg2,"Employee CheckOut Time",t1);

            Assertion.verifyEqual(b3,bb3,"Employee Name ",t1);
            Assertion.verifyEqual(c3,cc3,"Employee ID",t1);
            Assertion.verifyEqual(d3,dd3,"Employee Mobile",t1);
            Assertion.verifyEqual(e3,ee3,"Employee Scheduled Time",t1);
            Assertion.verifyEqual(f3,ff3,"Employee CheckIn Time",t1);
            Assertion.verifyEqual(g3,gg3,"Employee CheckOut Time",t1);

        }

    }
}
