package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkChangingStatus_DsblEnblTest extends TestInit
{
    @Test
    public void getStatusMessage() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("Assign driver navigation", "Assign driver navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(2000);

        String statusOut = SubFleetsPage.init(t1).getStatus();
        System.out.println("1st status "+statusOut);
        if(statusOut.equals("Active"))
        {
            SubFleetsPage.init(t1).clcikonfleet();
            Thread.sleep(3000);
            SubFleetsPage.init(t1).status_click();
            Thread.sleep(5000);
            String get = SubFleetsPage.init(t1).getEnblDsbl();
            System.out.println(get);
            Thread.sleep(3000);
            SubFleetsPage.init(t1).subfleet();
            Thread.sleep(4000);
            String statusOut1 = SubFleetsPage.init(t1).getStatus();
            System.out.println(statusOut1);

            Assertion.assertEqual(statusOut1,"InActive","status changed",t1);
           // Assertion.assertEqual(get,"DISABLE","status changed",t1);
        }
        else
        {
            SubFleetsPage.init(t1).clcikonfleet();
            Thread.sleep(3000);
            SubFleetsPage.init(t1).status_click();
            Thread.sleep(5000);
            String get1 = SubFleetsPage.init(t1).getEnblDsbl();
            System.out.println(get1);
            Thread.sleep(3000);
            SubFleetsPage.init(t1).subfleet();
            Thread.sleep(4000);
            String statusOut11 = SubFleetsPage.init(t1).getStatus();
            System.out.println(statusOut11);

            Assertion.assertEqual(statusOut11,"Active","status changed",t1);
            //Assertion.assertEqual(get1,"ENABLE","status changed",t1);
        }

    }
}
