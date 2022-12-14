package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.excelReaderInvalidMobile;

import java.io.IOException;
import java.util.ArrayList;

public class checkAllinvalidMobileNumberTest extends TestInit
{
    @Test(priority = 0)
    public void check_invalidmobileNumberLessthan10() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Eneter invalid mobile number and validate ", "invalid Mobile number validation");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
        SubFleetsPage.init(t1).mobileNumberClick();

        ArrayList<String> b = excelReaderInvalidMobile.GetData("InvalidMobileNumber");
        for (int i = 1; i < 7; i++) {
            SubFleetsPage.init(t1).mobileNumber(b.get(i));
            SubFleetsPage.init(t1).mobileNumberClick();
            String act = "form-control ng-untouched ng-invalid ng-dirty";
            String s = SubFleetsPage.init(t1).mobilevalue();

            Assertion.assertEqual(act, s, "invalid mobile number", t1);
            Thread.sleep(1000);
            SubFleetsPage.init(t1).mobileClear();
            Thread.sleep(1000);

        }
    }

    @Test(priority = 1)
    public void check_invalidmobileNumberMoreThan10() throws IOException, InterruptedException
    {

        ExtentTest t1 = pNode.createNode("Eneter invalid mobile number and validate ", "invalid Mobile number validation");
        SubFleetsPage.init(t1).mobileNumberClick();
        SubFleetsPage.init(t1).mobileClear();

        ArrayList<String> b = excelReaderInvalidMobile.GetData("InvalidMobileNumber");

        for(int i=7;i<=7;i++)
        {
            SubFleetsPage.init(t1).mobileNumber(b.get(i));
            SubFleetsPage.init(t1).mobileNumberClick();
            String act = "form-control ng-untouched ng-dirty ng-invalid";
            String s = SubFleetsPage.init(t1).mobilevalue();

            Assertion.assertEqual(act, s, "invalid mobile number", t1);
            Thread.sleep(1000);
            SubFleetsPage.init(t1).mobileClear();
            Thread.sleep(1000);

        }

    }
}
