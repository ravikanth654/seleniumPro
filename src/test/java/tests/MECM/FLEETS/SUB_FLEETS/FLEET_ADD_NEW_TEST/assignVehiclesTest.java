package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class assignVehiclesTest extends TestInit
{
    @Test
    public void swapingVehicles() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Clicking on assign vehicle and swapping  ", "vehicles swapping");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        SubFleetsPage.init(t1).assing();
        Thread.sleep(3000);
        String a = SubFleetsPage.init(t1).swapNum();
        System.out.println("a "+a);
        Thread.sleep(1000);
        SubFleetsPage.init(t1).swap();
        Thread.sleep(3000);
        String b = SubFleetsPage.init(t1).afterSwap();
        System.out.println("b "+b);

        Assertion.assertEqual(a,b,"Swapped number",t1);
    }
}
