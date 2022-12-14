package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.Page_info.Fleet_DetailFleet_Page;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkAssignVehiclesEdit_NavigationTest extends TestInit
{
    @Test
    public void checkAssignVehiclesEdit_Navigation() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("Check assignVehicles", "assignVehicles");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(3000);
        SubFleetsPage.init(t1).clcikonfleet();
        SubFleetsPage.init(t1).clickAssign();
        String s = driver.getCurrentUrl();

        Assertion.verifyContains(s, "edit", "the page is navigated to assignVehicles page ", t1);
    }
}
