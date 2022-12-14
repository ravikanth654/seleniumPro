package framework.pageObjects.MECM.DASH_BOARD;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.MECM.Login.logInPage;
import framework.pageObjects.PageInit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class dashBoard extends PageInit
{

    @FindBy(xpath = "//ul[@class='navbar-nav']//li")
    private WebElement imc;

    @FindBy(xpath = "//*[text()=' VEHICLES CONNECTED']//../../div//span")
    private WebElement cVC;

    @FindBy(xpath = "//*[text()=' Kms Driven']//..//../..//td[4]")
    private WebElement VC;

    @FindBy(xpath = "//*[text()=' DRIVE STATE']//../../div//span")
    private WebElement cDS;

    @FindBy(xpath = "//*[text()=' Kms Driven']//..//../..//td[5]")
    private WebElement DS;


    @FindBy(xpath = "//*[text()=' KMS DRIVEN']//../../div//span")
    private WebElement cKMSdriven;

    @FindBy(xpath = "//*[text()=' FLEET SIZE']//../../div//span")
    private WebElement cFleetSize;

    @FindBy(xpath = "//*[text()=' Kms Driven']//..//../..//td[2]")
    private WebElement FleetSize;

    @FindBy(xpath = "//thead/..//tr")
    private List<WebElement> tableRow;

    @FindBy (xpath = "//*[text()=' Kms Driven']//..//../..//td[3]")
    private WebElement kms_driver;

    @FindBy(xpath = "//ul[@class='navbar-nav']//..//button[@data-toggle='dropdown']")
    private WebElement clickingDropDown;
    
    @FindBy(xpath = "//ul[@class='navbar-nav']//..//button[@data-toggle='dropdown']/..//div//button")
    private List<WebElement> allDropDown;

    @FindBy(xpath = "//span[.='LIVE SUMMARY']//..//span[2]")
    private WebElement getCurrentDate;

    @FindBy(xpath = "(//span[.=' NO OF FLEETS']//..//..//..//span)[1]")
    private WebElement NOOFFLEETS;

    @FindBy(xpath = "(//span[.=' FLEET SIZE']//..//..//..//span)[1]")
    private WebElement TOTALFLEETSIZE;

    @FindBy(xpath = "(//span[.=' VEHICLES CONNECTED']//..//..//..//span)[1]")
    private WebElement TOTALCAR;

    @FindBy(xpath = "(//span[.=' TOTAL KM DRIVEN']//..//..//..//span)[1]")
    private WebElement TOTALKM;

    @FindBy(xpath = "(//span[.=' LOW SOC < 20%']//..//..//..//span)[1]")
    private WebElement LOWSOC;

    @FindBy(xpath = "(//span[.=' DRIVE STATE']//..//..//..//span)[1]")
    private WebElement DriveState;

    @FindBy(xpath = "//*[.='FLEET MANAGEMENT']//..//table//tr//..//th")
    private  List<WebElement> tHead;

    @FindBy(xpath = "//th[.=' Fleet']//../../..//tr//td[1]")
    private  List<WebElement> fleet;

    @FindBy(xpath = "//th[.=' Fleet']//../../..//tr//td[2]")
    private  List<WebElement> size;

    @FindBy(xpath = "//th[.=' Fleet']//../../..//tr//td[3]")
    private  List<WebElement> kms;

    @FindBy(xpath = "//th[.=' Fleet']//../../..//tr//td[4]")
    private  List<WebElement> connected;

    @FindBy(xpath = "//th[.=' Fleet']//../../..//tr//td[5]")
    private  List<WebElement> state;




    public dashBoard(ExtentTest t1) {
        super(t1);
    }
    public static dashBoard init(ExtentTest t1){return new dashBoard(t1);}
    public int tableRow()
    {
        int count = tableRow.size();
        return count;
    }

    public String FleetSize()
    {
        String s = FleetSize.getText();
        return s;
    }

    public String CDriveState()
    {
        String s = cDS.getText();
        return s;
    }

    public String DriveStates()
    {
        String s = DS.getText();
        return s;
    }


    public String cVehicleConnet()
    {
        String s = cVC.getText();
        return s;
    }

    public String VehicleConnet()
    {
        String s = VC.getText();
        return s;
    }

    public String cFleetSize()
    {
        String s = cFleetSize.getText();
        return s;
    }

    public String imc()
    {
        String s = imc.getText();
        return s;
    }



    public String cKMSdriven()
    {
        String s = cKMSdriven.getText();
        return s;
    }


    public String  kms_driver()
    {
        String s =  kms_driver.getText();
        return s;
    }



    public ArrayList<String> TblHeading()
    {

        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:tHead)
        {
            String names = name.getText();
//           System.out.println(names);
            nm.add(names);
        }
        System.out.println("The actual table headings "+nm);


        return nm;
    }

    public String DriveState()
    {
        String s = DriveState.getText();
        return s;
    }

    public String LOWSOC()
    {
        String s = LOWSOC.getText();
        return s;
    }

    public String TOTALCAR()
    {
        String s = TOTALCAR.getText();
        return s;
    }

    public String TOTALKM()
    {
        String s = TOTALKM.getText();
        return s;
    }
    public String TOTALFLEETSIZE()
    {
        String s = TOTALFLEETSIZE.getText();
        return s;
    }
public dashBoard TOTALFLEETSIZEclick()
    {
       clickOnElement(TOTALFLEETSIZE,"clcik");
        return this;
    }

public dashBoard LOWSOCclick()
    {
       clickOnElement(LOWSOC,"clcik");
        return this;
    }

public dashBoard TOTALCARclick()
    {
       clickOnElement(TOTALCAR,"clcik");
        return this;
    }

    public String NOOFFLEETS()
    {
        String s = NOOFFLEETS.getText();
        return s;
    }

    public String getCurrentDate()
    {
        String s = getCurrentDate.getText();
        return s;
    }

    public dashBoard clickingDropDown()
    {
        clickOnElement(clickingDropDown,"Fleet Button");
        return this;
    }

    public int allDropDownValues()
    {
        int y = allDropDown.size();

        System.out.println(y);
        return y;
    }

}
