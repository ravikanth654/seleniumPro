package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class comparingValues_with_DetailsTest extends TestInit
{
    @Test
    public void comparingValues()throws Exception
    {
        ExtentTest t1 = pNode.createNode("Clicking on back ", "Clicking on back");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(6000);

        String vin = fleetVehiclesPage.init(t1).rowvalue();
        System.out.println("vin "+vin);
        String regNo = fleetVehiclesPage.init(t1).regNo();
        System.out.println("regNo "+regNo);
        String model = fleetVehiclesPage.init(t1).model();
        System.out.println("model "+model);

        String last = fleetVehiclesPage.init(t1).lastconnect();
       // String lastCnct = last.substring(0, last.length() - 3).trim();

       /* System.out.println("lastCnct "+lastCnct);
        System.out.println(lastCnct.length());
*/
        System.out.println("---------------------------------------------------");

        fleetVehiclesPage.init(t1).rowClick();
        Thread.sleep(2000);
        String inVin = fleetVehiclesPage.init(t1).inVin();
        System.out.println("inVin "+inVin);
        String inModel = fleetVehiclesPage.init(t1).inModel();
        System.out.println("inModel "+inModel);
        String inReg = fleetVehiclesPage.init(t1).inReg();
        System.out.println("inReg "+inReg);
       /* String incolor = fleetVehiclesPage.init(t1).getCarcolor();
        String[] parts = incolor.split("/");
        String lastWord = parts[parts.length - 1];
        System.out.println("car color "+lastWord);*/
        String inLastconnect = fleetVehiclesPage.init(t1).inLastconnect();
        String cut = inLastconnect.substring(0, inLastconnect.length() - 6);
        String[] s = cut.split(",");
        String date=s[1];

        String time = inLastconnect.substring(0, 5);

        String inlstCnt = date.concat(", "+time);

        System.out.println("inLastconnect "+inlstCnt.trim());
        System.out.println(inlstCnt.trim().length());

        Assertion.assertEqual(vin,inVin,"comparing vin ",t1);
        Assertion.assertEqual(model,inModel,"comparing model ",t1);
        Assertion.assertEqual(regNo,inReg,"comparing regNo ",t1);
        Assertion.verifyContains(last,inlstCnt,"comparing LastConnect ",t1);

    }
}
