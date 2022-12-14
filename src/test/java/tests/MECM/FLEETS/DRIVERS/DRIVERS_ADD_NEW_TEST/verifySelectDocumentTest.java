package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class verifySelectDocumentTest extends TestInit
{
    String m1;
    String fnt1;
    String snt1;
    String gt1;
    String mt1;
    String emailt1;
    String dobt1;
    String lt1;
    String exptT1;
    String docImg;
    String docTxt;
    String doc;
    @Test
    public void verifySelectDocument() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("select DLF doc and check it ", "select DLF doc");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnDocUpload();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnDLF();

        doc = fleetDriverPage.init(t1).getDropdownValue();
        System.out.println("selected doc "+doc );
        String doc1 = fleetDriverPage.init(t1).getDocTabValue();
        System.out.println("Table doc "+doc1 );
        fleetDriverPage.init(t1).clcikOnBrowse();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\driverDocUploadPicJpeg.exe");
        Thread.sleep(3000);
        docImg = fleetDriverPage.init(t1).takeAtriDocimage();
        System.out.println("doc image "+docImg);
        String img="image";
        docTxt = fleetDriverPage.init(t1).takeAtriDocText();
        System.out.println("docText "+docTxt);
        String doctxt2="jpg";

        Assertion.assertEqual(doc,doc1,"Comparing doc name",t1);
        Assertion.verifyContains(docImg,img,"Comparing the doc img",t1);
        Assertion.verifyContains(docTxt,doctxt2,"Comapring driver txt",t1);

    }



}
