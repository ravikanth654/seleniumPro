package tests.MECM.MAPS.PATH_TRACKING;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.MAPS.heatMap_PathTracking_Geofencing;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class enteringInvalidVinTest extends TestInit
{
    @Test
    public void enteringInvalidVin() throws IOException, InterruptedException {

        ExtentTest t1 = pNode.createNode("enteringInvalidVin", "enteringInvalidVin");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();

        heatMap_PathTracking_Geofencing.init(t1).maps()
                .clickingHeatMap();
        Thread.sleep(1000);
        heatMap_PathTracking_Geofencing.init(t1).TRACKING();
        Thread.sleep(3000);
        heatMap_PathTracking_Geofencing.init(t1).vinNo("lol");
        String ss="Requested resource not found";
        heatMap_PathTracking_Geofencing.init(t1).submit();
        Thread.sleep(2000);
        String error = heatMap_PathTracking_Geofencing.init(t1).error_message();
        System.out.println("the error "+error);
        System.out.println("error "+error);

        Assertion.assertEqual(error,ss,"both same",t1);






    }
}
