package tests.MECM.MAPS.PATH_TRACKING;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.MAPS.heatMap_PathTracking_Geofencing;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkPlaceHolderTextInsideSearchBoxTest extends TestInit
{
    @Test
    public void checkPlaceHolderTextInsideSearchBox()throws Exception
    {
        ExtentTest t1 = pNode.createNode("checkPlaceHolderTextInsideSearchBoxTest", "checkPlaceHolderTextInsideSearchBoxTest");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        heatMap_PathTracking_Geofencing.init(t1).maps()
                .clickingHeatMap();
        Thread.sleep(1000);
        heatMap_PathTracking_Geofencing.init(t1).TRACKING();
        Thread.sleep(3000);
        String plcholdr="Vin/ LicensePlate";
        String placeholder = heatMap_PathTracking_Geofencing.init(t1).getplaceHolder();
        System.out.println(placeholder);

        Assertion.assertEqual(placeholder,plcholdr,"both same ",t1);

    }
}
