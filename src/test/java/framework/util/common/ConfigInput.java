package framework.util.common;

import framework.util.propertyManagement.MEProperties;


public class ConfigInput {
    public static String URL,URL1,UserName,Password,
            msisdnPrefix,BaseURI,BaseURIOracle,PostURL,ActiontypeAccept,email,mobileNum,
            title;

    public static boolean isAssert = true;

    public static void init() {
        MEProperties Me = MEProperties.getInstance();
        URL = Me.getProperty("web.url");
        URL1 = Me.getProperty("web.url1");
        UserName = Me.getProperty("demoUser");
        Password = Me.getProperty("demoUserPwd");
        msisdnPrefix = Me.getProperty("msisdn.prefix");
        BaseURI=Me.getProperty("base.uri");
        BaseURIOracle=Me.getProperty("base.uri.oracle");
        PostURL=Me.getProperty("post.url");
        ActiontypeAccept = Me.getProperty("wallet.actiontype");
        email = Me.getProperty("demo.email");
        mobileNum = Me.getProperty("demo.mobile.num");
        title = Me.getProperty("title.name");

    }

}
