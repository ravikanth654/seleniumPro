package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
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
        Thread.sleep(2000);
        String plholder=SubFleetsPage.init(t1).getplaceHolder();
        System.out.println(plholder);

        Assertion.assertEqual(plholder,"Search by name/ email","place holder",t1);

    }
}
