package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class sosStatusTest extends TestInit
{
    @Test
    public void sosStatus() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("sosStatus ", "sosStatus");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();

        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(3000);

        String ac = fleetVehiclesPage.init(t1).getSOSStatus();
        double yes = Double.parseDouble(ac);
        int l = (int) yes;
        System.out.println(l);
        fleetVehiclesPage.init(t1).clickOn1stRow();
        Thread.sleep(2000);
        String inAC = fleetVehiclesPage.init(t1).detailSOS();
        String vv = inAC.replaceAll("\\s+", "");
        String num = vv.substring(0, vv.length() - 1);

        int isit = Integer.parseInt(num);
        System.out.println(isit);

        Assertion.assertEqual(l,isit,"Both status same",t1);
    }
}
