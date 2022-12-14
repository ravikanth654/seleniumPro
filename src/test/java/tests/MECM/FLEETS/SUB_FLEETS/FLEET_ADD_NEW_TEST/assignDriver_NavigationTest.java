package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class assignDriver_NavigationTest extends TestInit
{
    @Test
    public void assigndriver() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Clicking on assign driver and swapping  ", "driver swapping");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        String c = "Available Drivers";
        String b = SubFleetsPage.init(t1).drivers().driver();

        Assertion.assertEqual(b,c,"same",t1);
    }

}
