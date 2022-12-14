package framework.pageObjects.MECM.NOTIFICATIONS;

import com.aventstack.extentreports.ExtentTest;
import framework.pageObjects.MECM.DASH_BOARD.dashBoard;
import framework.pageObjects.PageInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class notifications extends PageInit
{
    @FindBy(xpath = "//img[@class='img-fluid']/..")
    private WebElement notificationClick;

  @FindBy(xpath = "//button[@class='close pull-right']")
    private WebElement cross;

 @FindBy(xpath = "//a[.='VIEW ALL']")
    private WebElement viewAll;

 @FindBy(xpath = "//p[@class='sidebar-header']")
    private WebElement headerText;

@FindBy(xpath = "//div[@id='mySidenav']//ul//li//div//div")
    private WebElement notifications;

@FindBy(xpath = "//a[.='BACK TO ALERTS']//h5")
    private WebElement backToalert;

@FindBy(xpath = "//div[@class='subscription-plan-heading mt-0']//p")
    private WebElement insideNotificationText;



    public notifications(ExtentTest t1) {
        super(t1);
    }
    public static notifications init(ExtentTest t1){return new notifications(t1);}

    public notifications notificationClick()
    {
        clickOnElement(notificationClick,"clcik");
        return this;
    }

 public notifications cross()
    {
        clickOnElement(cross,"clcik");
        return this;
    }
public notifications notificationsClick()
    {
        clickOnElement(notifications,"clcik");
        return this;
    }
public notifications backToalert()
    {
        clickOnElement(backToalert,"clcik");
        return this;
    }

public notifications viewAll()
    {
        clickOnElement(viewAll,"clcik");
        return this;
    }

    public String headerText()
    {
        String s = headerText.getText();
        return s;
    }
 public String insideNotificationText()
    {
        String s = insideNotificationText.getText();
        return s;
    }

 public String notificationsText()
    {
        String s = notifications.getText();
        return s;
    }




}
