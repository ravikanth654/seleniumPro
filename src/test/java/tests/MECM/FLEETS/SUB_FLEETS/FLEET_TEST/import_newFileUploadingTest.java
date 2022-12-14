package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.updateCellvalue;

import java.io.IOException;

public class import_newFileUploadingTest extends TestInit
{
    private int ttlcnt;
    @Test
    public void Browse_newFileUploading() throws InterruptedException, IOException
    {
        String t2="Successfully uploaded the customers!!";
        ExtentTest t1 = pNode.createNode("Browse button,Check for new file upload with message", "verify Browse button enabled and clickable and file upload ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(5000);
        String ss = SubFleetsPage.init(t1).ttl();
        ttlcnt = Integer.parseInt(ss);
        Thread.sleep(1000);
        updateCellvalue.update("C:\\Users\\25004035\\Downloads\\newFleetupload.xlsx");
        SubFleetsPage.init(t1).imp_click();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).bro_click();

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\newFleetupload.exe");
        Thread.sleep(3000);
        SubFleetsPage.init(t1).SubmitClick();
        String txt = SubFleetsPage.init(t1).alert();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);

        String sss = SubFleetsPage.init(t1).ttl();
        int ttlcnt2 = Integer.parseInt(sss);

        Assertion.assertEqual(t2,txt,"Check for new file upload",t1);
        Assertion.assertEqual(ttlcnt2,ttlcnt+1,"check total subfleet",t1);
    }
}
