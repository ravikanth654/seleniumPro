package tests.MECM.FLEETS.SUB_FLEETS.FLEET_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import tests.TestInit;

public class searchBy_FleetName_N_EmailTest extends TestInit
{
    @Test(priority = 0)
    public void Search_byFleetName() throws Exception
    {
        ExtentTest t1 = pNode.createNode("search By fleetname ", "Search by fleet name ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(5000);

        String s1 = SubFleetsPage.init(t1).getRowName();
        System.out.println(s1);
        SubFleetsPage.init(t1).search_sendvalue(s1)
                                     .clickSearch();
        Thread.sleep(1000);
        String s2 = SubFleetsPage.init(t1).getFirstRowName();
        System.out.println(s2);


        Assertion.assertEqual(s1, s2, "Verifying the value", t1);
        SubFleetsPage.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        SubFleetsPage.init(t1).fleets();


    }

    @Test(priority = 1)
    public void Search_byEmail() throws Exception {
        ExtentTest t1 = pNode.createNode("search By Email ", "Search by Email ");
        String s1 = SubFleetsPage.init(t1).getsecondRowEmail();
        System.out.println(s1);
        SubFleetsPage.init(t1).search_sendvalue(s1)
                                     .clickSearch();
        Thread.sleep(1000);

        String s2 = SubFleetsPage.init(t1).getfirstRowEmail();
        System.out.println(s2);

        Assertion.assertEqual(s1, s2, "Verifying the email value", t1);
        SubFleetsPage.init(t1).clickSearch();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        SubFleetsPage.init(t1).fleets();

    }

}
