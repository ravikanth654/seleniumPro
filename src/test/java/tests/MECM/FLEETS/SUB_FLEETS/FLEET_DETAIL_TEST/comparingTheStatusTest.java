package tests.MECM.FLEETS.SUB_FLEETS.FLEET_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class comparingTheStatusTest extends TestInit
{
    @Test
    public void comparingTheStatus() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("Assign driver navigation", "Assign driver navigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(2000);

        String statusOut = SubFleetsPage.init(t1).getStatus();
        System.out.println(statusOut);
        SubFleetsPage.init(t1).clcikonfleet();
        Thread.sleep(5000);
        String statusIn = SubFleetsPage.init(t1).getEnblDsbl();
        System.out.println(statusIn);

        if(statusOut.equals("Active"))
        {
            boolean is = statusIn.equals("DISABLE");
            System.out.println(is);
            Assertion.assertEqual(is,true,"status same",t1);
        }
        else
        {
            boolean is = statusIn.equals("ENABLE");
            System.out.println(is);
            Assertion.assertEqual(is,true,"status same",t1);
        }


    }

}
