package tests.MECM.MAPS.GEO_FENCING;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.MAPS.heatMap_PathTracking_Geofencing;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class geoFencingPageNavigationTest extends TestInit
{
    @Test
    public void geoFencingPageNavigation()throws Exception {
        ExtentTest t1 = pNode.createNode("geoFencingPageNavigation", "geoFencingPageNavigation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();

        heatMap_PathTracking_Geofencing.init(t1).maps().FENCING();
        String url = driver.getCurrentUrl();

        String url1="geo-fencing";

        Assertion.verifyContains(url,url1,"both url same",t1);

    }
}
