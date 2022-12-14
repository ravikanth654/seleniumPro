package framework.features;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import framework.util.common.ConfigInput;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ApiMethods
{
    private static ExtentTest pNode;


    public static ApiMethods init(ExtentTest t1) {
        pNode = t1;
        return new ApiMethods();
    }
    public String post(String requestJSON){
        Markup m = MarkupHelper.createLabel("PostRequestInitiated:", ExtentColor.TEAL);
        pNode.info(m);
        RestAssured.baseURI = ConfigInput.BaseURI;
        RequestSpecification request = RestAssured.given();
        request.body(requestJSON);
        Response res = request.post("/"+ ConfigInput.PostURL);

        int code = res.getStatusCode();
        System.out.println("code:"+code);
        String str = res.asString();
        System.out.println("body:"+str);

        if(str.equals("0000")){
            pNode.info("Code Is: "+str+" Successfully Matching Reference ID & Mobile Number");
        }
        else if(str.equals("0001")){
            pNode.info("Code Is: "+str+" Failure Matching Reference ID & Mobile Number");
        }
        else if(str.equals("0005")){
            pNode.info("Code Is: "+str+" NoRecordsFound");
        }
        else if(str.equals("0006")){
            pNode.info("Code Is: "+str+"RefIDDoesNOtMatch");
        }
        else {
            pNode.fail("Code Is: "+str+"NoResponse");
        }
        return str;
    }


}
