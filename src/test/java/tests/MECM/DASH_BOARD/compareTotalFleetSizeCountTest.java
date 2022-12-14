package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.concurrent.TimeUnit;

public class compareTotalFleetSizeCountTest extends TestInit
{
    @Test
    public void compareTotalFleetSizeCount()throws Exception {
        ExtentTest t1 = pNode.createNode("compareTotalFleetSizeCount", "compareTotalFleetSizeCount");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        //driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        Thread.sleep(9000);
        String size = dashBoard.init(t1).TOTALFLEETSIZE();
        int sz = Integer.parseInt(size);
        Thread.sleep(2000);
        dashBoard.init(t1).TOTALFLEETSIZEclick();
        Thread.sleep(6000);
        //driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        String ss = fleetVehiclesPage.init(t1).ttl();
        int ttlcnt = Integer.parseInt(ss);
        System.out.println(ttlcnt);
        System.out.println(sz);

        Assertion.assertEqual(ttlcnt,sz,"same",t1);

    }
}
