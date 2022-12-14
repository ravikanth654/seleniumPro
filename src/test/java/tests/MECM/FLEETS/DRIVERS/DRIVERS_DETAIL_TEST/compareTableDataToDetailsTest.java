package tests.MECM.FLEETS.DRIVERS.DRIVERS_DETAIL_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.dateConvert;

public class compareTableDataToDetailsTest extends TestInit
{

    String Dname;
    String DOB;
    String Gender;
    String Mobile;
    String NoOfTripsTaken;
    String Rating;
    String subfleet;

    @Test
    public void compareTableDataToDetails() throws Exception
    {
        ExtentTest t1 = pNode.createNode("compareTableDataToDetails", "compareTableDataToDetails");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(5000);

        Dname=fleetDriverPage.init(t1).NAME();
        DOB=fleetDriverPage.init(t1).DOB();
        Gender=fleetDriverPage.init(t1).GENDER();
        Mobile=fleetDriverPage.init(t1).PHONE();
        subfleet=fleetDriverPage.init(t1).SUBFLEET();


        fleetDriverPage.init(t1).driverDetailClick();
        Thread.sleep(3000);

        String insideDriverName = fleetDriverPage.init(t1).insideDriverName();
        String insidesubfleet = fleetDriverPage.init(t1).insideSubfleet();
       insideDriverName.equalsIgnoreCase(insideDriverName);
        String insidedate = fleetDriverPage.init(t1).insideDOB();
        System.out.println(insidedate);
      String insideDOB = dateConvert.date(insidedate);
        String insideGender = fleetDriverPage.init(t1).insideGender();
        String insideMobile = fleetDriverPage.init(t1).insideMobile();
       /* String insideNoOfTripsTaken = fleetDriverPage.init(t1).insideNoOfTripsTaken();
        String insideRating = fleetDriverPage.init(t1).insideRating();
        double b = Double.parseDouble(insideRating);
        int i = (int) b;
        System.out.println(i);*/

        Assertion.verifyContains(Dname,insideDriverName,"name",t1);
       Assertion.verifyEqual(DOB,insideDOB,"DOB",t1);
        Assertion.verifyEqual(Gender,insideGender,"Gender",t1);
        Assertion.verifyEqual(Mobile,insideMobile,"Mobile",t1);
        Assertion.verifyEqual(subfleet,insidesubfleet,"Mobile",t1);


        // Assertion.verifyEqual(a,i,"ratings",t1);


    }
}
