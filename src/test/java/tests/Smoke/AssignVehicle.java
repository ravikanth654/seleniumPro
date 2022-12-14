package tests.Smoke;

import com.aventstack.extentreports.ExtentTest;
import framework.features.Login;
import framework.pageObjects.Page_info.PageInfo_pg1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.TestInit;


public class AssignVehicle extends TestInit {

    @Test
    public void test() throws Exception {
        ExtentTest t1 = pNode.createNode("Login test", "Login test");
//        Users us = DataFactory.getUserDetails("cccare");
        
//        System.out.println(us.UN);
//        System.out.println(us.PWD);
//        System.out.println(us.UserType);

        Login.init(t1).validLogin("admin");
        PageInfo_pg1.init(t1)
//                .configBtn()
//                .cus()
                .mobility();
        driver.findElement(By.xpath("//a[.='TRIPS']")).click();
        driver.findElement(By.xpath("//div[.='DEFAULT']")).click();;
        driver.findElement(By.xpath("//a[.='TRIP Adhoc']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'RH10')]")).click();



    }
}