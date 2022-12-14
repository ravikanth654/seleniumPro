package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkPlaceHolderTextInsideSearchBoxTest extends TestInit
{
    @Test
    public void checkPlaceHolder()throws Exception {
        ExtentTest t1 = pNode.createNode("checkPlaceHolder", "checkPlaceHolder");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(2000);
        String plholder=SubFleetsPage.init(t1).getplaceHolder();
        System.out.println(plholder);

        Assertion.assertEqual(plholder,"search by vin/ licensePlate","place holder",t1);

    }
}
