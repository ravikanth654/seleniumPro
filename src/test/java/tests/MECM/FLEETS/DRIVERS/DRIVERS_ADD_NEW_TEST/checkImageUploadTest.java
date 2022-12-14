package tests.MECM.FLEETS.DRIVERS.DRIVERS_ADD_NEW_TEST;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.util.common.Assertion;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkImageUploadTest extends TestInit
{
    @Test
    public void checkImageUpload() throws Exception
    {
        ExtentTest t1 = pNode.createNode("Check for imag loaded alrt msg", "Check for imag loaded alrt msg ");
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility().fleets();
        fleetDriverPage.init(t1).clikOnDriver();
        Thread.sleep(1000);

        fleetDriverPage.init(t1).driverEdit();
        Thread.sleep(3000);
        //Fleet_Driver_Add_page.init(t1).driverEdit();
        // Actions builder = new Actions(driver);
        driver.findElement(By.xpath("//input[@type='file']")).click();
        //Fleet_Driver_Add_page.init(t1). clickonDriverImageTodownload();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\25004035\\Desktop\\AutoIt\\driverDocUploadPicJpeg.exe");
        Thread.sleep(2000);
        String alrt="Image updated Successfully!!";
        String alrt1 = fleetDriverPage.init(t1).takeimageUploadtxt();
        Thread.sleep(2000);
        String image="testingpic.jpg";
        String picName = fleetDriverPage.init(t1).getUploadPicText();


        Assertion.verifyEqual(alrt1,alrt,"Comaprng alrt upload msg",t1);
        Assertion.verifyEqual(picName,image,"Comaprng pic upload msg",t1);


    }
}
