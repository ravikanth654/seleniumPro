package tests.MECM.MAPS.PATH_TRACKING;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Test;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.MAPS.heatMap_PathTracking_Geofencing;
import framework.util.common.Assertion;
import tests.TestInit;


public class checkSearchDisbld_forEmptyVinTest extends TestInit
{
    @org.testng.annotations.Test
    public void checkSearchDisbld_forEmptyVin()throws Exception {
        ExtentTest t1 = pNode.createNode("checkSearchDisbld_forEmptyVin", "checkSearchDisbld_forEmptyVin");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();

        heatMap_PathTracking_Geofencing.init(t1).maps()
                .clickingHeatMap();
        Thread.sleep(1000);
        heatMap_PathTracking_Geofencing.init(t1).TRACKING();
        Thread.sleep(3000);
        boolean is = heatMap_PathTracking_Geofencing.init(t1).searchDisbled();
        System.out.println(is);

        Assertion.assertEqual(is,false,"disbld",t1);


    }
}
