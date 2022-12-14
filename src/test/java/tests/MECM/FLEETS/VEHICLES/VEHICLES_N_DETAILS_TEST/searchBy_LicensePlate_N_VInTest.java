package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import tests.TestInit;

public class searchBy_LicensePlate_N_VInTest extends TestInit
{
    @Test(priority = 0)
    public void Search_byLicencePlate() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By licence plate ", "Search by licence plate ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(3000);

        String s1 =fleetVehiclesPage.init(t1).getFirstRowLicencePlate();
        System.out.println(s1);
        fleetVehiclesPage.init(t1).search_sendvalue(s1);
        fleetVehiclesPage.init(t1).clickSearch();
        Thread.sleep(1000);
        String s2 = fleetVehiclesPage.init(t1).getFirstRowLicencePlate();
        System.out.println(s2);

        Assertion.assertEqual(s1, s2, "Verifing the value", t1);
        fleetVehiclesPage.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        fleetVehiclesPage.init(t1).clcikVehicl();
    }

    @Test(priority = 1)
    public void Search_byVin() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By Vin ", "Search by VIN ");
        String s1 = fleetVehiclesPage.init(t1).getsecondRowVin();
        System.out.println(s1);
        fleetVehiclesPage.init(t1).search_sendvalue(s1);
        fleetVehiclesPage.init(t1).clickSearch();
        Thread.sleep(1000);

        String s2 = fleetVehiclesPage.init(t1).getfirstRowVin();
        System.out.println(s2);

        Assertion.assertEqual(s1, s2, "Verifing the value", t1);
        fleetVehiclesPage.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        fleetVehiclesPage.init(t1).clcikVehicl();
    }

}
