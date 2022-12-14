package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkAsignVehicle_NavigationTest extends TestInit
{
    @Test
    public void assigning() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Clicking on assign ", "Clicking on assign");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        SubFleetsPage.init(t1).assing();
        String s="Available Vehicles";
        String a = SubFleetsPage.init(t1).lable();
        System.out.println("-->"+a);

        Assertion.assertEqual(a, s, "Assigning vehicle page", t1);
    }

}
