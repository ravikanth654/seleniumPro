/*
package tests.MECM.ALERTS.OPERATIONAL_ALERTS;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.ALERTS.alerts;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.isFileDownloaded;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exports_AlertsTest extends TestInit
{
    @Test
    public void exports_Alerts() throws Exception {
        ExtentTest t1 = pNode.createNode("exports_Alerts ", "exports_Alerts");

        String downloadPath = "C:\\Users\\25004035\\Downloads";
        String downloadPath1="C:\\Users\\91866\\Downloads";
        String fileName = "operationalAlerts";
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
        String strDate= formatter.format(date);

        String downloadFile = fileName.concat(strDate).concat(".csv");
        System.out.println("name "+downloadFile);
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        alerts.init(t1).aletsNavigation();
        Thread.sleep(2000);
        alerts.init(t1).operationALertClick();
        Thread.sleep(3000);
        inTrips.init(t1).startDate("01012018");
        Thread.sleep(6000);
        alerts.init(t1).actionClick();
        Thread.sleep(2000);
        alerts.init(t1).exportClick();
        Thread.sleep(4000);

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\download.exe");
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\ExportSaveas.exe");
        Thread.sleep(3000);

        boolean is = isFileDownloaded.isFileDownloaded(downloadPath1, downloadFile);
        System.out.println("is it downloaded "+is);

        if (is) {
            t1.pass("File downloaded");
            t1.pass("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        } else {
            t1.fail("not downloaded");
            t1.fail("", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.TakeScreenshot()).build());
        }
    }

}
*/
