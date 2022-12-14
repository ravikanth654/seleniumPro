package tests.MECM.FLEETS.SUB_FLEETS.FlEET_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.Page_info.Fleet_EditFleet_Page;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class editMobileNumberFieldTest extends TestInit
{
    @Test
    public void editMobileNumberField() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Click On edit Fleet,edit fleet name", "Clicking on edit fleet ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).edit();
        String m1="9999999999";
        SubFleetsPage.init(t1).mobileNumberClick();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).mobileClear();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).mobileNumber(m1);
        Thread.sleep(1000);
        SubFleetsPage.init(t1).mobileNumberClick();
        Thread.sleep(1000);
        String aa =   SubFleetsPage.init(t1).mobileValuenumber();
        System.out.println("aa "+aa);

        Assertion.assertEqual(aa,m1," mobile number editable",t1);
    }
}
