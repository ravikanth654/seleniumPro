/*
package tests.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

public class tableRowsCountTest extends TestInit
{
    @Test
    public void tableRowsCount() throws Exception {
        ExtentTest t1 = pNode.createNode("tableRowsCount", "tableRowsCount");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(9000);
        String size = dashBoard.init(t1).TOTALFLEETSIZE();
        int sz = Integer.parseInt(size);
        System.out.println("TOTALFLEETSIZE "+ sz);


        String txt = dashBoard.init(t1).kms_driver();
        int kms = Integer.parseInt(txt);

        String txt1 = dashBoard.init(t1).cKMSdriven();
        int ckms = Integer.parseInt(txt1);


        String txt2 = dashBoard.init(t1).cFleetSize();
        int cFS = Integer.parseInt(txt2);

        String txt3 = dashBoard.init(t1).FleetSize();
        int fs = Integer.parseInt(txt3);

        String txt4 = dashBoard.init(t1).cVehicleConnet();
        int cVC = Integer.parseInt(txt4);

        String txt5 = dashBoard.init(t1).VehicleConnet();
        int VC = Integer.parseInt(txt5);

        String txt6 = dashBoard.init(t1).CDriveState();
        int cDS = Integer.parseInt(txt6);

        String txt7 = dashBoard.init(t1).DriveStates();
        int DS = Integer.parseInt(txt7);

        System.out.println(kms);
        Assertion.assertEqual(kms,ckms,"comparing ",t1);
        Assertion.assertEqual(fs,cFS,"comparing ",t1);
        Assertion.assertEqual(VC,cVC,"comparing ",t1);
        Assertion.assertEqual(DS,cDS,"comparing ",t1);

    }
}
*/
