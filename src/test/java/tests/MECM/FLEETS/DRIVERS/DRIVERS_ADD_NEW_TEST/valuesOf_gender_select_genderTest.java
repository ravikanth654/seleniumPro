package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
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
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);

        fleetDriverPage.init(t1).clcikOnAddDriver();
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
