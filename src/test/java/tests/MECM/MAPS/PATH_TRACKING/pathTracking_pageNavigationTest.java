package tests.MECM.MAPS.PATH_TRACKING;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.MAPS.heatMap_PathTracking_Geofencing;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class pathTracking_pageNavigationTest extends TestInit
{
    @Test
    public void pathTracking_pageNavigation()throws Exception {
        ExtentTest t1 = pNode.createNode("pathTracking_pageNavigation", "pathTracking_pageNavigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        heatMap_PathTracking_Geofencing.init(t1).maps()
                .clickingHeatMap();
        heatMap_PathTracking_Geofencing.init(t1).TRACKING();
        String url = driver.getCurrentUrl();

        String url2="path-tracking";

        Assertion.verifyContains(url,url2,"both same",t1);



    }
}
