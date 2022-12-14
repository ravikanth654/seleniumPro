package tests.MECM.FLEETS.DRIVERS.DRIVER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class clickingOnDrivers_PageNavigationTest extends TestInit
{
    @Test
    public void clickingOnDrivers() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Clicking on Drivers", "click on driver and compare URL");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        String expectedUrl="https://stg-nemo.mahindraelectric.com/mcms/drivers";
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        String actualUrl = driver.getCurrentUrl();

        Assertion.assertEqual(expectedUrl,actualUrl,"Comparing the URl clicking on vehicles",t1);
    }
}
