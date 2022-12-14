package tests.MECM.TRIPS.INTRIP.INTRIPS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.updateCellvalue;

public class import_newFileUploadingTest extends TestInit
{
    private int ttlcnt;
    @Test
    public void import_newFileUploading() throws Exception {
        ExtentTest t1 = pNode.createNode("import_newFileUploading ", "import_newFileUploading");
        Login.init(t1).validLogin("MECM");
        String t2 = "Successfully uploaded the trips!!";
        SubFleetsPage.init(t1).mobility();
        inTrips.init(t1).TRIPS();
        Thread.sleep(3000);
        inTrips.init(t1).ARYA();
        Thread.sleep(3000);
        String ss = SubFleetsPage.init(t1).ttl();
        ttlcnt = Integer.parseInt(ss);
        Thread.sleep(2000);
        inTrips.init(t1).clickOnMoreOption();
        Thread.sleep(2000);
        inTrips.init(t1).uploadTrips();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).bro_click();
        Thread.sleep(1000);

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\upLoadNewTrip.exe");
        Thread.sleep(3000);
        SubFleetsPage.init(t1).SubmitClick();
        String txt = SubFleetsPage.init(t1).alert();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);

        String sss = SubFleetsPage.init(t1).ttl();
        int ttlcnt2 = Integer.parseInt(sss);

        Assertion.verifyEqual(t2,txt,"Check for new file upload",t1);
        Assertion.assertEqual(ttlcnt2,ttlcnt+1,"check total subfleet",t1);
    }
    }

