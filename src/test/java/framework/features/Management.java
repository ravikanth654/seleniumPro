package framework.features;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import framework.util.common.Assertion;
import framework.util.common.ConfigInput;

import java.io.IOException;


public class Management
{
    private static ExtentTest pNode;

    public static Management init(ExtentTest t1)
    {
        pNode = t1;
        return new Management();
    }




    }

