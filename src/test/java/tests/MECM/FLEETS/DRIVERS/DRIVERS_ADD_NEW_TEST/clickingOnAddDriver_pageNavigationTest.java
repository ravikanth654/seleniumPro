package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class clickingOnAddDriver_pageNavigationTest extends TestInit
{
    @Test
    public void clickingOnAddDriver() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Clicking on Drivers", "click on driver and compare URL");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        String expectedUrl="https://stg-nemo.mahindraelectric.com/mcms/driver/new";
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        String actualUrl = driver.getCurrentUrl();

        Assertion.verifyContains(expectedUrl,actualUrl,"Comparing the URl clicking on add driver",t1);
    }
}
