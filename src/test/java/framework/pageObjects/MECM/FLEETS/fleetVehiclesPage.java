package framework.pageObjects.MECM.FLEETS;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class fleetVehiclesPage extends PageInit
{
        @FindBy(xpath = "//span[.='VEHICLES']")
        private WebElement clickVehicle;

        @FindBy(xpath = "//div[@class='metric-card']//span")
        private WebElement total;

        @FindBy(xpath = "//label[.='Page size ']//..//select")
        private WebElement dropdown;

        @FindBy(xpath ="//input[@type='search']")
        private WebElement srch;

        @FindBy(xpath = "//tr[1]//td[2]")
        private WebElement firstRowLicencePlate;

        @FindBy(xpath = "//tr[1]//td[3]")
        private WebElement getfirstRowVin;

        @FindBy(xpath = "//a[@class='btn search-btn']")
        private WebElement srchclick;

        @FindBy(xpath = "//tr[2]//td[3]")
        private WebElement secondRowVin;

        @FindBy(xpath = "//thead//th")
        private List<WebElement> tblHeading;

         @FindBy(xpath = "//thead/..//tr")
        private List<WebElement> tableRow;

        @FindBy(xpath = "//button[.='EXPORT']")
        private WebElement exp;

        @FindBy(xpath = "//tr[2]//td[2]")
        private WebElement rw;

       @FindBy(xpath = "//tr[1]//td[2]")
       private WebElement rwOne;

       @FindBy(xpath = "(//span[@title='eVerito']/../../td)[2]")
       private WebElement clcikOnEverito;

    @FindBy(xpath = "(//span[@title='e2oPlus']/../../td)[2]")
    private WebElement clickone2o;

       @FindBy(xpath = "//div[@class='vehicle-image mb-4']//img")
       private WebElement getImageModel;

       @FindBy(xpath = "(//div[.='AIR CONDITIONING']/..//div)[3]")
       private WebElement detailAC;

       @FindBy(xpath = "(//div[.='STATE OF CHARGE (SOC)']/..//div)[3]")
       private WebElement detailSOS;

        @FindBy(xpath = "//h5[contains(.,'OVERVIEW')]")
        private WebElement over;

        @FindBy(xpath = "//button[contains(.,'Back')]")
        private WebElement clickback;

        @FindBy(xpath = "//tr[2]//td[3]")
        private WebElement rowvin;

        @FindBy(xpath = "//tr[2]//td[4]")
        private WebElement model;

        @FindBy(xpath = "//tr[1]//td[8]")
        private WebElement getAcStatus;

        @FindBy(xpath = "//tr[1]//td[6]")
        private WebElement getSOSStatus;

        @FindBy(xpath = "//tr[2]//td[2]")
        private WebElement regNum;

        @FindBy(xpath = "//tr[2]//td[6]")
        private WebElement color;

        @FindBy(xpath = "//tr[2]//td[10]")
        private WebElement lastconnect;

        @FindBy(xpath = "//tr[2]//td[12]")
        private WebElement actions;

        @FindBy(xpath = "//input[@placeholder='Registration Number']")
        private WebElement inregNum;

        @FindBy(xpath = "//button[contains(.,'Back')]")
        private WebElement back;

        @FindBy(xpath = "//td[.='VEHICLE MODEL']//..//td[3]")
        private WebElement inModel;

        @FindBy(xpath = "//td[.='REG.NUMBER']//..//td[3]")
        private WebElement inReg;

        @FindBy(xpath = "//td[.='VIN']//..//td[3]")
        private WebElement inVin;

        @FindBy(xpath = "//td[.='CURRENT LOCATION']//..//td[3]")
        private WebElement inLoc;

        @FindBy(xpath = "//td[.='Last Connected']//..//td[3]")
        private WebElement inLast;

        @FindBy(xpath = "//div[@class='vehicle-image mb-4']//img")
        private WebElement incolor;

        @FindBy(xpath = "//p[contains(text(),'Entries')]")
        private WebElement entry;

        @FindBy(xpath = "//*[@id='dashboard_wrapper']/section[2]/div/div/app-data-table/div/div[3]/table/tbody/tr[1]/td[1]/..//td[2]")
        private WebElement trrow;

        @FindBy(xpath = "//input[@type='search']")
        private WebElement input;

        @FindBy(xpath = "//input[@type='search']")
        private WebElement srch2;

        @FindBy(xpath = "//tbody//tr[1]//td[2]")
        private  WebElement s2;

    @FindBy(xpath = "//i[@class='fa fa-pencil fa-2 cursor_ptr']")
    private WebElement edit;

    @FindBy(xpath = "//span[@title='eVerito']/../..//td[11]/i")
    private WebElement editEverito;

    @FindBy(xpath = " //span[@title='e2oPlus']//../..//td[11]/i")
    private WebElement edite2oPlus;

    @FindBy(xpath = "//tr[1]//td[3]")
    private WebElement vin;

    @FindBy(xpath = "//tr[1]//td[4]")
    private WebElement outModel;


    @FindBy(xpath = "//tr[1]/td[2]")
    private WebElement lp;

    @FindBy(xpath = " //tr[1]/td[5]")
    private WebElement ovv;

    @FindBy(xpath = " //tr[1]/td[6]")
    private WebElement ovc;

    @FindBy(xpath = "//div[@class='modal-header']")
    private WebElement getText;

   /* @FindBy(xpath = "//tr[1]//td[4]")
    private WebElement model;*/

    @FindBy(xpath = "//input[@placeholder='Vehicle Identification Number']")
    private WebElement vnum;

    @FindBy(xpath = "//input[@placeholder='Vehicle Model']")
    private WebElement vmodel;

    @FindBy(xpath = "//input[@placeholder='Vehicle Variant']")
    private WebElement vv;
/*

    @FindBy(xpath = "//input[@placeholder='Registration Number']")
    private WebElement regNum;
*/

    @FindBy(xpath = "//mat-select")
    private WebElement vcolor;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private WebElement selectcolor;

    @FindBy(xpath = "//button[.='Update']")
    private WebElement submit;

    @FindBy(xpath = "//button[.='Cancel']")
    private WebElement cancel;

    @FindBy(xpath = "//alert[.='vehicle updated successfully!']")
    private WebElement alrt;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement getVehicleEditAlert;

    @FindBy(xpath = " //mat-option[4]")
    private WebElement white;

    @FindBy(xpath = " //mat-option[2]")
    private WebElement red;

    @FindBy(xpath = " //mat-option[3]")
    private WebElement silver;

    @FindBy(xpath = " //mat-option[1]")
    private WebElement whiteone;

    @FindBy(xpath = " //div[@class='modal-header']")
    private WebElement modelHeader;





        public fleetVehiclesPage(ExtentTest t1) {
            super(t1);
        }
        public static framework.pageObjects.MECM.FLEETS.fleetVehiclesPage init(ExtentTest t1){return new framework.pageObjects.MECM.FLEETS.fleetVehiclesPage(t1);}


        public framework.pageObjects.MECM.FLEETS.fleetVehiclesPage clcikVehicl()
        {
            clickOnElement(clickVehicle,"Clicking on vehicles");
            return this;
        }

        public String ttl()
        {
            String str = total.getText();
            return str;
        }
        public int tableRow()
        {
            int count = tableRow.size();
            return count;
        }


        public String getRowtxt()
        {
            String str = trrow.getText();
            return str;
        }

    public String detailAC()
    {
        String str = detailAC.getText();
        return str;
    }

    public String detailSOS()
    {
        String str = detailSOS.getText();
        return str;
    }

        public fleetVehiclesPage clickDropdown()
        {
            clickOnElement(dropdown,"Clicking on vehicles");
            return this;
        }

        public fleetVehiclesPage backClicks()
        {
        clickOnElement(back,"Clicking on vehicles");
        return this;
        }

    public fleetVehiclesPage clickOn1stRow()
    {
        clickOnElement(rwOne,"Clicking on vehicles");
        return this;
    }

    public fleetVehiclesPage clcikOnEverito()
    {
        clickOnElement(clcikOnEverito,"Clicking on vehicles");
        return this;
    }

    public fleetVehiclesPage clickone2o()
    {
        clickOnElement(clickone2o,"Clicking on vehicles");
        return this;
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

        public framework.pageObjects.MECM.FLEETS.fleetVehiclesPage search_sendvalue(String s1)
        {
            srch.sendKeys(s1);
            return this;
        }

        public String getFirstRowLicencePlate()
        {
            String s1 = firstRowLicencePlate.getText();
            return s1;

        }

        public framework.pageObjects.MECM.FLEETS.fleetVehiclesPage Clears()
        {
            srch.clear();
            return this;
        }
        public framework.pageObjects.MECM.FLEETS.fleetVehiclesPage clickSearch()
        {
            clickOnElement(srchclick,"Clicking on search");
            return this;
        }

    public framework.pageObjects.MECM.FLEETS.fleetVehiclesPage clearSearch()
    {
       srch.clear();
        return this;
    }

        public String getsecondRowVin()
        {
            String s1 = secondRowVin.getText();
            return s1;

        }

   /* public String getImageModel()
    {

       // String s1 = getImageModel.getAttribute(src);
       // return s1;

    }*/

        public String getfirstRowVin()
        {
            String s1 = getfirstRowVin.getText();
            return s1;

        }

        public framework.pageObjects.MECM.FLEETS.fleetVehiclesPage input_click()
        {
            clickOnElement(input,"Clicking on search");
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

        public framework.pageObjects.MECM.FLEETS.fleetVehiclesPage Export()
        {
            clickOnElement(exp,"Clicking export");
            return this;
        }

        public framework.pageObjects.MECM.FLEETS.fleetVehiclesPage rowClick()
        {
            clickOnElement(rw,"clciking row");
            return this;
        }

        public String overvalue()
        {
            String txt = over.getText();
            return txt;
        }

    public String outModel()
    {
        String txt = outModel.getText();
        return txt;
    }

        public framework.pageObjects.MECM.FLEETS.fleetVehiclesPage backClick()
        {
            clickOnElement(clickback,"clciking back");
            return this;
        }

        public String rowvalue()
        {
            String txt = rowvin.getText();
            return txt;
        }

        public String model()
        {
            String txt = model.getText();
            return txt;
        }

    public String getAcStatus()
    {
        String txt = getAcStatus.getText();
        return txt;
    }

    public String getSOSStatus()
    {
        String txt = getSOSStatus.getText();
        return txt;
    }


    public String modelheader()
    {
        String txt = modelHeader.getText();
        return txt;
    }



        public String s2()
        {
            String txt = s2.getText();
            return txt;
        }


        public String regNo()
        {
            String txt = regNum.getText();
            return txt;
        }

        public String color()
        {
            String txt = color.getText();
            return txt;
        }

        public String lastconnect()
        {
            String txt = lastconnect.getText();
            return txt;
        }


        public String inModel()
        {
            String txt = inModel.getText();
            return txt;
        }

        public String inReg()
        {
            String txt = inReg.getText();
            return txt;
        }

        public String inVin()
        {
            String txt = inVin.getText();
            return txt;
        }

        public String inLastconnect()
        {
            String txt = inLast.getText();
            return txt;
        }

        public String getCarcolor()
        {
            String cc=incolor.getAttribute("src");
            return cc;
        }

        public String getAtri()
        {
            String cc=input.getAttribute("value");
            return cc;
        }

    public String getImageModel()
    {
        String cc=getImageModel.getAttribute("src");
        return cc;
    }

        public String totalrows()
        {
            String txt = entry.getText();
            return txt;
        }

    public fleetVehiclesPage edit()
    {
        clickOnElement(edit,"Clicking on edit");
        return this;
    }

    public fleetVehiclesPage editEverito()
    {
        clickOnElement(editEverito,"Clicking on edit");
        return this;
    }

    public fleetVehiclesPage edite2oPlus()
    {
        clickOnElement(edite2oPlus,"Clicking on edit");
        return this;
    }

    public String takeVin()
    {
        String vn = vin.getText();
        return vn;
    }

    public String takereg()
    {
        String vn = lp.getText();
        return vn;
    }

    public String takevarient()
    {
        String vn = ovv.getText();
        return vn;
    }

    public String takecolor()
    {
        String vn = ovc.getText();
        return vn;
    }

   /* public String model()
    {
        String vn = model.getText();
        return vn;
    }*/

    public String txt()
    {
        String vn = getText.getText();
        return vn;
    }

    public String vinv()
    {
        String vn = vnum.getAttribute("value");
        return vn;
    }

    public String vm()
    {
        String vn = vmodel.getAttribute("value");
        return vn;
    }

    public String vv()
    {
        String vn = vv.getAttribute("value");
        return vn;
    }

    public String rn()
    {
        String vn = regNum.getAttribute("value");
        return vn;
    }
    public String inregnum()
    {
        String vn = inregNum.getAttribute("value");
        return vn;
    }


    public String vc()
    {
        String vn = vcolor.getText();
        return vn;
    }

    public boolean vinis()
    {
        boolean s = vnum.isEnabled();
        return s;
    }

    public boolean modis()
    {
        boolean s = vmodel.isEnabled();
        return s;
    }

    public boolean varientis()
    {
        boolean s = vv.isEnabled();
        return s;
    }

    public fleetVehiclesPage clcikColor()
    {
        clickOnElement(vcolor,"Clicking on color");
        return this;
    }

    public fleetVehiclesPage clcikOnColor()
    {
        clickOnElement(selectcolor,"Clicking on color");
        return this;
    }

    public fleetVehiclesPage clcikOnSubmit()
    {
        clickOnElement(submit,"Clicking on color");
        return this;
    }

    public fleetVehiclesPage clcikOncancel()
    {
        clickOnElement(cancel,"Clicking on color");
        return this;
    }

    public boolean alert()
    {
        boolean s = alrt.isDisplayed();
        return s;
    }

    public String getAlert()
    {
        String vn = alrt.getText();
        return vn;
    }

    public String getVehicleEditAlert()
    {
        String vn = getVehicleEditAlert.getText();
        return vn;
    }

    public String getcolor()
    {
        String vn = vcolor.getText();
        return vn;
    }

    public fleetVehiclesPage clckWhite()
    {
        clickOnElement(white,"Clicking on color");
        return this;
    }

    public fleetVehiclesPage whiteone()
    {
        clickOnElement(whiteone,"Clicking on color");
        return this;
    }

    public fleetVehiclesPage clcikRed()
    {
        clickOnElement(red,"Clicking on color");
        return this;
    }

    public fleetVehiclesPage clciksilver()
    {
        clickOnElement(silver,"Clicking on color");
        return this;
    }

    public fleetVehiclesPage  clearVin()
    {
        inregNum.clear();
        return this;
    }

    public String sendVin(String vin)
    {
        inregNum.sendKeys(vin);
        return vin;

    }






}
