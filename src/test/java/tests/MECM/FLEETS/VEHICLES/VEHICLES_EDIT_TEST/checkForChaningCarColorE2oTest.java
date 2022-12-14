package tests.MECM.FLEETS.VEHICLES.VEHICLES_EDIT_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetVehiclesPage;
import framework.util.common.Assertion;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;

public class checkForChaningCarColorE2oTest  extends TestInit
{
    @Test
    public void checkForChaningCarColorEverito() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("Testing drop down color ", "drop down");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);
        fleetVehiclesPage.init(t1).clcikVehicl();
        Thread.sleep(3000);
        fleetVehiclesPage.init(t1).edite2oPlus();
        Thread.sleep(1000);
        String clr = fleetVehiclesPage.init(t1).getcolor();
        System.out.println("color=" + clr);
        fleetVehiclesPage.init(t1).clcikColor();
        if (clr.equals("solid-white")) {
            fleetVehiclesPage.init(t1).clcikRed();
            Thread.sleep(1000);
            String clr2 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color2=" + clr2);
        } else if (clr.equals("arctic-silver")) {
            fleetVehiclesPage.init(t1).clckWhite();
            Thread.sleep(1000);
            String clr3 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color3=" + clr3);
        }
        else if (clr.equals("coral-blue")) {
            fleetVehiclesPage.init(t1).clckWhite();
            Thread.sleep(1000);
            String clr3 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color3=" + clr3);
        }else {
            fleetVehiclesPage.init(t1).clciksilver();
            Thread.sleep(2000);
            String clr4 = fleetVehiclesPage.init(t1).getcolor();
            System.out.println("color4=" + clr4);
        }
        Thread.sleep(2000);
        String clrlast = fleetVehiclesPage.init(t1).getcolor();
        fleetVehiclesPage.init(t1).clcikOnSubmit();
        String alrt="vehicle updated successfully!";
        String getalrt = fleetVehiclesPage.init(t1).getVehicleEditAlert();
        System.out.println("alert is"+getalrt);

        Assertion.assertEqual(alrt,getalrt,"successful alert",t1);
        //  fleetVehiclesPage.init(t1).clcikOncancel();

        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        fleetVehiclesPage.init(t1).clickone2o();
        String incolor = fleetVehiclesPage.init(t1).getCarcolor();
        Thread.sleep(2000);
        String img = driver.findElement(By.xpath("//div[@class='vehicle-details']//div//img")).getAttribute("src");
       // String src = img.getAttribute("src");
        System.out.println("The src "+img);



        String[] parts = img.split("/");
        String lastWord = parts[parts.length - 1];
        System.out.println("car color "+lastWord);
        String[] parts1 = lastWord.split("/");
      /*  String vc = fleetVehiclesPage.init(t1).takecolor();
        System.out.println("now " + vc);*/

        //Assertion.assertEqual(lastWord, clrlast, "Both color same", t1);
        Assertion.verifyContains(lastWord, clrlast,"Both color same",t1);

    }
}
