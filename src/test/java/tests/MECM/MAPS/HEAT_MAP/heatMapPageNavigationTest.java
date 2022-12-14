package tests.MECM.MAPS.HEAT_MAP;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.MAPS.heatMap_PathTracking_Geofencing;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class heatMapPageNavigationTest extends TestInit
{

    @Test
    public void heatMapPageNavigation()throws Exception {
        ExtentTest t1 = pNode.createNode("heatMapPageNavigation", "heatMapPageNavigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        heatMap_PathTracking_Geofencing.init(t1).maps()
        .clickingHeatMap();
        String url = driver.getCurrentUrl();
        String url1 = "heat-map";

        Assertion.verifyContains(url,url1,"both url is same",t1);




    }
}
