package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkImageUploadandRefreshAndCheckTest extends TestInit
{
    @Test
    public void checkImageUploadandRefreshAndCheck() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Check for imag loaded alrt msg", "Check for imag loaded alrt msg ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);

        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='file']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\driverDocUploadPicJpeg.exe");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        String image="testingpic.jpg";
        String picName = fleetDriverPage.init(t1).getUploadPicText();

        Thread.sleep(2000);

        Assertion.assertEqual(picName,image,"Comaprng pic upload msg",t1);


    }
}
