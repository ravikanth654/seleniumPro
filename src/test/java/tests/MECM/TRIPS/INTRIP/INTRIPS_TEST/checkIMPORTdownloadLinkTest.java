package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkIMPORTdownloadLinkTest extends TestInit
{
    @Test
    public void checkIMPORTdownloadLink() throws Exception {
        ExtentTest t1 = pNode.createNode("checkIMPORTdownloadLink ", "checkIMPORTdownloadLink");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).clickOnMoreOption();
        Thread.sleep(2000);
        inTrips.init(t1).uploadTrips();
        String s=SubFleetsPage.init(t1).downloadImportTripsTag();
        Assertion.assertEqual(s,"a","comparing tag",t1);

    }
}
