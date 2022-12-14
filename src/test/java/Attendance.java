import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Attendance
{




        public static void main(String[] args) throws Exception {

            // System Property for Chrome Driver
            System.setProperty("webdriver.chrome.driver", "D:\\SelleniumScripts\\drivers\\chromedriver.exe");

            // Instantiate a ChromeDriver class.
            WebDriver driver=new ChromeDriver();

            // Launch Website
            driver.navigate().to("https://cordys2.mahindra.com/home/Mahindra/com/ps/portal/portal.htm");

            //Maximize the browser
            driver.manage().window().maximize();
            String username = "25004035@mahindra.com";

            //Set the password
            String password = "Mummy@123";


            String URL = "https://" +username +":" +password ;
            driver.get(URL);

            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            String title = driver.getTitle();

            System.out.println("The page title is "+title);


          /*  WebElement yes = driver.findElement(By.xpath("(//*[@id='panel-default']/a/h3/i/../..)[3]"));

            //WebElement element = driver.findElement(By.id("gbqfd"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", yes);*/




        }
}
