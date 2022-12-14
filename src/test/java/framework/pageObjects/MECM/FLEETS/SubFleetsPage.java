package framework.pageObjects.MECM.FLEETS;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SubFleetsPage extends PageInit
{

    @FindBy(xpath = "//img[@src='../mcms/assets/images/roles/corporate-mobility-dark.svg']")
    private WebElement mob;

    //img[@src='../mcms/assets/images/roles/corporate-mobility-dark.svg']

    @FindBy(xpath = "//a[.='FLEETS']")
    private WebElement fleet;

    @FindBy(xpath = "//div[@class='metric-card']//span")
    private WebElement total;

    @FindBy(xpath ="//input[@type='search']")
    private WebElement srch;

    @FindBy(xpath = "//a[@class='btn search-btn']")
    private WebElement srchclick;

    @FindBy(xpath = "(//*[.='Selected Vehicles List']/following::div[@class='m-table table-responsive'])[1]//table//thead//tr//th")
    private List<WebElement> vehiclesTblHeading;

   @FindBy(xpath = "//*[.='Selected Drivers List']/following::div[@class='m-table table-responsive']//table//thead//tr//th")
    private List<WebElement> driverTblHeading;

    @FindBy(xpath = "//tr[1]//td[2]")
    private WebElement firstRowName;

    @FindBy(xpath = "//tr[1]//td[2]")
    private WebElement getFirstRowTripId;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement placeHolder;


    @FindBy(xpath = "//tr[3]//td[2]")
    private WebElement RowName;

    @FindBy(xpath = "(//tr//td[2])[2]")
    private WebElement getTripId;

    @FindBy(xpath = "//tr[2]//td[4]")
    private WebElement secondRowEmail;

    @FindBy(xpath = "//tr[1]//td[4]")
    private WebElement firstRowEmail;

    @FindBy(xpath = "//button[.='IMPORT']")
    private WebElement imp;

    @FindBy(xpath = "//button[.='EXPORT']")
    private WebElement exp;

    @FindBy(xpath = "//input[@value='SUBMIT']")
    private WebElement sbmt;

    @FindBy(xpath = "*//button[.='Cancel']")
    private WebElement cncl;

    @FindBy(xpath = "//input[@name='customer_name']")
    private WebElement newFleet;

    @FindBy(xpath = "//button[.=' Cancel']")
    private WebElement NewFleetCancl;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    private WebElement value1;

    @FindBy(xpath = "//div/h6[.='Select the file to import']")
    private WebElement getPagetxt;

    @FindBy(xpath = "//label//*[contains(.,'Browse')]")
    private WebElement bro;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    private WebElement alert;

    @FindBy(xpath = "//a[@aria-label='Next page']")
    private WebElement nxtpage;

     @FindBy(xpath = "//li[@class='pagination-previous']/..//*[contains(text(),'Next')]")
    private WebElement nxtpageNew;



    @FindBy(xpath = "//a[@aria-label='Previous page']")
    private WebElement previospage;

    @FindBy(xpath = "((//tr)[last()]//td)[1]")
    private WebElement getLastRow;
 @FindBy(xpath = "//tr[last()-1]//td[1]")
    private WebElement getLastRows;

    @FindBy(xpath = "(//tr)[2]//td[1]")
    private WebElement getFirstRow;

    //    @FindBy(xpath = "//li[@class='current']/following-sibling::li")

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    private WebElement checknextPage;

    @FindBy(xpath = "//p[contains(text(),'Entries')]")
    private WebElement checknextPageNew;



    @FindBy(xpath = "//li[@class='pagination-next disabled']")
    private WebElement checknextPagedinld;

    @FindBy(xpath = "//li[@class='pagination-previous disabled']")
    private WebElement checkPreviousPagedinld;

    @FindBy(xpath = "//a[.='Click here to download the template of Customer List']")
    private WebElement downloadImport;

     @FindBy(xpath = "//a[.='Click here to download the template of Trip List']")
    private WebElement downloadImportTrips;



    @FindBy(xpath = "//a[.='Click here to download the template of Drivers List']")
    private WebElement downloadDriverImport;

    @FindBy(xpath="//i[@class='fa fa-pencil fa-2 cursor_ptr']")
    private WebElement edt;

    @FindBy(xpath = "//a[contains(.,'ADD NEW SUBFLEET')]")
    private WebElement addfleet;

    @FindBy(xpath = "//input[@id='customer_name']")
    private WebElement fleetname;

    @FindBy(xpath = "(//tr[2])//td[2]")
    private WebElement secondfleetname;


    @FindBy(xpath = "//input[@id='mobile']")
    private WebElement mobile;

    @FindBy(xpath = "(//tr[2])//td[3]")
    private WebElement secondAdres;

    @FindBy(xpath = "(//tr[2])//td[4]")
    private WebElement secondEmail;

    @FindBy(xpath = "(//tr[2])//td[8]//i")
    private WebElement secondeditClick;


    @FindBy(xpath = "//tr[contains(.,'arya')]//td[4]")
    private WebElement email;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement addEmail;

    @FindBy(xpath = "//tr[contains(.,'ME-DEFAULT')]//td[4]")
    private WebElement emailClick;

    @FindBy(xpath = "//input[@id='address']")
    private WebElement address1;

    @FindBy(xpath="//tr[contains(.,'arya')]//td[2]")
    private WebElement defaultFleet;

    @FindBy(xpath="//tr[contains(.,'arya')]//td[3]")
    private WebElement adress;

    @FindBy(xpath="(//tr[1])//td[3]")
    private WebElement adressFirst;

    @FindBy(xpath="//td[.='ADDRESS']//..//td[3]")
    private WebElement inadress;

   /* @FindBy(xpath="//tr[contains(.,'ME-DEFAULT')]//td[4]")
    private WebElement email;*/

    @FindBy(xpath="//tr[contains(.,'arya')]//td[5]")
    private WebElement noOfVehicles;

    @FindBy(xpath="(//tr)[2]//td[5]")
    private WebElement noOfVehiclescount;

    @FindBy(xpath="(//tr)[2]//td[6]")
    private WebElement noOfDriverscount;

    @FindBy(xpath="//tr[contains(.,'arya')]//td[6]")
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

   /* @FindBy(xpath = "//thead//th")
    private List<WebElement> tblHeading;*/

    @FindBy(xpath = "//tr[contains(.,'arya')]//td[7]")
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

     @FindBy(xpath = "//button[.='EDIT']/preceding::button[1]")
    private WebElement enblDsbl;

    @FindBy(xpath = "//button[.='DISABLE']")
    private WebElement dsbl;

    @FindBy(xpath = "//button[.='ENABLE']")
    private WebElement enbl;



  /*  @FindBy(xpath = "//input[@id='customer_name']")
    private WebElement fleetname;

    @FindBy(xpath = "//input[@id='mobile']")
    private WebElement mobile;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='address']")
    private WebElement address1;*/

    @FindBy(xpath = "//input[@value='Create Customer and Do Later']")
    private WebElement clickOnbigButton;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement click;

    @FindBy(xpath = "//a[.='ASSIGN VEHICLES']")
    private WebElement assgnVehicle;

    @FindBy(xpath ="//label[.='Available Vehicles']" )
    private WebElement lbl;

    @FindBy(xpath = "(//p[@class='cursor_ptr'])[1]")
    private WebElement swap;

    @FindBy(xpath = "(//*[@id='selectvehicle']//p[1])[2]")
    private WebElement swapped;

    @FindBy(xpath = "//a[.='ASSIGN DRIVERS']")
    private WebElement drv;

    @FindBy(xpath = "//label[.='Available Drivers']")
    private WebElement driverpage;

    @FindBy(xpath = "//*[@id='selectdriver']/div/div/div/div/div[1]/div/p[1]")
    private WebElement driver;

    @FindBy(xpath="//*[@id='selectdriver']/div/div/div/div/div[3]/div/p")
    private WebElement driverswp;

    @FindBy(xpath = "//pagination-controls/..//p")
    private WebElement entry;

   /* @FindBy(xpath = "//div[@role='alert']")
    private WebElement alert;*/

    @FindBy(xpath = "//thead//th")
    private List<WebElement> tblHeading;

    @FindBy(xpath = "//div[@class='subscription-plan-heading']/h5")
    private WebElement detailNavigation;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement getStatusAlert;

    @FindBy(xpath = "//span[.='SUB FLEETS']")
    private WebElement subfleet;



    public SubFleetsPage(ExtentTest t1) {
        super(t1);
    }
    public static SubFleetsPage init(ExtentTest t1){return new SubFleetsPage(t1);}


    public SubFleetsPage mobility() throws InterruptedException {
        //driver.wait(100);
        clickOnElement(mob,"Mobility button");
        return this;
    }

    public SubFleetsPage fleets()
    {
        clickOnElement(fleet,"Fleet Button");
        return this;
    }

    public String ttl()
    {
        String str = total.getText();
        return str;
    }

    public String getStatusAlert()
    {
        String str = getStatusAlert.getText();
        return str;
    }

    public String getsecondFleetname()
    {
        String str = secondfleetname.getText();
        return str;
    }

    public String getsecondAdres()
    {
        String str = secondAdres.getText();
        return str;
    }

    public String getsecondEmail()
    {
        String str = secondEmail.getText();
        return str;
    }

    public String alert()
    {
        String str = alert.getText();
        return str;
    }

    public boolean searchIsDisplayed()
    {
        boolean s;
        s=srch.isDisplayed();
        return s;
    }

    public boolean searchIsEnabled()
    {
        boolean s;
        s=srch.isEnabled();
        return s;
    }

    public boolean nextDisbld()
    {
        boolean s;
        s=checknextPage.isEnabled();
        return s;
    }

      public boolean nextDisbldnew()
    {
        boolean s;
        s=checknextPageNew.isEnabled();
        return s;
    }



    public String detailFleetNavigation()
    {
        String s1 = detailNavigation.getText();
        return s1;
    }

    public SubFleetsPage search_sendvalue(String s1)
    {
        srch.sendKeys(s1);
        return this;
    }

    public SubFleetsPage clickSearch()
    {
        clickOnElement(srchclick,"Clicking on search ");
        return this;
    }

    public SubFleetsPage secondeditClick()
    {
        clickOnElement(secondeditClick,"Clicking on search ");
        return this;
    }

    public SubFleetsPage   clickOnbigButton()
    {
        clickOnElement(  clickOnbigButton,"Clicking on   clickOnbigButton ");
        return this;
    }



    public SubFleetsPage subfleet()
    {
        clickOnElement(subfleet,"Clicking on search ");
        return this;
    }

    public String getSearchValue()
    {
        String value = srch.getAttribute("value");
        return value;
    }

    public String getplaceHolder()
    {
        String value = placeHolder.getAttribute("placeholder");
        return value;
    }

    public SubFleetsPage Clears()
    {
        srch.clear();
        return this;
    }

    public SubFleetsPage search_click()
    {
        clickOnElement(srchclick,"Clicking on search");
        return this;
    }
    /* public ArrayList<String> TblHeading()
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
    }*/

    public String getRowName()
    {
        String s1 = RowName.getText();
        return s1;
    }

    public String getTripId()
    {
        String s1 = getTripId.getText();
        return s1;
    }

    public String getFirstRowName()
    {
        String s1 = firstRowName.getText();
        return s1;
    }

    public String getFirstRowTripId()
    {
        String s1 = getFirstRowTripId.getText();
        return s1;
    }

    public String getEnblDsbl()
    {
        String s1 = enblDsbl.getText();
        return s1;
    }

    public SubFleetsPage status_click()
    {
        clickOnElement(enblDsbl,"clicking on status Button");
        return this;
    }


    public String getLastRow()
    {
        String s1 = getLastRow.getText();
        return s1;
    }

     public String getLastRows()
    {
        String s1 = getLastRows.getText();
        return s1;
    }



    public String getFirstRow()
    {
        String s1 = getFirstRow.getText();
        return s1;
    }

    public String getsecondRowEmail()
    {
        String s1 = secondRowEmail.getText();
        return s1;
    }


    public String getfirstRowEmail()
    {
        String s1 = firstRowEmail.getText();
        return s1;
    }

    public String getvalue1()
    {
        String s1 = value1.getText();
        return s1;
    }

    public String getpageValue()
    {
        String s1 = getPagetxt.getText();
        return s1;
    }

    public boolean import_button()
    {
        boolean is;
        is = imp.isDisplayed();
        return is;
    }

    public boolean import_button1()
    {
        boolean is1;
        is1 = imp.isEnabled();
        return is1;
    }

    public SubFleetsPage imp_click()
    {
        clickOnElement(imp,"Fleet Button");
        return this;
    }

    public SubFleetsPage bro_click()
    {
        clickOnElement(bro,"Fleet Button");
        return this;
    }

    public SubFleetsPage Export()
    {
        clickOnElement(exp,"Clicking export");
        return this;
    }

    public SubFleetsPage disable()
    {
        clickOnElement(dsbl,"Clicking disable");
        return this;
    }

    public SubFleetsPage enable()
    {
        clickOnElement(enbl,"Clicking enable");
        return this;
    }

    public boolean AddFleet_enbled()
    {
        boolean flt = addfleet.isEnabled();
        return flt;
    }

    public SubFleetsPage ClickonAddFleet()
    {
        clickOnElement(addfleet,"Clicking on addfleet");
        return this;
    }

    public SubFleetsPage SubmitClick()
    {
        clickOnElement(sbmt,"Clicking on submit button");
        return this;
    }
    public boolean CheckSubmit()
    {
        boolean s=sbmt.isDisplayed();
        return s;
    }

    public boolean CheckCancel()
    {
        boolean s=cncl.isDisplayed();
        return s;
    }

    public SubFleetsPage cickOnCancel()
    {
        clickOnElement(cncl,"Cancel of browse");
        return this;
    }

    public SubFleetsPage cnclfleet()
    {
        clickOnElement(NewFleetCancl,"Cancel");
        return this;
    }

    public SubFleetsPage nextPage()
    {
        clickOnElement(nxtpage,"Cancel");
        return this;
    }

    public SubFleetsPage nextPageNew()
    {
        clickOnElement(nxtpageNew,"Cancel");
        return this;
    }



    public boolean isnextPage()
    {
        boolean is = nxtpage.isDisplayed();
        return is;
    }

    public SubFleetsPage previosPage()
    {
        clickOnElement(previospage,"Cancel");
        return this;
    }

    public String getdisbledPageStatus()
    {
        String s1 = checknextPagedinld.getAttribute("class");
        return s1;
    }

    public String getdisbledPageStatusprevious()
    {
        String s1 = checkPreviousPagedinld.getAttribute("class");
        return s1;
    }

    public String getDownloadImptag()
    {
        String s1 = downloadImport.getTagName();
        return s1;
    }



    public String downloadImportTripsTag()
    {
        String s1 = downloadImportTrips.getTagName();
        return s1;
    }



    public SubFleetsPage clickOnIMPdownloadLink()
    {
        downloadImport.click();
        return this;
    }

    public SubFleetsPage clickOnIMPdownloadLinkTrips()
    {
        downloadImportTrips.click();
        return this;
    }



    public SubFleetsPage clickDriverOnIMPdownloadLink()
    {
        downloadDriverImport.click();
        return this;
    }

    public SubFleetsPage edit()
    {
        clickOnElement(edt,"Clicking on edit");
        return this;
    }

   /* public SubFleetsPage ClickonAddFleet()
    {
        clickOnElement(addfleet,"Clicking on addfleet");
        return this;
    }*/

    /*public String fleetNmae(String s1)
    {
        fleetname.sendKeys(s1);
        return  s1;
    }

    public String fltName()
    {
        String d1=fleetname.getAttribute("value");
        return d1;
    }

    public String mobilevalue()
    {
        String s=mobile.getAttribute("class");
        return s;
    }

    public SubFleetsPage  mobileClear()
    {
        mobile.clear();
        return this;
    }

    public String mobileNumber(String m1)
    {
        mobile.sendKeys(m1);
        return m1;
    }

    public String mobileValuenumber()
    {
        String ss=mobile.getAttribute("value");
        return ss;
    }
    public SubFleetsPage emailClick()
    {
        clickOnElement(email,"Clicking on email");
        return this;
    }

    public SubFleetsPage clearemail()
    {
        email.clear();
        return this;
    }

    public String getEmailValue()
    {
        String text = email.getAttribute("value");
        return text;
    }
*/
   /* public String eMail(String m1)
    {
        email.sendKeys(m1);
        return m1;
    }
    public String emailvalue()
    {
        String s=email.getAttribute("class");
        return s;
    }

    public SubFleetsPage addressClick()
    {
        clickOnElement(address1,"Clicking on adress");
        return this;
    }*/

   /* public String addresss(String m1)
    {
        address1.sendKeys(m1);
        return m1;
    }
    public String adressvalue()
    {
        String s=address1.getAttribute("value");
        return s;
    }

    public SubFleetsPage mobileNumberClick()
    {
        clickOnElement(mobile,"Clicking on mobile number");
        return this;
    }*/

    /*public SubFleetsPage adressClear()
    {
        address1.clear();
        return this;
    }*/

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

    public String getFirstAdress()
    {
        String adresss = adressFirst.getText();
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

    public SubFleetsPage clcikonfleet()
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
        String adr = inadress.getText();
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



    public ArrayList<String> VehiclTblHeading()
    {
        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:vehiclesTblHeading)
        {
            String names = name.getText();
//           System.out.println(names);
            nm.add(names);
        }
        System.out.println("The actual table headings "+nm);
        return nm;
    }

    public ArrayList<String> driverTblHeading()
    {
        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:driverTblHeading)
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

    public SubFleetsPage goback()
    {
        clickOnElement(clickBack,"clicking back");
        return this;
    }

    public SubFleetsPage clickedit()
    {
        clickOnElement(edit,"clicking edit");
        return this;
    }

    public SubFleetsPage clickAssign()
    {
        clickOnElement(assignvehicle,"clicking assign vehicle");
        return this;
    }

    public SubFleetsPage clickDriverAssign()
    {
        clickOnElement(assignDriver,"clicking assign driver");
        return this;
    }

    public String fleetNmae(String s1)
    {
        fleetname.sendKeys(s1);
        return  s1;
    }

    public SubFleetsPage fleetNameClear()
    {
        fleetname.clear();
        return this;
    }

    public String fltName()
    {
        String d1=fleetname.getAttribute("value");
        return d1;
    }

    public SubFleetsPage clcikfleetName()
    {
        clickOnElement(fleetname,"click");
        return this;
    }

    public String mobileNumber(String m1)
    {
        mobile.sendKeys(m1);
        return m1;
    }

   /* public String invalidmobileNumber(ArrayList<String> m1)
    {
        mobile.sendKeys(m1);
        return m1;
    }*/

    public SubFleetsPage mobileNumberClick()
    {
        clickOnElement(mobile,"Clicking on mobile number");
        return this;
    }

    public String mobilevalue()
    {
        String s=mobile.getAttribute("class");
        return s;
    }

    public SubFleetsPage mobileClear()
    {
        mobile.clear();
        return this;
    }

    public String mobileValuenumber()
    {
        String ss=mobile.getAttribute("value");
        return ss;
    }

    public SubFleetsPage emailClick()
    {
        clickOnElement(email,"Clicking on email");
        return this;
    }

    public SubFleetsPage clickEmail()
    {
        clickOnElement(addEmail,"Clicking on email");
        return this;
    }

    public SubFleetsPage clearemail()
    {
        addEmail.clear();
        return this;
    }

    public String getEmailValue()
    {
        String text = email.getAttribute("value");
        return text;
    }

    public String getEmailValues()
    {
        String text = addEmail.getAttribute("value");
        return text;
    }

    public String eMail(String m1)
    {
        addEmail.sendKeys(m1);
        return m1;
    }

    public String emailvalue()
    {
        String s=email.getAttribute("class");
        return s;
    }
    public String emailvalues()
    {
        String s=addEmail.getAttribute("class");
        return s;
    }


    public SubFleetsPage addressClick()
    {
        clickOnElement(address1,"Clicking on adress");
        return this;
    }

    public String addresss(String m1)
    {
        address1.sendKeys(m1);
        return m1;
    }

    public String adressvalue()
    {
        String s=address1.getAttribute("value");
        return s;
    }

    public SubFleetsPage adressClear()
    {
        address1.clear();
        return this;
    }

    public SubFleetsPage assing()
    {
        clickOnElement(assgnVehicle,"Clicking on assign");
        return this;
    }

    public String  lable()
    {
        return lbl.getText();
    }

    public SubFleetsPage swap()
    {
        clickOnElement(swap,"Clicking on vin number");
        return this;
    }

    public String swapNum()
    {
        String v = swap.getText();
        return v;
    }

    public String afterSwap()
    {
        String v2=swapped.getText();
        return v2;
    }

    public SubFleetsPage clickswappedNum()
    {
        clickOnElement(swapped,"Clicking drivers");
        return this;
    }

    public SubFleetsPage drivers()
    {
        clickOnElement(drv,"Clicking drivers");
        return this;
    }

    public String driver()
    {
        String a = driverpage.getText();
        return a;
    }

    public String driverName()
    {
        String name=driver.getText();
        return name;
    }

    public SubFleetsPage driverswapping()
    {
        clickOnElement(driver,"Clicking drivers");
        return this;
    }

    public String swappeddriverName()
    {
        String name=driverswp.getText();
        return name;
    }

    public SubFleetsPage removeswappedDriver()
    {
        clickOnElement(driverswp,"Clicking on save button");
        return  this;
    }

    public SubFleetsPage clcikOnSave()
    {
        clickOnElement(click,"Clicking on save button");
        return  this;
    }

    public String totalrows()
    {
        String txt = entry.getText();
        return txt;
    }

    public String alert1()
    {
        String txt = alert.getText();
        return txt;
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
}
