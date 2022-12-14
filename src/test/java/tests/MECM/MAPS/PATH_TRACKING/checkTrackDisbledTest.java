package tests.MECM.MAPS.PATH_TRACKING;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.MAPS.heatMap_PathTracking_Geofencing;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkTrackDisbledTest extends TestInit {
    @Test
    public void checkTrackDisbled() throws Exception {
        ExtentTest t1 = pNode.createNode("checkTrackDisbled", "checkTrackDisbled");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();

        heatMap_PathTracking_Geofencing.init(t1).maps()
                .clickingHeatMap();
        Thread.sleep(1000);
        heatMap_PathTracking_Geofencing.init(t1).TRACKING();
        Thread.sleep(3000);

        heatMap_PathTracking_Geofencing.init(t1).vinNo("MB7D8RF3BJJG21582");
        heatMap_PathTracking_Geofencing.init(t1).submit();
        Thread.sleep(2000);

        boolean is = heatMap_PathTracking_Geofencing.init(t1).TrackDisbled();
        System.out.println(is);

        Assertion.assertEqual(is, false, "both true", t1);
    }
}
