package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;
import java.util.List;

public class compareRowsOf_DriversVehiclesTest extends TestInit
{
    @Test(priority = 0)
    public void comparerowsOfVehicles() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Check for rows count in detail page of vehicles", "verify rows count");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).clcikonfleet();
        Thread.sleep(3000);
        List<WebElement> lst1 = driver.findElements(By.xpath("(//*[.='Selected Vehicles List']/following::div[@class='m-table table-responsive']//table//thead/following::tbody)[1]//tr"));
        int sz = lst1.size();
        System.out.println(sz);
        String vehiclesss = SubFleetsPage.init(t1).getnoOfvehicles();
        int c1 = Integer.parseInt(vehiclesss);
        System.out.println(c1);

        Assertion.assertEqual(sz,c1,"Both count ",t1);
    }

    @Test(priority = 1)
    public void comparerowsOfDrivers() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Check for rows count in detail page of drivers", "verify rows count");
        List<WebElement> lst1 = driver.findElements(By.xpath("(//*[.='Selected Drivers List']/following::div[@class='m-table table-responsive']//table//thead/following::tbody)[1]//tr"));
        int sz = lst1.size();
        System.out.println(sz);
        String drvs = SubFleetsPage.init(t1).getnoOfdrivers();
        int c2 = Integer.parseInt(drvs);
        System.out.println(c2);

        Assertion.assertEqual(sz,c2,"Both count ",t1);
    }
}
