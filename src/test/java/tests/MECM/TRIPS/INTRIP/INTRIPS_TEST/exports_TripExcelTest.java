package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.CurrentDate;
import tests.myMethods.isFileDownloaded;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exports_TripExcelTest extends TestInit
{
    @Test
    public void exports_TripExcel() throws Exception {
        ExtentTest t1 = pNode.createNode("exports_TripExcel ", "exports_TripExcel");
        String downloadPath = "C:\\Users\\25004035\\Downloads";
        String downloadPath1="C:\\Users\\25004035\\Documents";
        String fileName = "trips_";
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy");
        String strDate= formatter.format(date);

        String downloadFile = fileName.concat(strDate).concat(".csv");
        System.out.println("name "+downloadFile);
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).clickOnMoreOption();
        Thread.sleep(2000);
        inTrips.init(t1).downLoadTrips();
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
