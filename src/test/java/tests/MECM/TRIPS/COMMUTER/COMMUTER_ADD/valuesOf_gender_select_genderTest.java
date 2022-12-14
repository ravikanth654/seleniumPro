package tests.MECM.TRIPS.COMMUTER.COMMUTER_ADD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;

public class valuesOf_gender_select_genderTest extends TestInit
{
    @Test(priority = 0)
    public void valuesOf_gender() throws Exception
    {
        ExtentTest t1 = pNode.createNode("values of gender ", "values of gender ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(1000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(2000);
        commuter.init(t1).addCommuter();
        Thread.sleep(2000);

        fleetDriverPage.init(t1).clcikOnGenderDropdown();
        Thread.sleep(2000);
        ArrayList<String> mm = fleetDriverPage.init(t1).dropdownvalues();
        ArrayList<String> ap =new ArrayList<>();
        ap.add("Male");
        ap.add("Female");

        for(String a : ap)
        {
            Assertion.verifyListContains(mm,a,"Comparing Table heading ",t1);
        }

    }

    @Test(priority = 1)
    public void select_gender() throws Exception
    {
        ExtentTest t1 = pNode.createNode("select gender ", "select gender ");
        String value = "Female";
        fleetDriverPage.init(t1).clcikOnFemaleDropdown();
        String value1 = fleetDriverPage.init(t1).takeAtrigenderDropdown();
        System.out.println("value1 "+value1);

        Assertion.assertEqual(value,value1,"Both same ",t1);
    }

}
