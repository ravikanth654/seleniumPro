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

public class checkAllDetailsInDriverTest extends TestInit
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
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//td[10]//i"));
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(3000);

        String a = inTrips.init(t1).indriverNeme();
        System.out.println(a);
        String b = inTrips.init(t1).inGender();
        System.out.println(b);
        String c = inTrips.init(t1).inPhone();
        System.out.println(c);
        String d = inTrips.init(t1).inEmail();
        System.out.println(d);
        String e = inTrips.init(t1).inAdress();
        System.out.println(e);


        JavascriptExecutor jss = (JavascriptExecutor) driver;
        WebElement button1 = driver.findElement(By.xpath("//td[@class='cursor_ptr text-danger']"));
        jss.executeScript("arguments[0].click();", button1);
        Thread.sleep(4000);

        WebElement button1v = driver.findElement(By.xpath("//a[.=' TRIP DETAILS ']"));
        js.executeScript("arguments[0].click();", button1v);

        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

        WebElement button11 = driver.findElement(By.xpath("//a[.=' DRIVER DETAILS ']"));
        js.executeScript("arguments[0].click();", button11);

        String aa = inTrips.init(t1).indriverNeme();
        System.out.println(aa);
        String bb = inTrips.init(t1).inGender();
        System.out.println(bb);
        String cc = inTrips.init(t1).inPhone();
        System.out.println(cc);
        String dd = inTrips.init(t1).inEmail();
        System.out.println(dd);
        String ee = inTrips.init(t1).inAdress();
        System.out.println(ee);


        Assertion.verifyEqual(a,aa,"Driver Name",t1);
        Assertion.verifyEqual(b,bb,"Gender",t1);
        Assertion.verifyEqual(c,cc,"Phone",t1);
        Assertion.verifyEqual(d,dd,"E-Mail",t1);
        Assertion.verifyEqual(e,ee,"Address",t1);




    }
}
