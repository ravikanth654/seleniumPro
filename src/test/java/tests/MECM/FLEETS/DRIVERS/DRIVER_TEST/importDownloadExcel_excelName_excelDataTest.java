package tests.MECM.FLEETS.DRIVERS.DRIVER_TEST;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import framework.util.reportManagement.ScreenShot;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.getDownloadedExcelSheetData;
import tests.myMethods.getFileName;
import tests.myMethods.isFileDownloaded;

import java.io.IOException;
import java.util.ArrayList;

public class importDownloadExcel_excelName_excelDataTest extends TestInit
{
    private String dFile;
    private String url="C:\\Users\\25004035\\Documents\\";
    @Test(priority = 0)
    public void checkIMPortDownloadexcel() throws InterruptedException, IOException
    {
        String fileName="driver-import-sample";
        String downloadFile = fileName.concat(".xlsx");
        String downloadPath = "C:\\Users\\25004035\\Documents";
        ExtentTest t1 = pNode.createNode("verify download of IMPORT", "verify download of IMPORT");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).imp_click();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).clickDriverOnIMPdownloadLink();
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

    @Test(priority = 1)
    public void checkIMPORTdownload() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("verify download excel sheet of IMPORT", "verify download excel sheet of IMPORT");
        Thread.sleep(5000);
        String rFile="driver-import-sample.xlsx";
        dFile= getFileName.recentFile("C:\\Users\\25004035\\Documents");
        Thread.sleep(2000);
        System.out.println(dFile);

        Assertion.assertEqual(rFile,dFile,"Browse button,Check empty file upload with message",t1);


    }

    @Test(priority = 2)
    public void checkIMPORTdownloadValues() throws InterruptedException, IOException
    {
        ExtentTest t1 = pNode.createNode("verify download excel sheet table heading of IMPORT", "verify download excel sheet table heading of IMPORT");

        String pathOftheFile=url.concat(dFile);
        Thread.sleep(2000);
        ArrayList<String> a = getDownloadedExcelSheetData.getCellValue(pathOftheFile);
        Thread.sleep(2000);
        ArrayList<String> b=new ArrayList<>();
        b.add("first_name");
        b.add("last_name");
        b.add("mobile");
        b.add("gender");
        b.add("email");
        b.add("driving_licence");
        b.add("dob");
        b.add("address");

        for(String ab : b)
        {
            Assertion.verifyListContains(a,ab,"verify download excel sheet table heading of IMPORT",t1);
        }

    }
}
