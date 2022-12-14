package tests.MECM.FLEETS.SUB_FLEETS.FLEET_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;
import tests.myMethods.GeneratingRandom;

import java.io.IOException;

public class clickingOnSave_subFleetDetailsTest extends TestInit
{
    @Test
    public void clickOnSave() throws InterruptedException, IOException {
        ExtentTest t1 = pNode.createNode("Clicking on save  ", "Clicking on save");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        Thread.sleep(1000);

        SubFleetsPage.init(t1).ClickonAddFleet();
//Name
        String s=null;
        String fleetName = GeneratingRandom.fourchar(s);
        SubFleetsPage.init(t1).fleetNmae(fleetName);
//Mobile
        String m1=null;
        String s2 = GeneratingRandom.tenNumber(m1);
        SubFleetsPage.init(t1).mobileNumber(s2);
//Gmail
        String m12 = null;
        String s22 = GeneratingRandom.gmail(m12);
        SubFleetsPage.init(t1).eMail(s22);
//Address
        String m111 = "rajajinagar";
        SubFleetsPage.init(t1).addresss(m111);

        SubFleetsPage.init(t1).clcikOnSave();

        Thread.sleep(5000);

        WebElement yes=driver.findElement(By.xpath("//button[.='CANCEL']"));
        boolean really = yes.isDisplayed();

        WebElement yes1=driver.findElement(By.xpath("//input[@value='Create Customer and Do Later']"));
        boolean really1 = yes.isDisplayed();

        Assertion.assertEqual(really,true,"Cancel button is present",t1);
        Assertion.assertEqual(really1,true,"submit button is present",t1);
    }
}
