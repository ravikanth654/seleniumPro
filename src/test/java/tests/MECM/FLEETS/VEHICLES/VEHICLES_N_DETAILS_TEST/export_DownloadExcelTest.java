package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.CurrentDate;
import tests.myMethods.isFileDownloaded;

import java.io.IOException;

public class export_DownloadExcelTest extends TestInit
{
    @Test
    public void click_on_export() throws IOException, InterruptedException
    {
        String downloadPath = "C:\\Users\\25004035\\Downloads";
        String downloadPath1 = "C:\\Users\\25004035\\Documents";
        String fileName = "vehicle";
        String day = CurrentDate.date();
        String downloadFile = fileName.concat(day).concat(".csv");
        ExtentTest t1 = pNode.createNode("export button,File download", "check for export button and file upload ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).Export();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\download.exe");
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\saveAS.exe");
        Thread.sleep(2000);
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

