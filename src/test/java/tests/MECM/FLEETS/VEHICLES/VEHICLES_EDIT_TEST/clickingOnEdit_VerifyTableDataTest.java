package tests.MECM.FLEETS.VEHICLES.VEHICLES_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class clickingOnEdit_VerifyTableDataTest extends TestInit
{
    @Test
    public void clickingOnedit() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Click on vehicle", "clicking on vehicles");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(5000);
        String vin = fleetVehiclesPage.init(t1).takeVin();
        System.out.println(vin);
        String reg = fleetVehiclesPage.init(t1).takereg();
        System.out.println(reg);
       /* String vv = fleetVehiclesPage.init(t1).takevarient();
        System.out.println(vv);
        String vc = fleetVehiclesPage.init(t1).takecolor();
        System.out.println(vc);*/
        String model = fleetVehiclesPage.init(t1).outModel();
        System.out.println(model);
        fleetVehiclesPage.init(t1).edit();
        Thread.sleep(2000);
        String txt1 = fleetVehiclesPage.init(t1).txt();
        System.out.println("txt "+txt1);
        String[] parts = txt1.split(" ");
        String vinn = parts[parts.length - 2];
        System.out.println("Vin "+vinn);
        String modell = parts[parts.length - 4];
        System.out.println("model "+modell);

        System.out.println("----------------------------------");

        String invin = fleetVehiclesPage.init(t1).vinv();
        System.out.println("invin "+invin);
        String invm = fleetVehiclesPage.init(t1).vm();
        System.out.println("invm "+invm);
      /*  String invv = fleetVehiclesPage.init(t1).vv();
        System.out.println("invv "+invv);*/
        String inrn = fleetVehiclesPage.init(t1).inregnum();
        System.out.println("inrn "+inrn);
       /* String inrc = fleetVehiclesPage.init(t1).vc();
        System.out.println("inrc "+inrc);*/

        Assertion.assertEqual(vin,vinn,"Vin is same ",t1);
        Assertion.assertEqual(model,modell,"Check for model ",t1);
        Assertion.assertEqual(vin,invin,"Vin is same ",t1);
        Assertion.assertEqual(model,invm,"Vin is same ",t1);
      //  Assertion.assertEqual(vv,invv,"Vin is same ",t1);
        Assertion.assertEqual(reg,inrn,"Vin is same ",t1);
       // Assertion.assertEqual(vc,inrc,"Vin is same ",t1);

    }

}
