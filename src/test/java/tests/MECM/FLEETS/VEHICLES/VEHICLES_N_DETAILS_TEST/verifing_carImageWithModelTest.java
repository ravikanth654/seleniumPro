package tests.MECM.FLEETS.VEHICLES.VEHICLES_N_DETAILS_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class verifing_carImageWithModelTest extends TestInit
{
    @Test
    public void verifing_carImageWithModelTest() throws IOException, InterruptedException
    {
        ExtentTest t1 = pNode.createNode("verify car image with model ", "verify car image with model");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(4000);

        fleetVehiclesPage.init(t1).rowClick();
        Thread.sleep(4000);
        String inModel = fleetVehiclesPage.init(t1).inModel();
        System.out.println(inModel);
        String model = fleetVehiclesPage.init(t1).getImageModel();
        System.out.println(model);
        String[] s = model.split("/");


        String lastOne = s[s.length-1];
        String[] modell = lastOne.split(".png");

        for (String car : modell)
        {
            System.out.println(car);
            String[] ss = car.split("-");
            System.out.println(ss[0]);
            Assertion.assertEqual(inModel,ss[0],"comparing model",t1);
        }



    }
}
