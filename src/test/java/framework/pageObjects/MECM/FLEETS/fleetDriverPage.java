package framework.pageObjects.MECM.FLEETS;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import framework.pageObjects.Page_info.Fleet_Page;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class fleetDriverPage extends PageInit
{

    @FindBy(xpath = "//a[.='DRIVERS']")
    private WebElement driver;

    @FindBy(xpath = "//button[.='ASSIGN VEHICLE']")
    private WebElement assignvehiclesinEdit;

    @FindBy(xpath = "//button[.='REMOVE VEHICLE']")
    private WebElement removeVehiclesinEdit;

    @FindBy(xpath = "//*[@id='dashboard_wrapper']/section/div[1]/div/form/div[1]/div[2]/button[1]")
    private WebElement clickOnassignAndRemoveButton;

    @FindBy(xpath = "//span[@class='dropify-filename-inner']")
    private WebElement uploadPic;

    @FindBy(xpath = "(//td[contains(.,'Scheduled')]//..//td)[1]//input")
    private WebElement isdisbled;

    @FindBy(xpath = "(//td[contains(.,'Available')]//..//td)[1]//input")
    private WebElement isenbld;

    @FindBy(xpath = "//div[@class='row table-heading']//h5")
    private WebElement tableHeading;

    @FindBy(xpath = "//button[@class='close']")
    private WebElement closePic;

    @FindBy(xpath = "//span[@class='icon-view view-btn']")
    private WebElement icon;

    @FindBy(xpath = "//span[@class='icon-replace replace-btn']")
    private WebElement swapping;

    @FindBy(xpath = "//span[@class='delete-icon delete-btn']")
    private WebElement deleteUploadPic;

    @FindBy(xpath = "//div[@class='metric-card']//span")
    private WebElement total;

    @FindBy(xpath ="//input[@type='search']")
    private WebElement srch;

    @FindBy(xpath ="//span[@class='delete-icon delete-btn']/../../..//div")
    private WebElement isDocDisplay;

    @FindBy(xpath ="//div[@class='modal-header']//h6")
    private WebElement iconHeader;

    @FindBy(xpath = "//a[@class='btn search-btn']")
    private WebElement srchclick;

    @FindBy(xpath = "//thead//th")
    private List<WebElement> tblHeading;

    @FindBy(xpath = "//tr[1]//td[3]")
    private WebElement firstRow;

    @FindBy(xpath = "//button[.='IMPORT']")
    private WebElement imp;

    @FindBy(xpath = "//button[.='EXPORT']")
    private WebElement exp;

    @FindBy(xpath = "//input[@name='customer_name']")
    private WebElement addfleet;

    @FindBy(xpath = "//input[@value='SUBMIT']")
    private WebElement sbmt;

    @FindBy(xpath = "*//button[.='Cancel']")
    private WebElement cncl;

    @FindBy(xpath = "//input[@name='customer_name']")
    private WebElement newFleet;

    @FindBy(xpath = "//button[.=' Cancel']")
    private WebElement NewFleetCancl;

    @FindBy(xpath = "//tbody//tr[1]//td[3]")
    private WebElement value1;

    @FindBy(xpath = "//div/h6[.='Select the file to import']")
    private WebElement getPagetxt;

    @FindBy(xpath = "//a[.='Click here to download the template of Drivers List']")
    private WebElement downloadImport;

    @FindBy(xpath = "//label//*[contains(.,'Browse')]")
    private WebElement bro;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    private WebElement alert;

    @FindBy(xpath = "//tr[1]//td[2]")
    private WebElement firstRowName;

    @FindBy(xpath = "//a[contains(text(),'ADD DRIVER')]")
    private WebElement clickAdd;

    @FindBy(xpath = "//button[.=' Cancel']")
    private WebElement cancel;

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement secondName;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    private WebElement DocItems;

    @FindBy(xpath = "//div[@class='ui-select-match']//span")
    private WebElement genderdropdown;

    @FindBy(xpath = "(//label[.='Gender']/following::span)[1]")
    private WebElement gender;

    @FindBy(xpath = "//div[.='Female']")
    private WebElement selectFemaledropDown;

    @FindBy(xpath = "//input[@name='mobile']")
    private WebElement mobile;

    @FindBy(xpath = "//ul[@role='menu']//div//div")
    private List<WebElement>  menu;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@type='date']")
    private WebElement date;

    @FindBy(xpath = "//input[@name='driving_licence']")
    private WebElement licence;

    @FindBy(xpath = "//input[@name='dl_expiry_date']")
    private WebElement exprdate;

    @FindBy(xpath = "//input[@name='address']")
    private WebElement adres;

    @FindBy(xpath = "//input[@name='approveremail']")
    private WebElement aprover;

    @FindBy(xpath = "//span[.='Select document type']")
    private WebElement clickUploadDoc;

    @FindBy(xpath = "//ul[@role='menu']//li")
    private List<WebElement> menuDrop;

    @FindBy(xpath = "//div[.='Driving Licence (Front)']")
    private WebElement dlF;

    @FindBy(xpath = "//div[.='Driving Licence (Back)']")
    private WebElement dlB;

    @FindBy(xpath = "//div[.='Pan Card']")
    private WebElement pc;

    @FindBy(xpath = "//div[.='Aadhar Card (Front)']")
    private WebElement acF;

    @FindBy(xpath = "//div[.='Aadhar Card (Back)']")
    private WebElement acB;

    @FindBy(xpath = "//div[.='Background Verification Document']")
    private WebElement bvd;

    @FindBy(xpath = "//div[.='Police Verification Document']")
    private WebElement pvd;

    @FindBy(xpath = "//*[@id='driverdocument']/div/div[2]/span/span")
    private WebElement getDropdwnValue;

    @FindBy(xpath = "//*[@id='dashboard_wrapper']/section/div/div/form/div[2]/div[2]/div/div[12]/div/div/div[2]/div/div[1]/p")
    private WebElement getTabdocValue;

    @FindBy(xpath = "//span[.='Browse']")
    private WebElement clickOnBrowse;

    @FindBy(xpath = "//div[@class='doc-table-image']")
    private WebElement driverDocImg;

    @FindBy(xpath = "(//p[@class='doc-table-text'])[2]")
    private WebElement driverDocTxt;

    @FindBy(xpath = "//div[@class='icon-replace replace-btn']")
    private WebElement driverDocEdit;

    @FindBy(xpath = "//input[@value='Save']")
    private WebElement saveDriver;

    @FindBy(xpath = "//input[@value='Update']")
    private WebElement Update;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement alertMessage;

    @FindBy(xpath = "//button[.='Assign Vehicle']")
    private WebElement clcikingOnAssign;

    @FindBy(xpath = "(//td[8]//i)[2]")
    private WebElement  edit;

    @FindBy(xpath = "//td[2]")
    private WebElement  tableFname;

    @FindBy(xpath = "  //td[3]")
    private WebElement  tableSname;

    @FindBy(xpath = "  //td[3]")
    private WebElement  tablegender;

    @FindBy(xpath = "  //td[4]")
    private WebElement  tableDOB;

    @FindBy(xpath = "  //td[5]")
    private WebElement tablePhone;

    @FindBy(xpath = "  //td[6]")
    private WebElement  tableSubfleet;

    @FindBy(xpath = "  //td[7]")
    private WebElement tableVehicleAssign;

    @FindBy(xpath = "  //td[8]")
    private WebElement  tabletriptaken;

    @FindBy(xpath = "  //td[9]")
    private WebElement  tablerating;

    @FindBy(xpath = "  //td[10]")
    private WebElement  tablestatus;

    @FindBy(xpath = "//input[@id='approveremail']")
    private WebElement approveremail;

     @FindBy(xpath = "//button[.='ASSIGN VEHICLE']/..//button[2]")
    private WebElement  insideStatus;

    @FindBy(xpath = "//button[2]/..//button[1]")
    private WebElement  insideStatusOfAssignVehicle;

     @FindBy(xpath = "  //td[12]")
    private WebElement  tableavlblty;

    @FindBy(xpath = "  //td[12]")
    private WebElement  tableAction;

    @FindBy(xpath = "//div[text()= ' DRIVER DETAILS ']/following-sibling::div//div//h5")
    private WebElement  insideDriverName;

    @FindBy(xpath = " (//div[text()= ' DRIVER DETAILS ']/following-sibling::div//div//p)[1]")
    private WebElement  insideSubfleet;



    @FindBy(xpath = "(//p[.='DOB']//../..//p)[7]")
    private WebElement  insideDOB;

    @FindBy(xpath = "(//p[.='DOB']//../..//p)[8]")
    private WebElement  insideGender;

    @FindBy(xpath = "(//p[.='DOB']//../..//p)[10]")
    private WebElement  insideMobile;

    @FindBy(xpath = "//div[.=' NO. OF TRIPS TAKEN ']/../p")
    private WebElement  insideNoOfTripsTaken;

    @FindBy(xpath = "//div[.=' RATING ']/../p")
    private WebElement  insideRating;



  /*  @FindBy(xpath ="//input[@type='search']")
    private WebElement srch;
*/
    @FindBy(xpath ="//span[.='DRIVER LIST']//..//i")
    private WebElement arrow;

     @FindBy(xpath ="//span[.='COMMUTER LIST']//..//i")
    private WebElement arrowCommuter;


    @FindBy(xpath ="//input[@type='file']")
    private WebElement clickingOnImage;

    @FindBy(xpath ="//div[@role='alert']")
    private WebElement imgAlert;

    @FindBy(xpath = "//a[@aria-label='Next page']")
    private WebElement nxtpage;

    @FindBy(xpath = "//a[@class='dropdown-item']//div")
    private List<WebElement> allDocs;

    @FindBy(xpath = "//ul[@role='menu']//li")
    private WebElement allDocss;

    @FindBy(xpath = "((//tr)[last()]//td)[1]")
    private WebElement getLastRow;


    @FindBy(xpath = "//li[@class='pagination-next disabled']")
    private WebElement checknextPagedinld;

    @FindBy(xpath = "(//tr)[2]//td[1]")
    private WebElement getFirstRow;

    @FindBy(xpath = "//a[@aria-label='Previous page']")
    private WebElement previospage;

    @FindBy(xpath = "//li[@class='pagination-previous disabled']")
    private WebElement checkPreviousPagedinld;

    @FindBy(xpath = "//p[contains(text(),'Entries')]")
    private WebElement entry;

    @FindBy(xpath = "//tr[2]//td[2]")
    private WebElement RowName;


    public fleetDriverPage(ExtentTest t1) { super(t1); }
    public static fleetDriverPage init(ExtentTest t1){return new fleetDriverPage(t1);}


    public fleetDriverPage clcikOnAddDriver()
    {
        clickOnElement(clickAdd,"clikcing on add driver");
        return this;
    }

    public fleetDriverPage Export()
    {
        clickOnElement(exp,"Clicking export");
        return this;
    }

    public fleetDriverPage assignVehiclesInEdit()
    {
        clickOnElement(assignvehiclesinEdit,"assignVehiclesInEdit");
        return this;
    }
    public fleetDriverPage removeVehiclesinEdit()
    {
        clickOnElement(removeVehiclesinEdit,"removeVehiclesinEdit");
        return this;
    }

    public fleetDriverPage clcikingOnAssign()
    {
        clickOnElement(clcikingOnAssign,"clcikingOnAssign");
        return this;
    }

    public String tableHeadingAssignVehicle()
    {
        String yes = tableHeading.getText();
        return yes;
    }

    public String getCurrentStatusOfAssigningVehicles()
    {
        String yes = insideStatusOfAssignVehicle.getText();
        return yes;
    }

    public boolean isdisbled()
    {
       /* try
        { */
            boolean yes;
            yes=isdisbled.isEnabled();
            return yes;
        /*}
        catch (Exception e)
        {
            return false;
        }
*/
    }

    public boolean isenbld()
    {
        try
        {
            boolean yes;
            yes=isenbld.isEnabled();
            return yes;
        }
        catch (Exception e)
        {
            return false;
        }

    }

   /* public fleetDriverPage clickOnenbldVehicle()
    {
        clickOnElement(isenbld,"clicking on isenbld");
        return this;
    }*/

    public fleetDriverPage clickingOnavailable()
    {
        clickOnElement(isenbld,"clicking on isenbld");
        return this;
    }


    /* public fleetDriverPage clicOnkArrow()
    {
        clickOnElement(arrow,"click on arrow");
        return this;
    }*/
    public String getRowName()
    {
        String s1 = RowName.getText();
        return s1;
    }

    public String insideDriverName()
    {
        String s1 = insideDriverName.getText();
        return s1;
    }

    public String  insideSubfleet()
    {
        String s1 =  insideSubfleet.getText();
        return s1;
    }

    public String insideDOB()
    {
        String s1 = insideDOB.getText();
        return s1;
    }

    public String insideGender()
    {
        String s1 = insideGender.getText();
        return s1;
    }

    public String insideMobile()
    {
        String s1 = insideMobile.getText();
        return s1;
    }

    public String insideNoOfTripsTaken()
    {
        String s1 = insideNoOfTripsTaken.getText();
        return s1;
    }

    public String insideRating()
    {
        String s1 = insideRating.getText();
        return s1;
    }
    public boolean CheckSubmit()
    {
        boolean s=sbmt.isDisplayed();
        return s;
    }

   public int getDocCount()
    {
         int count=allDocs.size();
         return count;
    }

    public fleetDriverPage clickingOnAllDocs()
    {
        clickOnElement(allDocss,"clicking on all docs");
        return this;
    }

    public fleetDriverPage swappingPic()
    {
        clickOnElement(swapping,"clicking on swap pic");
        return this;
    }

    public boolean CheckCancel()
    {
        boolean s=cncl.isDisplayed();
        return s;
    }

    public fleetDriverPage cickOnCancel()
    {
        clickOnElement(cncl,"Cancel of browse");
        return this;
    }

    public String totalrows()
    {
        String txt = entry.getText();
        return txt;
    }

    public fleetDriverPage previosPage()
    {
        clickOnElement(previospage,"Cancel");
        return this;
    }


   /* public String getFirstRow()
    {
        String s1 = getFirstRow.getText();
        return s1;
    }*/

    public String getdisbledPageStatus()
    {
        String s1 = checknextPagedinld.getAttribute("class");
        return s1;
    }
    public String getLastRow()
    {
        String s1 = getLastRow.getText();
        return s1;
    }

    public String iconHeader()
    {
        String s1 = iconHeader.getText();
        return s1;
    }

    public boolean isCancelEnabled()
    {
        boolean yes;
        yes=cancel.isEnabled();
        return yes;
    }

    public fleetDriverPage nextPage()
    {
        clickOnElement(nxtpage,"Cancel");
        return this;
    }

    public fleetDriverPage deleteUploadPic()
    {
        clickOnElement(deleteUploadPic,"deleteUploadPic");
        return this;
    }

    public fleetDriverPage clcikOnCancel()
    {
        clickOnElement(cancel,"clikcing on add driver");
        return this;
    }

    public boolean is1stNameEnabled()
    {
        boolean yes;
        yes=firstName.isEnabled();
        return yes;
    }

    public boolean isDocDisplayed()
    {
        try
        {
        boolean yes;
        yes=isDocDisplay.isDisplayed();
        return yes;
    }
        catch (Exception e)
        {
        return false;
    }

    }

    public fleetDriverPage sendFirstName(String s1)
    {
        firstName.sendKeys(s1);
        return this;
    }
    public fleetDriverPage search_CLear()
    {
        srch.clear();
        return this;
    }

    public String firstNameText()
    {
        String v1 = firstName.getAttribute("value");
        return v1;
    }

    public String firstNameTextvalue()
    {
        String v1 = firstName.getText();
        return v1;
    }

    public String getUploadPicText()
    {
        String v1 = uploadPic.getText();
        return v1;
    }

    public String clickOnassignAndRemoveButton()
    {
        String v1 = clickOnassignAndRemoveButton.getText();
        return v1;
    }

    /*public String takeAtriFirstName()
    {
        String v1 = firstName.getAttribute("class");
        return v1;
    }

*/

    public String takeAtriFirstName()
    {
        String v1 = firstName.getAttribute("class");
        return v1;
    }

  /*  public String takeFirstNameValue()
    {
        String v1 = firstName.getAttribute("value");
        return v1;
    }*/

    public String takeFirstNameValue()
    {
        String v1 = firstName.getAttribute("value");
        return v1;
    }
    public boolean issecondNameEnabled()
    {
        boolean yes;
        yes=secondName.isEnabled();
        return yes;
    }

    public fleetDriverPage sendSecondName(String s1)
    {
        secondName.sendKeys(s1);
        return this;
    }

    public fleetDriverPage clearSecondName()
    {
        secondName.clear();
        return this;
    }

    public String secondNameText()
    {
        String v1 = secondName.getAttribute("value");
        return v1;
    }

    public String takeAtriSecondName()
    {
        String v1 = secondName.getAttribute("class");
        return v1;
    }

    public fleetDriverPage clcikOnGenderDropdown()
    {
        clickOnElement(genderdropdown,"clikcing on dropdown");
        return this;
    }

    public fleetDriverPage clcikOnFemaleDropdown()
    {
        clickOnElement(selectFemaledropDown,"clikcing on female");
        return this;
    }

    public fleetDriverPage clcikOnIcon()
    {
        clickOnElement(icon,"clikcing on icon");
        return this;
    }

    public String genderText()
    {
        String v1 = gender.getText();
        return v1;
    }

    public boolean isgenderEnabled()
    {
        boolean yes;
        yes=genderdropdown.isEnabled();
        return yes;
    }

    public String takeAtrigenderDropdown()
    {
        String v1 = genderdropdown.getText();
        return v1;
    }

    public boolean ismobileEnabled()
    {
        boolean yes;
        yes=mobile.isEnabled();
        return yes;
    }

    public fleetDriverPage sendMobilenumber(String s1)
    {
        mobile.sendKeys(s1);
        return this;
    }

    public String mobileText()
    {
        String v1 = mobile.getAttribute("value");
        return v1;
    }

    public fleetDriverPage mobileTextClear()
    {
        mobile.clear();
        return this;
    }

    public String takeAtriMobile()
    {
        String v1 = mobile.getAttribute("class");
        return v1;
    }

    public ArrayList<String> dropdownvalues()
    {
        ArrayList<String> nm=new ArrayList<>();
        for(WebElement v: menu)
        {
            String values=v.getText();
            nm.add(values);
        }
        System.out.println("the values "+nm);
        return nm;
    }

    public boolean isEmailEnabled()
    {
        boolean yes;
        yes=email.isEnabled();
        return yes;
    }

    public fleetDriverPage sendEmail(String s1)
    {
        email.sendKeys(s1);
        return this;
    }

    public String takeAtriEmail()
    {
        String v1 = secondName.getAttribute("class");
        return v1;
    }

    public String takeAtriEmaill()
    {
        String v1 = email.getAttribute("class");
        return v1;
    }


    public String approveremailAtri()
    {
        String v1 = approveremail.getAttribute("class");
        return v1;
    }



    public String emailText()
    {
        String v1 = email.getAttribute("value");
        return v1;
    }

    public fleetDriverPage emailTextClear()
    {
        email.clear();
        return this;
    }

    public boolean isDateEnabled()
    {
        boolean yes;
        yes=date.isEnabled();
        return yes;
    }

    public fleetDriverPage date(String d)
    {
        date.sendKeys(d);
        return this;
    }

    public String takeAtriDate()
    {
        String v1 = date.getAttribute("class");
        return v1;
    }


    public String dobText()
    {
        String v1 = date.getAttribute("value");
        return v1;
    }

    public boolean islicenceEnabled()
    {
        boolean yes;
        yes=licence.isEnabled();
        return yes;
    }

    public fleetDriverPage sendLicence(String s1)
    {
        licence.sendKeys(s1);
        return this;
    }

    public String licenceText()
    {
        String v1 = licence.getAttribute("value");
        return v1;
    }

    public fleetDriverPage licenceTextClear()
    {
        licence.clear();
        return this;
    }

    public String takeAtriLicence()
    {
        String v1 = licence.getAttribute("class");
        return v1;
    }

    public boolean isExprDateEnabled()
    {
        boolean yes;
        yes=exprdate.isEnabled();
        return yes;
    }

    public fleetDriverPage exprdate(String d)
    {
        exprdate.sendKeys(d);
        return this;
    }

    public String exprdateText()
    {
        String v1 = exprdate.getAttribute("value");
        return v1;
    }

    public String takeAtriExprDate()
    {
        String v1 = exprdate.getAttribute("class");
        return v1;
    }

    public boolean isAdresEnabled()
    {
        boolean yes;
        yes=adres.isEnabled();
        return yes;
    }

    public fleetDriverPage adres(String d)
    {
        adres.sendKeys(d);
        return this;
    }

    public fleetDriverPage aprover(String d)
    {
        aprover.sendKeys(d);
        return this;
    }



    public String takeAtriAdress()
    {
        String v1 = adres.getAttribute("class");
        return v1;
    }

    public fleetDriverPage adresClear()
    {
        adres.clear();
        return this;
    }

    public fleetDriverPage clcikOnDocUpload()
    {
        clickOnElement(clickUploadDoc,"clikcing on uploaddoc");
        return this;
    }

    public fleetDriverPage closePic()
    {
        clickOnElement(closePic,"clikcing on close");
        return this;
    }

    public ArrayList<String> dropdownvaluesDoc()
    {
        ArrayList<String> nm=new ArrayList<>();
        for(WebElement v: menuDrop)
        {
            String values=v.getText();
            nm.add(values);
        }
        System.out.println("the values "+nm);
        return nm;
    }

    public fleetDriverPage clcikOnDLF()
    {
        clickOnElement(dlF,"clikcing on DLF");
        return this;
    }

    public fleetDriverPage clcikOnDLB()
    {
        clickOnElement(dlB,"clikcing on DLB");
        return this;
    }

    public fleetDriverPage clcikOnPan()
    {
        clickOnElement(pc,"clikcing on pan");
        return this;
    }

    public fleetDriverPage clcikOnAdharF()
    {
        clickOnElement(acF,"clikcing on adharF");
        return this;
    }

    public fleetDriverPage clcikOnAdharB()
    {
        clickOnElement(acB,"clikcing on adharB");
        return this;
    }

    public fleetDriverPage clcikOnBackgroundVerification()
    {
        clickOnElement(bvd,"clikcing on BackgroundVerification");
        return this;
    }

    public fleetDriverPage clcikOnpoloicVerification()
    {
        clickOnElement(pvd,"clikcing on police verification");
        return this;
    }

    public String NAME()
    {
        String doc=tableFname.getText();
        return doc;
    }

    public String GENDER()
    {
        String doc=tablegender.getText();
        return doc;
    }

    public String DOB()
    {
        String doc=tableDOB.getText();
        return doc;
    }

    public String PHONE()
    {
        String doc=tablePhone.getText();
        return doc;
    }

    public String SUBFLEET()
    {
        String doc=tableSubfleet.getText();
        return doc;
    }

    public String VEHICLE_ASSIGNED()
    {
        String doc=tableVehicleAssign.getText();
        return doc;
    }

    public String TRIPS_TAKEN()
    {
        String doc=tabletriptaken.getText();
        return doc;
    }

    public String RATING()
    {
        String doc=tablerating.getText();
        return doc;
    }

    public String STATUS()
    {
        String doc=tablestatus.getText();
        return doc;
    }

    public String inSTATUS()
    {
        String doc=insideStatus.getText();
        return doc;
    }

    public fleetDriverPage inSTATUSClick()
    {
        clickOnElement(insideStatus,"clikcing on inSTATUSClick");
        return this;
    }

    public fleetDriverPage driverDetailClick()
    {
        clickOnElement(tableFname,"clikcing on inSTATUSClick");
        return this;
    }

    public String AVAILABILITY()
    {
        String doc=tableavlblty.getText();
        return doc;
    }

    public String ACTIONS()
    {
        String doc=tableAction.getText();
        return doc;
    }

    public String getDocTabValue()
    {
        String doc=getTabdocValue.getText();
        return doc;
    }

    public String getDropdownValue()
    {
        String doc=getDropdwnValue.getText();
        return doc;
    }

    public fleetDriverPage clcikOnBrowse()
    {
        clickOnElement(clickOnBrowse,"clikcing on Browse");
        return this;
    }

    public String takeAtriDocimage()
    {
        String v1 = driverDocImg.getAttribute("class");
        return v1;
    }

    public String takeAtriDocText()
    {
        String v1 = driverDocTxt.getText();
        return v1;
    }

    public String takeAlertText()
    {
        String v1 = alertMessage.getText();
        return v1;
    }

    public fleetDriverPage saveDriver()
    {
        clickOnElement(saveDriver,"Saving driver");
        return this;

    }

    public fleetDriverPage saveCommuter()
    {
        clickOnElement(saveDriver,"Saving driver");
        return this;

    }
    public fleetDriverPage Update()
    {
        clickOnElement(Update,"Saving driver");
        return this;

    }


    public fleetDriverPage driverEdit()
    {
        clickOnElement(edit,"edit driver");
        return this;

    }

    public fleetDriverPage clickArrow()
    {
        clickOnElement(arrow,"click on arrow");
        return this;
    }

    public fleetDriverPage clickArrowCommuter()
    {
        clickOnElement(arrowCommuter,"click on arrow");
        return this;
    }

    public fleetDriverPage clickonDriverImageTodownload()
    {
        clickOnElement(clickingOnImage,"click on arrow");
        return this;
    }

    public String takeimageUploadtxt()
    {
        String v1 = imgAlert.getText();
        return v1;
    }

    public fleetDriverPage clearMobdata()
    {

        mobile.clear();
        return this;
    }

    public fleetDriverPage clikOnDriver()
    {
        clickOnElement(driver,"Clicking on driverLink");
        return this;
    }


    public String ttl()
    {
        String str = total.getText();
        return str;
    }

   /* public String alert()
    {
        String str = alert.getText();
        return str;
    }*/


    public fleetDriverPage search_sendvalue(String s1)
    {
        srch.sendKeys(s1);
        return this;
    }

  /*  public fleetDriverPage search_CLear()
    {
        srch.clear();
        return this;
    }*/

    public fleetDriverPage clickSearch()
    {
        clickOnElement(srchclick,"Clicking on search ");
        return this;
    }

    public String getSearchValue()
    {
        String value = srch.getAttribute("value");
        return value;
    }
    public fleetDriverPage Clears()
    {
        srch.clear();
        return this;
    }
    public fleetDriverPage search_click()
    {
        clickOnElement(srchclick,"Clicking on search");
        return this;
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

    public String getFirstRow()
    {
        String s1 = getFirstRow.getText();
        return s1;

    }

    public String getvalue1()
    {
        String s1 = value1.getText();
        return s1;

    }

    public String getdisbledPageStatusprevious()
    {
        String s1 = checkPreviousPagedinld.getAttribute("class");
        return s1;
    }

    public String getpageValue()
    {
        String s1 = getPagetxt.getText();
        return s1;

    }

    public String getFirstRowName()
    {
        String s1 = firstRowName.getText();
        return s1;

    }

    /*public String getsecondRowEmail()
    {
        String s1 = secondRowEmail.getText();
        return s1;

    }

    public String getfirstRowEmail()
    {
        String s1 = getfirstRowEmail.getText();
        return s1;

    }*/

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

    public String getDownloadImptag()
    {
        String s1 = downloadImport.getTagName();
        return s1;
    }

    public fleetDriverPage imp_click()
    {
        clickOnElement(imp,"Fleet Button");
        return this;
    }







}
