package tests.MECM.FLEETS.SUB_FLEETS.FlEET_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.Page_info.Fleet_EditFleet_Page;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class editEmailFieldTest extends TestInit
{
    @Test
    public void editEmailField() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("Click On edit Fleet,edit fleet Email", "Clicking on edit fleet ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).edit();
        String m1 = "more@gmail.com";
        SubFleetsPage.init(t1).clickEmail();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).clearemail();
        Thread.sleep(1000);
        SubFleetsPage.init(t1).eMail(m1);
        Thread.sleep(1000);
        SubFleetsPage.init(t1).clickEmail();
        Thread.sleep(1000);
        String m2 =   SubFleetsPage.init(t1).getEmailValues();
        System.out.println("m"+m2);

        Assertion.assertEqual(m2,m1,"Valid email",t1);
    }
}
