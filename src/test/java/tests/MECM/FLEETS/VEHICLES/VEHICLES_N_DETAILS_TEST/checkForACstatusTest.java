package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkForACstatusTest extends TestInit
{
    @Test
    public void acStatus() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("acStatus ", "acStatus");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();

        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(3000);

        String ac = fleetVehiclesPage.init(t1).getAcStatus();
        fleetVehiclesPage.init(t1).clickOn1stRow();
        Thread.sleep(2000);
        String inAC = fleetVehiclesPage.init(t1).detailAC();
        System.out.println(ac);
        System.out.println(inAC);

        Assertion.assertEqual(ac,inAC,"Both status same",t1);
    }
}
