package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

import java.io.IOException;
import java.util.ArrayList;

public class AllDocsValuesTest extends TestInit
{
    @Test
    public void AllDocsValues() throws IOException, InterruptedException {
        ExtentTest t1 = pNode.createNode("select doc and check it ", "select doc");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);
        fleetDriverPage.init(t1).clcikOnAddDriver();
        WebElement element = driver.findElement(By.xpath(("//button[text()=' Cancel']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ArrayList<String> docvalues=new ArrayList<>();
        docvalues.add("Driving Licence (Front)");
        docvalues.add("Driving Licence (Back)");
        docvalues.add("Pan Card");
        docvalues.add("Aadhar Card (Front)");
        docvalues.add("Aadhar Card (Back)");
        docvalues.add("Background Verification Document");
        docvalues.add("Police Verification Document");

        fleetDriverPage.init(t1).clcikOnDocUpload();
        ArrayList<String> lst = fleetDriverPage.init(t1).dropdownvaluesDoc();
        for(String a : docvalues)
        {
            Assertion.verifyListContains(lst,a,"comparing values",t1);
        }

    }
}
