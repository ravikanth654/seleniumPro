package tests.MECM.TRIPS.COMMUTER.COMMUTER_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkPlaceHolderTextInsideSearchBoxTest extends TestInit
{
    @Test
    public void checkPlaceHolder()throws Exception {
        ExtentTest t1 = pNode.createNode("checkPlaceHolder", "checkPlaceHolder");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(1000);
        inTrips.init(t1).TRIPS().ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(4000);


        String plholder=SubFleetsPage.init(t1).getplaceHolder();
        System.out.println(plholder);

        Assertion.assertEqual(plholder,"Search by Name / Email","place holder",t1);

    }
}
