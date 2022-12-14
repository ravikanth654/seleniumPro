package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class import_EmptyFileUploadingTest extends TestInit
{
    @Test
    public void import_EmptyFileUploading() throws Exception {
        ExtentTest t1 = pNode.createNode("import_EmptyFileUploading ", "import_EmptyFileUploading");
        Login.init(t1).validLogin("MECM");
        String t="file is empty";
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        inTrips.init(t1).clickOnMoreOption();
        Thread.sleep(2000);
        inTrips.init(t1).uploadTrips();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).bro_click();
        Thread.sleep(1000);

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\Empty-import.exe");
        Thread.sleep(2000);
        SubFleetsPage.init(t1).SubmitClick();
        String txt = SubFleetsPage.init(t1).alert();

        Assertion.assertEqual(t,txt,"Browse button,Check empty file upload with message",t1);
    }
}
