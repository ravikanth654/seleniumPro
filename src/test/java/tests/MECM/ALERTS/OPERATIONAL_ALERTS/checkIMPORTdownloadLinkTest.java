package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
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
        alerts.init(t1).aletsNavigation();
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(2000);
        inTrips.init(t1).startDate("11112018");
        Thread.sleep(3000);
        alerts.init(t1).actionClick();
        Thread.sleep(2000);
        String s=alerts.init(t1).exportClickTag();
        Assertion.assertEqual(s,"a","comparing tag",t1);

    }
}
