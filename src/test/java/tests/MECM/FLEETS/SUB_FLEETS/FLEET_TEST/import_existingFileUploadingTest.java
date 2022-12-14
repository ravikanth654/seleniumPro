package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class import_existingFileUploadingTest extends TestInit
{
    @Test
    public void Browse_existingFileUploading() throws InterruptedException, IOException
    {
        String t="Already an fleet name exists";
        // String t2="Successfully uploaded the customers!!";
        ExtentTest t1 = pNode.createNode("Browse button,Check for existing file upload with message", "verify Browse button enabled and clickable and file upload ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).imp_click();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).bro_click();

        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\subFleetUploadExst.exe");
        Thread.sleep(2000);
        SubFleetsPage.init(t1).SubmitClick();
        String txt = SubFleetsPage.init(t1).alert();

        Assertion.assertEqual(t,txt,"Check for existing file upload",t1);
    }
}
