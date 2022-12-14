package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkForPageHeadingTest extends TestInit
{
    @Test
    public void checkForPageHeading()throws Exception {
        ExtentTest t1 = pNode.createNode("checkForPageHeading", "checkForPageHeading");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        String imc = dashBoard.init(t1).imc();
        String imc2 = "Integrated Mobility Center";

        Assertion.assertEqual(imc, imc2, "both same", t1);
    }

}
