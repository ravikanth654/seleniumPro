package framework.pageObjects.Page_info;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Fleet_DetailFleet_Page extends PageInit
{
    @FindBy(xpath="//tr[contains(.,'ME-DEFAULT')]//td[2]")
    private WebElement defaultFleet;

    @FindBy(xpath="//tr[contains(.,'ME-DEFAULT')]//td[3]")
    private WebElement adress;

    @FindBy(xpath="//tr[contains(.,'ME-DEFAULT')]//td[4]")
    private WebElement email;

    @FindBy(xpath="//tr[contains(.,'ME-DEFAULT')]//td[5]")
    private WebElement noOfVehicles;

    @FindBy(xpath="(//tr)[2]//td[5]")
    private WebElement noOfVehiclescount;

    @FindBy(xpath="(//tr)[2]//td[6]")
    private WebElement noOfDriverscount;

    @FindBy(xpath="//tr[contains(.,'ME-DEFAULT')]//td[6]")
    private WebElement noOfDrivers;

   @FindBy(xpath="//tr[1]//td[3]")
    private WebElement subfleetinside;

    @FindBy(xpath="//tr[2]//td[3]")
    private WebElement mailInside;

    @FindBy(xpath="//tr[3]//td[3]")
    private WebElement phoneinside;

    @FindBy(xpath="//tr[4]//td[3]")
    private WebElement adressInside;

    @FindBy(xpath="//td[.='No of Vehicles Selected:']/..//td[3]")
    private WebElement noOfvehiclesInside;


    @FindBy(xpath="//td[.='No of Drivers Selected:']/..//td[3]")
    private WebElement noOfdriversInside;

    @FindBy(xpath = "//thead//th")
    private List<WebElement> tblHeading;

    @FindBy(xpath = "//tr[contains(.,'ME-DEFAULT')]//td[7]")
    private WebElement status;

    @FindBy(xpath = "//button[@class='btn m-btn-light']")
    private WebElement Instatus;

    @FindBy(xpath = "//span[.='SUB FLEETS']")
    private WebElement clickBack;

    @FindBy(xpath = "//table[@class='table table-striped fixed_header']//tbody//tr")
    private WebElement trow;

    @FindBy(xpath = "//button[.='EDIT']")
    private WebElement edit;

    @FindBy(xpath = "//a[.='Assign Vehicles']")
    private WebElement assignvehicle;

    @FindBy(xpath = "//a[.='Assign Drivers']")
    private WebElement assignDriver;




    public Fleet_DetailFleet_Page(ExtentTest t1) {
        super(t1);
    }
    public static Fleet_DetailFleet_Page init(ExtentTest t1){return new Fleet_DetailFleet_Page(t1);}

    public String getFleetName()
    {
        String dfleet = defaultFleet.getText();
        return dfleet;
    }

    public String getAdress()
    {
        String adresss = adress.getText();
        return adresss;
    }

    public String getEmail()
    {
        String emaill = email.getText();
        return emaill;
    }

    public String getNoOfVehicles()
    {
        String novehicless = noOfVehicles.getText();
        return novehicless;
    }

    public String getNoOfVehiclesCount()
    {
        String novehicless = noOfVehiclescount.getText();
        return novehicless;
    }

    public String getNoOfDriverCount()
    {
        String novehicless = noOfDriverscount.getText();
        return novehicless;
    }

    public String getNoOfDrivers()
    {
        String noDriverss = noOfDrivers.getText();
        return noDriverss;
    }

    public Fleet_DetailFleet_Page clcikonfleet()
    {
        clickOnElement(defaultFleet,"Clicking on fleet");
        return this;
    }

    public String getsubfleetInside()
    {
        String flt = subfleetinside.getText();
        return flt;
    }

    public String getMailInside()
    {
        String ml = mailInside.getText();
        return ml;
    }


    public String getPhoneInside()
    {
        String phonee = phoneinside.getText();
        return phonee;
    }


    public String getadressInsid()
    {
        String adr = adress.getText();
        return adr;
    }

    public String getnoOfvehicles()
    {
        String vcl = noOfvehiclesInside.getText();
        return vcl;
    }

    public String getnoOfdrivers()
    {
        String drvs = noOfdriversInside.getText();
        return drvs;
    }

    public ArrayList<String> TblHeading()
    {

        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:tblHeading)
        {
            String names = name.getText();
//           System.out.println(names);
            nm.add(names);
        }
        System.out.println("The actual table headings "+nm);


        return nm;
    }

    public String getStatus()
    {
        String stts = status.getText();
        return stts;
    }

    public String getStatusInside()
    {
        String stts = Instatus.getText();
        return stts;
    }

    public Fleet_DetailFleet_Page goback()
    {
        clickOnElement(clickBack,"clicking back");
        return this;
    }

    public Fleet_DetailFleet_Page clickedit()
    {
        clickOnElement(edit,"clicking edit");
        return this;
    }
    public Fleet_DetailFleet_Page clickAssign()
    {
        clickOnElement(assignvehicle,"clicking assign vehicle");
        return this;
    }

    public Fleet_DetailFleet_Page clickDriverAssign()
    {
        clickOnElement(assignDriver,"clicking assign driver");
        return this;
    }













}
