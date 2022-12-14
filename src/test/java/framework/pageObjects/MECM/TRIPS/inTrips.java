package framework.pageObjects.MECM.TRIPS;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class inTrips extends PageInit
{

    @FindBy(xpath = "//a[.='TRIPS']")
    private WebElement TRIPS;

    @FindBy(xpath = "//td[2]")
    private WebElement getTripId;

    @FindBy(xpath = "//div[contains(text(),'TRIP ')]/..//span")
    private WebElement headingStatus;

    @FindBy(xpath = "//td[.='Trip Id']/..//td[3]")
    private WebElement insideTripId;

      @FindBy(xpath = "//td[.='Trip Scheduled At']/..//td[3]")
    private WebElement insideTripScheduled;

    @FindBy(xpath = "//td[.='Trip Start Time']/..//td[3]")
    private WebElement insidetripStartTime;

    @FindBy(xpath = "//td[.='Trip End Time']/..//td[3]")
    private WebElement insidetripEndTime;

    @FindBy(xpath = "//td[.='Trip Type']/..//td[3]")
    private WebElement insideTripType;

    @FindBy(xpath = "//td[.='Drop Points']/..//td[3]")
    private WebElement insideDropPoints;

    @FindBy(xpath = "//td[.='Source']/..//td[3]")
    private WebElement insideSource;

     @FindBy(xpath = "//div[@id='employee']/i")
    private WebElement clickOnEmployeeDropdown;

     @FindBy(xpath = "//div[@class='employee-card-header']")
    private List<WebElement> insideCOuntsOfEmployeeHeader;

    @FindBy(xpath = "(//div[@class='employee-card-header'])[1]")
    private WebElement employeeNameOne;

  @FindBy(xpath = "(//div[@class='employee-card-header'])[2]")
    private WebElement employeeNameTwo;

 @FindBy(xpath = "(//div[@class='employee-card-header'])[3]")
    private WebElement employeeNameThree;

@FindBy(xpath = "(//td[.='Emp Id']/..//td[3])[1]")
    private WebElement empIdOne;

@FindBy(xpath = "(//td[.='Emp Id']/..//td[3])[2]")
    private WebElement empIdTwo;

@FindBy(xpath = "(//td[.='Emp Id']/..//td[3])[3]")
    private WebElement empIdThree;

@FindBy(xpath = "(//td[.='Mobile']/..//td[3])[1]")
    private WebElement empMobileOne;

@FindBy(xpath = "(//td[.='Mobile']/..//td[3])[2]")
    private WebElement empMobileTwo;

@FindBy(xpath = "(//td[.='Mobile']/..//td[3])[3]")
    private WebElement empMobileThree;

    @FindBy(xpath = "(//td[.='Scheduled Time']/..//td[3])[1]")
    private WebElement empScheduledTimeOne;

     @FindBy(xpath = "(//td[.='Scheduled Time']/..//td[3])[2]")
    private WebElement empScheduledTimeTwo;

     @FindBy(xpath = "(//td[.='Scheduled Time']/..//td[3])[3]")
    private WebElement empScheduledTimeThree;



@FindBy(xpath = "(//td[.='CheckIn Time']/..//td[3])[1]")
    private WebElement empCheckTimeOne;

@FindBy(xpath = "(//td[.='CheckIn Time']/..//td[3])[2]")
    private WebElement empCheckTimeTwo;

@FindBy(xpath = "(//td[.='CheckIn Time']/..//td[3])[3]")
    private WebElement empCheckTimeThree;

@FindBy(xpath = "(//td[.='CheckOut Time']/..//td[3])[1]")
    private WebElement empCheckOutOne;

@FindBy(xpath = "(//td[.='CheckOut Time']/..//td[3])[2]")
    private WebElement empCheckOutTwo;

@FindBy(xpath = "(//td[.='CheckOut Time']/..//td[3])[3]")
    private WebElement empCheckOutThree;

@FindBy(xpath = "//a[.=' DRIVER DETAILS ']")
    private WebElement driverDetailsClick;

@FindBy(xpath = "//td[.='Driver Name']/..//td[3]")
    private WebElement indriverNeme;

@FindBy(xpath = "//td[.='Gender']/..//td[3]")
    private WebElement inGender;

@FindBy(xpath = "//td[.='Phone']/..//td[3]")
    private WebElement inPhone;

@FindBy(xpath = "//td[.='E-Mail']/..//td[3]")
    private WebElement inEmail;

@FindBy(xpath = "//td[.='Address']/..//td[3]")
    private WebElement inAdress;

@FindBy(xpath = "//a[.=' VEHICLE DETAILS ']")
    private WebElement ClickvehiclesDetails;

@FindBy(xpath = "//span[.='TRIP LIST']//..//i")
    private WebElement tripListArrow;

@FindBy(xpath = "//td[.='Registration Number']/..//td[3]")
    private WebElement inRegestrationNumber;

@FindBy(xpath = "//td[.='Vehicle Model']/..//td[3]")
    private WebElement inVehicleModel;

@FindBy(xpath = "//a[.='EMPLOYEES']")
    private WebElement outClickEmployee;

@FindBy(xpath = "//a[@id='driver-tab']")
    private WebElement outClickDriver;

@FindBy(xpath = "//a[@id='vehicle-tab']")
    private WebElement outClickVehicle;

@FindBy(xpath = "//button[@class='more-option']")
    private WebElement clickOnMoreOption;

@FindBy(xpath = "//i[@class='fa fa-upload fa-2 mr-2']")
    private WebElement uploadTrips;

@FindBy(xpath = "//i[@class='fa fa-download fa-2 mr-2']")
    private WebElement downLoadTrips;



@FindBy(xpath = "//td[@class='cursor_ptr text-danger']")
    private WebElement clickTripId;

    @FindBy(xpath = "//div[@id='dashboard_wrapper']//div[@class='col-md-3 col-lg-3']")
    private List<WebElement> allFleets;

    @FindBy(xpath = "//div[.='ARYA']")
    private WebElement ARYA;

    @FindBy(xpath = "((//div[@id='navbarNavDropdown'])[2]/..//ul)[2]//li")
    private WebElement ARYAin;

    @FindBy(xpath = "(//input[@name='date'])[1]")
    private WebElement startDate;

    @FindBy(xpath = "(//input[@id='date'])[2]")
    private WebElement endDate;

    @FindBy(xpath = "//button[text()='FILTER']")
        private WebElement filter;

   @FindBy(xpath = "//button[.='DONE']/..//h6")
        private WebElement popUpHeading;

    @FindBy(xpath = "//button[.='DONE']")
        private WebElement done;


     @FindBy(xpath = "//div[@class='col-md-4']//label//div[@class='mat-checkbox-background']")
        private WebElement allChecks;

    @FindBy(xpath = "//span[@class='mat-checkbox-label']")
            private List<WebElement> allChecksText;

    @FindBy(xpath = "//td[3]")
            private WebElement tripType;

     @FindBy(xpath = "//td[3]")
            private WebElement tripTypeAdhoc;



    @FindBy(xpath = "//td[4]")
            private WebElement tripStartTime;

    @FindBy(xpath = "//td[5]")
            private WebElement noOfEmployee;

    @FindBy(xpath = "//td[6]")
    private WebElement vehicleAssigned;

     @FindBy(xpath = "//td[6]//span")
    private WebElement vehicleAssignedd;



 @FindBy(xpath = "//td[7]")
    private WebElement vehicleAssignedAdhoc;

    @FindBy(xpath = "//td[7]")
    private WebElement driverName;

    @FindBy(xpath = "//td[8]")
    private WebElement driverNameAdhoc;

     @FindBy(xpath = "//tbody//td[@class='nodata']//p")
    private WebElement getNoData;



    @FindBy(xpath = "//td[8]")
    private WebElement driverPhone;

 @FindBy(xpath = "//td[9]")
    private WebElement driverPhoneAdhoc;


    @FindBy(xpath = "//td[9]")
    private WebElement tripStatus;

    @FindBy(xpath = "//td[10]")
    private WebElement tripStatusAdhoc;

     @FindBy(xpath = "//td[5]")
    private WebElement employeeName;



 @FindBy(xpath = "//a[.=' TRIP DETAILS ']")
    private WebElement clickingOnTripDetails;


    @FindBy(xpath = "//td[5]//i")
    private WebElement dropDown;

    @FindBy(xpath = "//div[contains(text(),'TRIP ')]")
    private WebElement headingId;

    @FindBy(xpath = "//span[contains(.,'Completed')]/..//div[@class='mat-checkbox-inner-container']")
            private WebElement Completed;

    @FindBy(xpath = "//span[contains(.,'Cancelled')]/..//div[@class='mat-checkbox-inner-container']")
            private WebElement Cancelled;

    @FindBy(xpath = "//span[contains(.,'Ongoing')]/..//div[@class='mat-checkbox-inner-container']")
    private WebElement Ongoing;

    @FindBy(xpath = "//span[contains(.,'Assgined')]/..//div[@class='mat-checkbox-inner-container']")
    private WebElement Assgined;

     @FindBy(xpath = "//span[contains(.,'Geo fencing')]/..//div[@class='mat-checkbox-inner-container']")
    private WebElement GeoFencing;



    @FindBy(xpath = "//td[3]")
    private List<WebElement> getStatus;



    public inTrips(ExtentTest t1) { super(t1); }
    public static inTrips init(ExtentTest t1){return new inTrips(t1);}

    public ArrayList<String> getStatus()
    {

        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:getStatus)
        {
            String names = name.getText();
//           System.out.println(names);
            nm.add(names);
        }
        System.out.println("The actual table headings "+nm);


        return nm;
    }

    public boolean assignedIs()
    {
        boolean is;
        is=Assgined.isSelected();
        return is;
    }

    public ArrayList<String> allChecksText()
    {

        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:allChecksText)
        {
            String names = name.getText();
//           System.out.println(names);
            nm.add(names);
        }
        System.out.println("The actual table headings "+nm);


        return nm;
    }

    public inTrips TRIPS()
    {
        clickOnElement(TRIPS,"clikcing on trips");
        return this;
    }
    public inTrips clickingOnTripDetails()
    {
        clickOnElement(clickingOnTripDetails,"clikcing on clickingOnTripDetails");
        return this;
    }
public inTrips tripListArrow()
    {
        clickOnElement(tripListArrow,"clikcing on clickingOnTripDetails");
        return this;
    }

    public inTrips Completed()
    {
        clickOnElement(Completed,"clikcing on Completed");
        return this;
    }

    public inTrips Cancelled()
    {
        clickOnElement(Cancelled,"clikcing on Cancelled");
        return this;
    }

    public inTrips Ongoing()
    {
        clickOnElement(Ongoing,"clikcing on Ongoing");
        return this;
    }

    public inTrips Assgined()
    {
        clickOnElement(Assgined,"clikcing on Assgined");
        return this;
    }
     public inTrips GeoFencing()
    {
        clickOnElement(GeoFencing,"clikcing on GeoFencing");
        return this;
    }


    public inTrips allChecks()
    {
        clickOnElement(allChecks,"clikcing on allChecks");
        return this;
    }

    public inTrips done()
    {
        clickOnElement(done,"clikcing on done");
        return this;
    }

    public inTrips filter()
    {
        clickOnElement(filter,"clikcing on filter");
        return this;
    }

    public inTrips ARYA()
    {
        clickOnElement(ARYA,"clikcing on ME_DEFAULT");
        return this;
    }

    public int allFleets()
    {
      int allFleet= allFleets.size();
      return allFleet;
    }

    public String getTripId()
    {
        String id = getTripId.getText();
        return id;
    }

    public String headingStatus()
    {
        String id = headingStatus.getText();
        return id;
    }

public String insideTripId()
    {
        String id = insideTripId.getText();
        return id;
    }

public String insideTripScheduled()
    {
        String id = insideTripScheduled.getText();
        return id;
    }

public String insidetripStartTime()
    {
        String id = insidetripStartTime.getText();
        return id;
    }

public String insidetripEndTime()
    {
        String id = insidetripEndTime.getText();
        return id;
    }

public String insideTripType()
    {
        String id = insideTripType.getText();
        return id;
    }


public String insideDropPoints()
    {
        String id = insideDropPoints.getText();
        return id;
    }


public String insideSource()
    {
        String id = insideSource.getText();
        return id;
    }


public String employeeNameOne()
    {
        String id = employeeNameOne.getText();
        return id;
    }

public String employeeNameTwo()
    {
        String id = employeeNameTwo.getText();
        return id;
    }

public String employeeNameThree()
    {
        String id = employeeNameThree.getText();
        return id;
    }


public String empIdOne()
    {
        String id = empIdOne.getText();
        return id;
    }

public String empIdTwo()
    {
        String id = empIdTwo.getText();
        return id;
    }

public String empIdThree()
    {
        String id = empIdThree.getText();
        return id;
    }

public String empMobileOne()
    {
        String id = empMobileOne.getText();
        return id;
    }

public String empMobileTwo()
    {
        String id = empMobileTwo.getText();
        return id;
    }

public String empMobileThree()
    {
        String id = empMobileThree.getText();
        return id;
    }


    public String empScheduledTimeOne()
    {
        String id = empScheduledTimeOne.getText();
        return id;
    }

      public String empScheduledTimeTwo()
    {
        String id = empScheduledTimeTwo.getText();
        return id;
    }

      public String empScheduledTimeThree()
    {
        String id = empScheduledTimeThree.getText();
        return id;
    }



public String empCheckTimeOne()
    {
        String id = empCheckTimeOne.getText();
        return id;
    }

   public String empCheckTimeTwo()
    {
        String id = empCheckTimeTwo.getText();
        return id;
    }

   public String empCheckTimeThree()
    {
        String id = empCheckTimeThree.getText();
        return id;
    }

    public String empCheckOutOne()
    {
        String id = empCheckOutOne.getText();
        return id;
    }

     public String empCheckOutTwo()
    {
        String id = empCheckOutTwo.getText();
        return id;
    }

     public String empCheckOutThree()
    {
        String id = empCheckOutThree.getText();
        return id;
    }

    public String indriverNeme()
    {
        String id = indriverNeme.getText();
        return id;
    }

    public String inGender()
    {
        String id = inGender.getText();
        return id;
    }

public String inPhone()
    {
        String id = inPhone.getText();
        return id;
    }

public String inEmail()
    {
        String id = inEmail.getText();
        return id;
    }


public String inAdress()
    {
        String id = inAdress.getText();
        return id;
    }


public String inRegestrationNumber()
    {
        String id = inRegestrationNumber.getText();
        return id;
    }


    public String inVehicleModel()
    {
        String id = inVehicleModel.getText();
        return id;
    }

    public String headingId()
    {
        String id = headingId.getText();
        return id;
    }

    public String tripType()
    {
        String id = tripType.getText();
        return id;
    }

    public String tripTypeAdhoc()
    {
        String id = tripTypeAdhoc.getText();
        return id;
    }

    public String tripStartTime()
    {
        String id = tripStartTime.getText();
        return id;
    }



    public String noOfEmployee()
    {
        String id = noOfEmployee.getText();
        return id;
    }

    public String vehicleAssigned()
    {
        String id = vehicleAssigned.getText();
        return id;
    }

 public String vehicleAssignedAdhoc()
    {
        String id = vehicleAssignedAdhoc.getText();
        return id;
    }


    public inTrips vehicleAssignedClick()
    {

        clickOnElement(vehicleAssignedd,"click");
        return this;
    }


    public inTrips downLoadTrips()
    {

        clickOnElement(downLoadTrips,"click");
        return this;
    }

    public inTrips uploadTrips()
    {

        clickOnElement(uploadTrips,"click");
        return this;
    }

public inTrips clickOnMoreOption()
    {

        clickOnElement(clickOnMoreOption,"click");
        return this;
    }

public inTrips outClickVehicle()
    {

        clickOnElement(outClickVehicle,"click");
        return this;
    }

public inTrips outClickDriver()
    {

        clickOnElement(outClickDriver,"click");
        return this;
    }

public inTrips outClickEmployee()
    {

        clickOnElement(outClickEmployee,"click");
        return this;
    }

public inTrips ClickvehiclesDetails()
    {

        clickOnElement(ClickvehiclesDetails,"click");
        return this;
    }

public inTrips clickOnEmployeeDropdown()
    {

        clickOnElement(clickOnEmployeeDropdown,"click");
        return this;
    }

    public int insideCOuntsOfEmployeeHeader()
    {
       int size= insideCOuntsOfEmployeeHeader.size();
       return size;
    }

    public String getNoData()
    {
        String id = getNoData.getText();
        return id;
    }


    public String driverName()
    {
        String id = driverName.getText();
        return id;
    }

    public String driverNameAdhoc()
    {
        String id = driverNameAdhoc.getText();
        return id;
    }


    public inTrips driverNameClick()
    {

        clickOnElement(driverName,"click");
        return this;
    }

    public String driverPhone()
    {
        String id = driverPhone.getText();
        return id;
    }
    public String driverPhoneAdhoc()
    {
        String id = driverPhoneAdhoc.getText();
        return id;
    }

    public String tripStatus()
    {
        String id = tripStatus.getText();
        return id;
    }

     public String tripStatusAdhoc()
    {
        String id = tripStatusAdhoc.getText();
        return id;
    }

 public String employeeName()
    {
        String id = employeeName.getText();
        return id;
    }



    public inTrips dropDown()
    {

        clickOnElement(dropDown,"click");
        return this;
    }

    public inTrips clcikTripId()
    {
       clickOnElement(clickTripId,"clicking");
       return this;
    }

    public String ARYAin()
    {
        String ARYAinn=ARYAin.getText();
        return ARYAinn;
    }

    public String popUpHeading()
    {
        String ARYAinn=popUpHeading.getText();
        return ARYAinn;
    }

    public inTrips startDate(String s1)
    {
        startDate.sendKeys(s1);
        return this;

    }

    public inTrips endDate(String s1)
    {
        endDate.sendKeys(s1);
        return this;

    }

    public String startDateValue()
    {
        String date = startDate.getAttribute("value");
        return date;

    }

    public String endDateValue()
    {
        String date = endDate.getAttribute("value");
        return date;

    }






}
