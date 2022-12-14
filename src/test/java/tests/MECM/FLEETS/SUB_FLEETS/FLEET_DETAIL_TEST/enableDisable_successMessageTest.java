package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class enableDisable_successMessageTest extends TestInit
{
    @Test
    public void enableDisable_successMessage() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("Assign driver navigation", "Assign driver navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).clcikonfleet();
        Thread.sleep(2000);

        String stateenbl="customer enabled successfully!!";
        String statedsbl="customer disabled successfully!!";

        String get = SubFleetsPage.init(t1).getEnblDsbl();
        if(get.equals("ENABLE"))
        {
            SubFleetsPage.init(t1).status_click();
            String status = SubFleetsPage.init(t1).getStatusAlert();
            Assertion.assertEqual(status,stateenbl," status successful message",t1);
        }
        else
        {
            SubFleetsPage.init(t1).status_click();
            String status = SubFleetsPage.init(t1).getStatusAlert();
            Assertion.assertEqual(status,statedsbl," status successful message",t1);
        }
    }
}
