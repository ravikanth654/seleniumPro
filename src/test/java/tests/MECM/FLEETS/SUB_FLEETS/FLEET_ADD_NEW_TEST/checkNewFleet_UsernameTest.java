package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;

public class checkNewFleet_UsernameTest extends TestInit
{
    @Test
    public void checkNewFleet_Username() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Eneter value in subfleet name ", "Eneter value in subfleet name ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        String s=null;
        String fleetName = GeneratingRandom.fourchar(s);
        SubFleetsPage.init(t1).fleetNmae(fleetName);
        String dd = SubFleetsPage.init(t1).fltName();
        System.out.println("the value "+dd);

        Assertion.assertEqual(fleetName,dd,"Bothe same ",t1);
    }
}
