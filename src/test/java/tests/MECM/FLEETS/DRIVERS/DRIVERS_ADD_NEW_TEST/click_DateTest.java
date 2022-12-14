package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.Page_info.Fleet_Driver_Add_page;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class click_DateTest extends TestInit
{

    @Test
    public void click_Date() throws Exception
    {
        ExtentTest t1 = pNode.createNode("click_Date ", "click_Date ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        String s1 = "12122000";
        Fleet_Driver_Add_page.init(t1).date(s1);
        String a="form-control ng-untouched ng-dirty ng-valid";
        String aa=Fleet_Driver_Add_page.init(t1).takeAtriDate();
        System.out.println(aa);

    Assertion.assertEqual(aa,a,"Valid first name",t1);

}
}
