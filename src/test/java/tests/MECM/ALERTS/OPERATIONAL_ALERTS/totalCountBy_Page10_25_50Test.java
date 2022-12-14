/*
package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;
import java.util.List;

public class totalCountBy_Page10_25_50Test extends TestInit
{
    int ttlcnt;
    @Test
    public void Total_Subfleet_countsBy10_25_50() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Total trips", "Compare total number of trips with total rows");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(3000);
        inTrips.init(t1).startDate("11112018");
        Thread.sleep(6000);
        driver.navigate().refresh();
        Thread.sleep(7000);

        String t = SubFleetsPage.init(t1).totalrows();
        String[] sp = t.split(" ");
        String s = sp[4];
        ttlcnt = Integer.parseInt(s);
        System.out.println("now see " + ttlcnt);
        if(ttlcnt <=10) {

            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("10");
            Thread.sleep(2000);

            System.out.println("10 ka totl "+ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("10 ka size "+cnt);

            Assertion.assertEqual(ttlcnt*2, cnt, "Verifing total trips", t1);
        }
        else if(ttlcnt >10 && ttlcnt <=25)
        {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("25");
            Thread.sleep(2000);

            System.out.println("25 ka total"+ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("25 ka page"+cnt);

            Assertion.assertEqual(ttlcnt, cnt, "Verifing total trips", t1);

        }

        else if(ttlcnt >25 && ttlcnt <=50)
        {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("50");
            Thread.sleep(3000);

            System.out.println("50 ka cnt"+ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("50 ka page"+cnt);

            Assertion.assertEqual(ttlcnt*2, cnt, "Verifing total trips", t1);

        }
        else
        {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Page size ']//..//select")));
            sl.selectByVisibleText("10");
            Thread.sleep(2000);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("last"+cnt);

            Assertion.assertEqual(20, cnt, "Verifying total trips", t1);

        }
    }
}
*/
