package tests.MECM.MAPS.HEAT_MAP;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.MAPS.heatMap_PathTracking_Geofencing;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.CurrentDate;

public class heatMapEndToEndTest extends TestInit
{
    @Test
    public void heatMapEndToEnd()throws Exception {
        ExtentTest t1 = pNode.createNode("heatMapEndToEnd", "heatMapEndToEnd");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();

        heatMap_PathTracking_Geofencing.init(t1).maps()
                .clickingHeatMap();
        Thread.sleep(3000);
        heatMap_PathTracking_Geofencing.init(t1).startDate("01012015");
        heatMap_PathTracking_Geofencing.init(t1).startTime("1111");
        String presentdate= CurrentDate.date();
        heatMap_PathTracking_Geofencing.init(t1).endDate(presentdate);
        heatMap_PathTracking_Geofencing.init(t1).endTime("1111");
        String msg="Data not available. try resetting date/time.";
        Thread.sleep(3000);
        WebElement elmnt = driver.findElement(By.xpath("//button[.='Track']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", elmnt);
        heatMap_PathTracking_Geofencing.init(t1).Track();
        Thread.sleep(3000);
        String error = heatMap_PathTracking_Geofencing.init(t1).error_message();
        System.out.println(error);

        Assertion.assertEqual(error,msg,"getting same error",t1);




    }
}
