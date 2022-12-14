package framework.pageObjects.MECM.ALERTS;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class alerts extends PageInit
{
    @FindBy(xpath = "//a[.='ALERTS']")
    private WebElement aletsNavigation;

@FindBy(xpath = "//*[.=' LIST OF VEHICLE ALERTS ']")
    private WebElement listOfVehiclAlertsTExt;

@FindBy(xpath = "//*[.=' LIST OF OPERATIONAL ALERTS ']")
    private WebElement listOfOperationTExt;

@FindBy(xpath = "//span[.='OPERATIONAL ALERTS']/..")
    private WebElement operationALertClick;

    @FindBy(xpath = "//*[@routerlink='/alerts/vehicle']")
    private WebElement vehicleALertClick;

@FindBy(xpath = "//button[@id='dropdownMenuButton']")
    private WebElement actionClick;

@FindBy(xpath = "//a[@class='dropdown-item cursor_ptr'][1]")
    private WebElement bulkDeletClick;

@FindBy(xpath = "//a[@class='dropdown-item cursor_ptr'][2]")
    private WebElement exportClick;



    public alerts(ExtentTest t1) {
        super(t1);
    }
    public static alerts init(ExtentTest t1){return new alerts(t1);}


    public alerts aletsNavigation()
    {
        clickOnElement(aletsNavigation,"aletsNavigatio");
        return this;
    }

 public alerts operationALertClick()
    {
        clickOnElement(operationALertClick,"operationALertClick");
        return this;
    }

public alerts actionClick()
    {
        clickOnElement(actionClick,"actionClick");
        return this;
    }

    public alerts vehicleALertClick()
    {
        clickOnElement(vehicleALertClick,"actionClick");
        return this;
    }


public alerts exportClick()
    {
        clickOnElement(exportClick,"actionClick");
        return this;
    }
public String exportClickTag()
    {
        String tag = exportClick.getTagName();
        return tag;
    }

public alerts bulkDeletClick()
    {
        clickOnElement(bulkDeletClick,"bulkDeletClick");
        return this;
    }


    public String listOfVehiclAlertsTExt()
    {
        String id = listOfVehiclAlertsTExt.getText();
        return id;
    }

public String listOfOperationTExt()
    {
        String id = listOfOperationTExt.getText();
        return id;
    }



}
