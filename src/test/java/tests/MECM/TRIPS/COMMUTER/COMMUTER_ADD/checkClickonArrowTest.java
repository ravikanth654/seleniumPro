package tests.MECM.TRIPS.COMMUTER.COMMUTER_ADD;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.MECM.FLEETS.SubFleetsPage;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.MECM.TRIPS.commuter;
import framework.pageObjects.MECM.TRIPS.inTrips;
import framework.util.common.Assertion;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkClickonArrowTest extends TestInit
{
    @Test
    public void checkClickonArrow() throws Exception
    {
        ExtentTest t1 = pNode.createNode("checkClickonArrow ", "checkClickonArrow");
        String url="https://stg-nemo.mahindraelectric.com/mcms/commuter-list/arya/b9e0858e-4916-4368-adf9-c4552e59d477";
        Login.init(t1).validLogin("MECM");
        SubFleetsPage.init(t1).mobility();
        Thread.sleep(1000);
        inTrips.init(t1).TRIPS();
        Thread.sleep(2000);
        inTrips.init(t1).ARYA();
        Thread.sleep(1000);
        commuter.init(t1).commuters();
        Thread.sleep(2000);
        commuter.init(t1).addCommuter();
        Thread.sleep(2000);
        /* Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//div[@id='configuration-sidebar']"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);*/
        fleetDriverPage.init(t1).clickArrowCommuter();
        Thread.sleep(3000);
        String url2 = driver.getCurrentUrl();

        Assertion.assertEqual(url2,url,"comparing the url",t1);

    }

}
