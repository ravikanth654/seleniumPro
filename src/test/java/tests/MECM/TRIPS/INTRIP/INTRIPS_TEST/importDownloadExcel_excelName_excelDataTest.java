package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.isFileDownloaded;

public class importDownloadExcel_excelName_excelDataTest extends TestInit
{
    @Test
    public void importDownloadExcel_excelName_excelData() throws Exception {
        ExtentTest t1 = pNode.createNode("importDownloadExcel_excelName_excelData ", "importDownloadExcel_excelName_excelData");
        String fileName="trips-import-sample";
        String downloadFile = fileName.concat(".xlsx");
        String downloadPath = "C:\\Users\\25004035\\Documents";
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);

        inTrips.init(t1).clickOnMoreOption();
        Thread.sleep(2000);
        inTrips.init(t1).uploadTrips();
        Thread.sleep(2000);
        SubFleetsPage.init(t1).clickOnIMPdownloadLinkTrips();
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\ImportSaveAs.exe");
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\saveAS.exe");

        boolean is = isFileDownloaded.isFileDownloaded(downloadPath, downloadFile);
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
