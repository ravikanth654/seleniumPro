package tests.MECM.FLEETS.DRIVERS.ASSIGN_VEHICLES_EDIT;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkTotalEntriesTest extends TestInit
{
    @Test
    public void checkTotalEntries() throws Exception {
        ExtentTest t1 = pNode.createNode("Check total entries ", "Check total entries");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(3000);
        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(3000);
        String theText = fleetDriverPage.init(t1).clickOnassignAndRemoveButton();
        Thread.sleep(3000);

        if(theText.equals("ASSIGN VEHICLE")) {
            fleetDriverPage.init(t1).assignVehiclesInEdit();
            Thread.sleep(4000);


            String t = SubFleetsPage.init(t1).totalrows();
            String[] sp = t.split(" ");
            String s = sp[5];
            int sss = Integer.parseInt(s);
            int c = sss / 10;
            int c1 = sss % 10;
            int nw = 0;
            if (c1 != 0) {
                System.out.println(c);
                String cc = driver.findElement(By.xpath("//button[@class='pagination-btn-disabled fa fa-angle-right']/preceding-sibling::button[1]")).getText();
                nw = Integer.parseInt(cc);
                System.out.println(nw);

                System.out.println(sss);
                Assertion.assertEqual(nw, c + 1, "Verifying total entries", t1);
            } else {
                Assertion.assertEqual(nw, c, "Verifying total entries", t1);
            }
        }

        else {

            fleetDriverPage.init(t1).removeVehiclesinEdit();
            Thread.sleep(2000);
            fleetDriverPage.init(t1).assignVehiclesInEdit();
            Thread.sleep(2000);

            String t = SubFleetsPage.init(t1).totalrows();
            String[] sp = t.split(" ");
            String s = sp[5];
            int sss = Integer.parseInt(s);
            int c = sss / 10;
            int c1 = sss % 10;
            int nw = 0;
            if (c1 != 0) {
                System.out.println(c);
                String cc = driver.findElement(By.xpath("//button[@class='pagination-btn-disabled fa fa-angle-right']/preceding-sibling::button[1]")).getText();
                nw = Integer.parseInt(cc);
                System.out.println(nw);

                System.out.println(sss);
                Assertion.assertEqual(nw, c + 1, "Verifying total entries", t1);
            } else {
                Assertion.assertEqual(nw, c, "Verifying total entries", t1);
            }
        }

    }
}
