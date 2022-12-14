package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkHeadingOfTableTest extends TestInit
{
    @Test
    public void checkHeadingOfTable() throws Exception {
        ExtentTest t1 = pNode.createNode("checkHeadingOfTableTest ", "checkHeadingOfTableTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(2000);
        String s = "LIST OF OPERATIONAL ALERTS";
        String txt = alerts.init(t1).listOfOperationTExt();

        Assertion.assertEqual(txt,s,"same",t1);

    }
}
