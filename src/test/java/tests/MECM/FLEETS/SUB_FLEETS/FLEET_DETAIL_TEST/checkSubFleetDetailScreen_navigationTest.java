package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

import static java.lang.Thread.*;

public class checkSubFleetDetailScreen_navigationTest extends TestInit
{
    @Test
    public void navigateTodetailFleets() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("detail SubFleet navigation", "detail SubFleet navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        sleep(1000);

        SubFleetsPage.init(t1).clcikonfleet();
        String s="Sub Fleet Details";
        String str = SubFleetsPage.init(t1).detailFleetNavigation();

        Assertion.assertEqual(str,s,"detail SubFleet navigation ",t1);
    }
}
