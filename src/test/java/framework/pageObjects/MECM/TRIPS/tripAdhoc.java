package framework.pageObjects.MECM.TRIPS;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class tripAdhoc extends PageInit
{

    @FindBy(xpath = "//span[.='TRIP Adhoc']")
    private WebElement click;

     @FindBy(xpath = "//select//option")
    private List<WebElement> dropDowValues;

     @FindBy(xpath = "//div[@class='approval_card_header']")
    private List<WebElement> cardCount;

  @FindBy(xpath = "//div[@class='approval_card_header']")
    private WebElement cardClick;

  @FindBy(xpath = "//div[@class='title-container']/following-sibling::div//div")
    private List<WebElement> cardStatus;

 @FindBy(xpath = "//div[@class='title-container']//div[@class='title']")
    private WebElement employeeName;

 @FindBy(xpath = "//div[@class='title-container']//div[@class='sub-title']")
    private WebElement employeeId;

@FindBy(xpath = "//div[@class='approval_id']//div/..//div[2]")
    private WebElement tripId;

@FindBy(xpath = "//div[@class='approval_id']//div/..//div[1]")
    private WebElement tripTime;

@FindBy(xpath = "//div[@class='source']")
    private WebElement tripSource;

@FindBy(xpath = "//div[@class='destination']")
    private WebElement tripDestination;

@FindBy(xpath = "//p[.=' Estimated Distance ']/..//p[2]")
    private WebElement tripDistance;

@FindBy(xpath = "//div[@class='modal-header']")
    private WebElement inTripId;

@FindBy(xpath = "//td[.=' Name']/..//td[3]")
    private WebElement inName;

@FindBy(xpath = "//td[.='Employee ID']/..//td[3]")
    private WebElement inId;

@FindBy(xpath = "//td[.='Source']/..//td[3]")
    private WebElement inSource;

@FindBy(xpath = "//td[.='Destination']/..//td[3]")
    private WebElement inDestination;

@FindBy(xpath = "//td[.='Purpose of Travel']/..//td[3]")
    private WebElement intripPurpose;

@FindBy(xpath = "//td[.='Trip Type']/..//td[3]")
    private WebElement intripType;

@FindBy(xpath = "//td[.='Start Time']/..//td[3]")
    private WebElement intripStartTime;

@FindBy(xpath = "//td[.='Estimated Distance']/..//td[3]")
    private WebElement intripDistance;

@FindBy(xpath = "//button[@aria-label='Close']//span")
    private WebElement close;

@FindBy(xpath = "//a[.=' TRIP DETAILS ']")
    private WebElement tripDetailsClick;




@FindBy(xpath = "//span[.='APPROVED']")
    private WebElement approvedText;

@FindBy(xpath = "//a[.=' ASSIGN VEHICLE ']")
    private WebElement assignVehiclesClick;

@FindBy(xpath = "//table[@class='responsive-table table table-striped']//th")
    private List<WebElement> assignTable;

@FindBy(xpath = "//td//input[@type='radio']")
    private WebElement assignRadioSelectVehicle;
//(//td[contains(.,'Available')]//..//td)[1]//input

@FindBy(xpath = "//*[contains(text(),'Other Vehicles')]//..//input[@type='radio']")
    private WebElement otherVehicleRadio;

@FindBy(xpath = "//*[@value='vehicle_unavailable']//label//div")
    private WebElement vehicleUnavailableRadio;

@FindBy(xpath = "//td[.=' Agency Name ']/..//td[3]//input")
    private WebElement agencyName;

@FindBy(xpath = "//td[.='Vehicle Type  ']/..//td[3]//input")
    private WebElement agencyVehicle;

@FindBy(xpath = "//td[contains(text(),'Registration Number')]/..//td[3]//input")
    private WebElement agencyRegNo;

@FindBy(xpath = "//td[contains(text(),'Driver Name')]/..//td[3]//input")
    private WebElement agencyDriverName;

@FindBy(xpath = "//td[contains(text(),'Driver Mobile')]/..//td[3]//input")
    private WebElement agencyDriverMobile;

@FindBy(xpath = "//td[contains(text(),'Trip Duration(in Hours)')]/..//td[3]//input")
    private WebElement agencyTripDuration;

@FindBy(xpath = "//button[.='CANCEL']")
    private WebElement agencyCancel;

@FindBy(xpath = "//button[.='ASSIGN VEHICLE']")
    private WebElement agencyAssignButton;

@FindBy(xpath = "//textarea[@id='unavailable_comments']")
    private WebElement unavailableComments;

@FindBy(xpath = "//button[.='SUBMIT']")
    private WebElement unavailableSubmit;

@FindBy(xpath = "//button[.='CANCEL']")
    private WebElement cancel;



//@FindBy(xpath = "//textarea[@id='unavailable_comments']")
//    private WebElement unavailableComments;






    public tripAdhoc(ExtentTest t1) { super(t1); }
    public static tripAdhoc init(ExtentTest t1){return new tripAdhoc(t1);}

    public tripAdhoc tripAdhoc()
    {
        clickOnElement(click,"clicking");
        return this;
    }

    public tripAdhoc tripDetailsClick ()
    {
        clickOnElement(tripDetailsClick ,"clicking");
        return this;
    }

     public tripAdhoc assignVehiclesClick ()
    {
        clickOnElement(assignVehiclesClick ,"clicking");
        return this;
    }

     public tripAdhoc assignRadioSelectVehicle ()
    {
        clickOnElement(assignRadioSelectVehicle ,"clicking");
        return this;
    }

     public tripAdhoc otherVehicleRadio ()
    {
        clickOnElement(otherVehicleRadio ,"clicking");
        return this;
    }

     public tripAdhoc vehicleUnavailableRadio ()
    {
        clickOnElement(vehicleUnavailableRadio ,"clicking");
        return this;
    }

    public tripAdhoc agencyCancel ()
    {
        clickOnElement(agencyCancel ,"clicking");
        return this;
    }

 public tripAdhoc agencyAssignButton ()
    {
        clickOnElement(agencyAssignButton ,"clicking");
        return this;
    }

    public boolean cancel()
    {
        boolean is=cancel.isEnabled();
        return is;
    }


 public tripAdhoc unavailableSubmit ()
    {
        clickOnElement(unavailableSubmit ,"clicking");
        return this;
    }

    public tripAdhoc clickOncard()
    {
        clickOnElement(cardClick,"clicking");
        return this;
    }


    public ArrayList<String> dropDownOption()
    {

        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:dropDowValues)
        {
            String names = name.getText();
//           System.out.println(names);
            nm.add(names);
        }
        System.out.println("The actual table headings "+nm);


        return nm;
    }

    public ArrayList<String> assignTable()
    {

        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:assignTable)
        {
            String names = name.getText();
//           System.out.println(names);
            nm.add(names);
        }
        System.out.println("The actual Values "+nm);


        return nm;
    }
    public int cardCount()
    {
        int i=cardCount.size();
        return i;
    }

    public ArrayList<String> cardStatus()
    {

        ArrayList<String> nm=new ArrayList<>();

        for(WebElement name:cardStatus)
        {
            String names = name.getText();
//           System.out.println(names);
            nm.add(names);
        }
        System.out.println("The actual table headings "+nm);


        return nm;
    }

    public String employeeName()
    {
        String name = employeeName.getText();
        return name;
    }

    public tripAdhoc agencyName(String send)
    {
       agencyName.sendKeys(send);
        return this;
    }
     public tripAdhoc agencyVehicle(String send)
    {
        agencyVehicle.sendKeys(send);
        return this;
    }
     public tripAdhoc agencyRegNo(String send)
    {
        agencyRegNo.sendKeys(send);
        return this;
    }
     public tripAdhoc agencyDriverName(String send)
    {
        agencyDriverName.sendKeys(send);
        return this;
    }
     public tripAdhoc agencyDriverMobile(String send)
    {
        agencyDriverMobile.sendKeys(send);
        return this;
    }
     public tripAdhoc agencyTripDuration(String send)
    {
        agencyTripDuration.sendKeys(send);
        return this;
    }

 public tripAdhoc unavailableComments(String send)
    {
        unavailableComments.sendKeys(send);
        return this;
    }


public String approvedText()
    {
        String name = approvedText.getText();
        return name;
    }

 public String employeeId()
    {
        String name = employeeId.getText();
        return name;
    }

public String tripIdd()
    {
        String name = tripId.getText();
        return name;
    }

public String tripTime()
    {
        String name = tripTime.getText();
        return name;
    }

public String tripSource()
    {
        String name = tripSource.getText();
        return name;
    }

public String tripDestination()
    {
        String name = tripDestination.getText();
        return name;
    }

public String inTripId()
    {
        String name = inTripId.getText();
        return name;
    }

    public String inName()
    {
        String name = inName.getText();
        return name;
    }

    public String inId()
    {
        String name = inId.getText();
        return name;
    }

    public String inSource()
    {
        String name = inSource.getText();
        return name;
    }

    public String inDestination()
    {
        String name = inDestination.getText();
        return name;
    }

    public String tripDistance()
    {
        String name = tripDistance.getText();
        return name;
    }

    public String intripPurpose()
    {
        String name = intripPurpose.getText();
        return name;
    }

 public String intripType()
    {
        String name = intripType.getText();
        return name;
    }

public String intripStartTime()
    {
        String name = intripStartTime.getText();
        return name;
    }

public String intripDistance()
    {
        String name = intripDistance.getText();
        return name;
    }

public String close()
    {
        String name = close.getText();
        return name;
    }







}
