package tests.MECM.TRIPS.TRIP_ADHOC.TRIP_ADHOC_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.pageObjects.MECM.TRIPS.tripAdhoc;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.List;

public class totalCountBy_Page10_25_50Test extends TestInit {

    int ttlcnt;
    @Test
    public void totalCountBy_Page10_25_50() throws Exception {
        ExtentTest t1 = pNode.createNode("totalCountBy_Page10_25_50 ", "totalCountBy_Page10_25_50");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(4000);
        inTrips.init(t1).ARYA();
        Thread.sleep(2000);
        tripAdhoc.init(t1).tripAdhoc();
        Thread.sleep(4000);
        inTrips.init(t1).startDate("01012020");
        Thread.sleep(6000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        String t = SubFleetsPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        ttlcnt = Integer.parseInt(s);
        System.out.println("now see " + ttlcnt);

        if (ttlcnt <= 10) {

            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("10");
            Thread.sleep(2000);

            System.out.println("10 ka totl " + ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("10 ka size " + cnt);

            Assertion.assertEqual(ttlcnt * 2, cnt, "Verifing total trips", t1);
        } else if (ttlcnt > 10 && ttlcnt <= 25) {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("25");
            Thread.sleep(2000);

            System.out.println("25 ka total" + ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("25 ka page" + cnt);

            Assertion.assertEqual(ttlcnt * 2, cnt, "Verifing total trips", t1);

        } else if (ttlcnt > 25 && ttlcnt <= 50) {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("50");
            Thread.sleep(3000);

            System.out.println("50 ka cnt" + ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("50 ka page" + cnt);

            Assertion.assertEqual(ttlcnt * 2, cnt, "Verifing total trips", t1);

        } else {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("10");
            Thread.sleep(2000);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("last" + cnt);

            Assertion.assertEqual(20, cnt, "Verifying total trips", t1);

        }
    }
}
