package tests.MECM.TRIPS.COMMUTER.COMMUTER_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Test;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tests.TestInit;

import java.io.IOException;
import java.util.List;

public class totalCountBy_Page10_25_50Test extends TestInit
{
    int ttlcnt;
    @org.testng.annotations.Test
    public void Total_Subfleet_countsBy10_25_50() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Total subfleet", "Compare total number of subfleet with total rows");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(2000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(5000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(7000);


        String ss = fleetDriverPage.init(t1).ttl();
        ttlcnt = Integer.parseInt(ss);
        System.out.println("now see "+ttlcnt);

        WebElement element = driver.findElement(By.xpath(("//label[.='Show']//..//select")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        if(ttlcnt <=10) {

            Select sl = new Select(driver.findElement(By.xpath("//label[.='Show']//..//select")));
            sl.selectByVisibleText("10");
            Thread.sleep(2000);

            System.out.println("10 ka totl"+ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("10 ka size"+cnt);

            Assertion.assertEqual(ttlcnt, cnt, "Verifing total subfleets", t1);
        }
        else if(ttlcnt >10 && ttlcnt <=25)
        {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Show']//..//select")));
            sl.selectByVisibleText("25");
            Thread.sleep(2000);

            System.out.println("25 ka total"+ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("25 ka page"+cnt);

            Assertion.assertEqual(ttlcnt, cnt, "Verifing total subfleets", t1);

        }

        else if(ttlcnt >25 && ttlcnt <=50)
        {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Show']//..//select")));
            sl.selectByVisibleText("50");
            Thread.sleep(3000);

            System.out.println("50 ka cnt"+ttlcnt);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("50 ka page"+cnt);

            Assertion.assertEqual(ttlcnt, cnt, "Verifing total subfleets", t1);

        }
        else
        {
            Select sl = new Select(driver.findElement(By.xpath("//label[.='Show']//..//select")));
            sl.selectByVisibleText("10");
            Thread.sleep(2000);

            List<WebElement> lst = driver.findElements(By.xpath("//tbody//tr"));
            int cnt = lst.size();
            System.out.println("last"+cnt);

            Assertion.assertEqual(10, cnt, "Verifying total subfleets", t1);

        }
    }
}
