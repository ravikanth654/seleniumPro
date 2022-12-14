package framework.pageObjects.MECM.MAPS;

import com.aventstack.extentreports.ExtentTest;
import com.opera.core.systems.scope.protos.EsdbgProtos;
import framework.pageObjects.MECM.FLEETS.fleetDriverPage;
import framework.pageObjects.PageInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class heatMap_PathTracking_Geofencing extends PageInit
{

    @FindBy(xpath = "//span[.='HEAT MAP']")
    private WebElement clickingHeatMap;

  @FindBy(xpath = "//button[contains(.,'MAPS')]")
    private WebElement maps;

    @FindBy(xpath = "//input[@id='startDate']")
    private WebElement startDate;

    @FindBy(xpath = "//input[@id='startTime']")
    private WebElement startTime;

    @FindBy(xpath = "//input[@id='endDate']")
    private WebElement endDate;

    @FindBy(xpath = "//input[@id='endTime']")
    private WebElement endTime;

    @FindBy(xpath = "//button[.='Track']")
    private WebElement Track;

    @FindBy(xpath = "//label[@for='error_message']")
    private WebElement error_message;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[2]")
    private WebElement mapDropdown;

     @FindBy(xpath = "//input[@name='search']")
     private WebElement search;

    @FindBy(xpath = "//input[@name='vinNo']")
    private WebElement vinNo;

    @FindBy(xpath = "//label[.='Select Date']")
    private WebElement selectDateVisible;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;

    @FindBy(xpath = "(//span[.='PATH TRACKING'])[2]")
    private WebElement TRACKING;

    @FindBy(xpath = "//span[.='GEO FENCING']")
    private WebElement FENCING;

    @FindBy(xpath = "//button[.='CREATE GEOFENCE']")
    private WebElement CreateFENCING;

    @FindBy(xpath = "//div[@role='tab']//i")
    private WebElement dropDownLink;

    @FindBy(xpath = "//i[@class='fa fa-pencil cursor_ptr p-2']")
    private WebElement pencil;

    @FindBy(xpath = "//i[@class='fa fa-trash cursor_ptr']")
    private WebElement trash;

    @FindBy(xpath = "//button[.='View']")
    private WebElement View;

    @FindBy(xpath = "//div[@class='ui-select-match']")
    private WebElement clickingOnsearch;

    @FindBy(xpath = "//li[@role='menuitem']")
    private List<WebElement> menuitem;

    @FindBy(xpath = "//input[@name='search']")
    private WebElement fenceSearch;

    @FindBy(xpath = "//li[@class='currentlocation']")
    private WebElement currentlocation;

    @FindBy(xpath = "//li[@class='heading heading-recent']//..//li[3]")
    private WebElement selectAdress;

    @FindBy(xpath = "//input[@id='fenceName']")
    private WebElement fenceName;

    @FindBy(xpath = "(//input[@id='fenceName']//../..//input)[2]")
    private WebElement fenceNameDisable;

    @FindBy(xpath = "//button[@id='dropdownMenuButton']")
    private WebElement dropdownMenuButton;

    @FindBy(xpath = "//button[@id='dropdownMenuButton']//..//div//a[.='Entry']")
    private WebElement dropdownMenuEntry;

    @FindBy(xpath = "//button[@id='dropdownMenuButton']//..//div//a[.='Exit']")
    private WebElement dropdownMenuExit;

    @FindBy(xpath = "//button[@id='dropdownMenuButton']//..//div//a")
    private List<WebElement> dropdownMenuButtonValues;

    @FindBy(xpath = "//li[@class='pure-checkbox']")
    private List<WebElement> pure_checkbox;

    @FindBy(xpath = "//li[@class='pure-checkbox'][1]")
    private WebElement pure_checkboxOne;

    @FindBy(xpath = "(//*[text()='Select Sub Fleets'])[2]")
    private WebElement Select_Fleets;

    @FindBy(xpath = "//div[@class='pure-checkbox select-all']")
    private WebElement Select_all;

    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    private WebElement Select_search;

     @FindBy(xpath = "//input[@id='expiresin']")
    private WebElement expires_in;

     @FindBy(xpath = "//input[@value='CREATE']")
    private WebElement CREATE;

    @FindBy(xpath = "//input[@value='CANCEL']")
    private WebElement CANCEL;

     @FindBy(xpath = "//span[.=' TOTAL VIOLATIONS']//..//span[2]")
    private WebElement VIOLATIONS;
    @FindBy(xpath = "//div[@id='scroll-style']")
    private WebElement scroller_map;





    public heatMap_PathTracking_Geofencing(ExtentTest t1) { super(t1); }
    public static heatMap_PathTracking_Geofencing init(ExtentTest t1){return new heatMap_PathTracking_Geofencing(t1);}


    public heatMap_PathTracking_Geofencing Select_Fleets()
    {
        clickOnElement(Select_Fleets,"Select_Fleets Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing selectAdress()
    {
        clickOnElement(selectAdress,"selectAdress Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing pure_checkboxOne()
    {
        clickOnElement(pure_checkboxOne,"Select_Fleets Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing maps()
    {
        clickOnElement(maps,"Select_Fleets Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing CANCEL()
    {
        clickOnElement(CANCEL,"Select_Fleets Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing CREATE()
    {
        clickOnElement(CREATE,"CREATE Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing Select_all()
    {
        clickOnElement(Select_all,"Select_all Button");
        return this;
    }
    public heatMap_PathTracking_Geofencing dropdownMenuEntry()
    {
        clickOnElement(dropdownMenuEntry,"dropdownMenuEntry Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing dropdownMenuExit()
    {
        clickOnElement(dropdownMenuExit,"dropdownMenuExit Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing dropdownMenuButton()
    {
        clickOnElement(dropdownMenuButton,"dropdownMenuButton Button");
        return this;
    }
    public heatMap_PathTracking_Geofencing clickingOnsearch()
    {
        clickOnElement(clickingOnsearch,"clickingHeatMap Button");
        return this;
    }

    public boolean searchDisbled()
    {
        boolean is = submit.isEnabled();
        return is;
    }

    public heatMap_PathTracking_Geofencing currentlocation()
    {
        clickOnElement(currentlocation,"clickingHeatMap Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing clickingOnfenceSearch()
    {
        clickOnElement(fenceSearch,"clickingHeatMap Button");
        return this;
    }

    public ArrayList<String> menuitem()
    {
        ArrayList<String> nm=new ArrayList<>();
        for(WebElement v: menuitem)
        {
            String values=v.getText();
            nm.add(values);
        }
        System.out.println("the values "+nm);
        return nm;
    }

public ArrayList<String> dropdownMenuButtonValues()
    {
        ArrayList<String> nm=new ArrayList<>();
        for(WebElement v: dropdownMenuButtonValues)
        {
            String values=v.getText();
            nm.add(values);
        }
        System.out.println("the values "+nm);
        return nm;
    }


    public heatMap_PathTracking_Geofencing clickingHeatMap()
    {
        clickOnElement(clickingHeatMap,"clickingHeatMap Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing View()
    {
        clickOnElement(View,"View Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing trash()
    {
        clickOnElement(trash,"clickingHeatMap Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing pencil()
    {
        clickOnElement(pencil,"pencil Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing dropDownLink()
    {
        clickOnElement(dropDownLink,"dropDownLink Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing CreateFENCING()
    {
        clickOnElement(CreateFENCING,"CreateFENCING Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing FENCING()
    {
        clickOnElement(FENCING,"FENCING Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing submit()
    {
        clickOnElement(submit,"submit Button");
        return this;
    }

    public heatMap_PathTracking_Geofencing TRACKING()
    {
        clickOnElement(TRACKING,"TRACKING Button");
        return this;
    }

    public String startDate(String m1)
    {
        startDate.sendKeys(m1);
        return m1;
    }

    public String fenceName(String m1)
    {
        fenceName.sendKeys(m1);
        return m1;
    }


    public String expires_in(String m1)
    {
        expires_in.sendKeys(m1);
        return m1;
    }



    public String sendTofenceSearch(String m1)
    {
        fenceSearch.sendKeys(m1);
        return m1;
    }

    public heatMap_PathTracking_Geofencing fenceSearchClick()
    {

        clickOnElement(fenceSearch,"fenceSearch Button");
        return this;
    }

    public String startTime(String m1)
    {
        startTime.sendKeys(m1);
        return m1;
    }

    public String endDate(String m1)
    {
        endDate.sendKeys(m1);
        return m1;
    }

    public String Select_search(String m1)
    {
        Select_search.sendKeys(m1);
        return m1;
    }

    public String endTime(String m1)
    {
        endTime.sendKeys(m1);
        return m1;
    }

     public String search(String m1)
    {
        search.sendKeys(m1);
        return m1;
    }
    public String vinNo(String m1)
    {
        vinNo.sendKeys(m1);
        return m1;
    }

    public heatMap_PathTracking_Geofencing Track()
    {
        clickOnElement(Track,"Fleet Button");
        return this;
    }

    public boolean TrackDisbled()
    {
        boolean is = Track.isEnabled();
        return is;
    }

    public boolean selectDateVisible()
    {
        boolean is = selectDateVisible.isDisplayed();
        return is;
    }

    public heatMap_PathTracking_Geofencing mapDropdown()
    {
        clickOnElement(mapDropdown,"Fleet Button");
        return this;
    }

    public String error_message()
    {
        String s = error_message.getText();
        return s;
    }

    public String VIOLATIONS()
    {
        String s = VIOLATIONS.getText();
        return s;
    }

    public String getplaceHolder()
    {
        String value = vinNo.getAttribute("placeholder");
        return value;
    }
public heatMap_PathTracking_Geofencing  scroll()
{
     WebElement scr= driver.findElement(By.cssSelector("overflow-y: scroll;overflow-x: hidden"));
     scr.click();
     return this;
}
}



