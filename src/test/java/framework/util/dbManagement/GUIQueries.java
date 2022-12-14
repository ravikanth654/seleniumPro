package framework.util.dbManagement;

import com.google.common.base.CharMatcher;

import java.io.IOException;
import java.sql.ResultSet;


public class GUIQueries
{
    private static DBSetup dbConn;
    GUIQueries gu;

    public GUIQueries() {
        dbConn = new DBSetup();
    }

    public static String getOTP(String mobNum) throws IOException {
        String outPutOtp = null;
//        final String query = "select TEXT from (SELECT * FROM BUSINESSTXN.SMS_QUEUE where sms_template_id='ECOM_OTP_TEMPLATE' and TO_MOBILE_NUMBER ='"+mobNum+"' order by created_on_local desc) where rownum ='1'";
        final String query = "select TEXT FROM BUSINESSTXN.SMS_QUEUE where sms_template_id='ECOM_OTP_TEMPLATE' and TO_MOBILE_NUMBER ='"+mobNum+"' order by created_on_local desc LIMIT 1";
        try {
            ResultSet result = dbConn.RunQuery(query);
            while (result.next()) {
                String otp = result.getString("TEXT");
                System.out.println(otp);
                outPutOtp = CharMatcher.is('-').or(CharMatcher.DIGIT).retainFrom(otp);            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            dbConn.CloseConnection();
        }
        return outPutOtp;
    }

    public static String mcRRN() throws IOException {
        String rrn = null;
        final String query = "select ref_transaction_id from mpos_transaction where mod_id='WALEC' order by created_on_local desc limit 1";
        try {
            ResultSet result = dbConn.RunQuery(query);
            while (result.next()) {
                String rrn1 = result.getString(1);
                System.out.println(rrn1);
                rrn=rrn1;
                           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            dbConn.CloseConnection();
        }
        return rrn;
    }

}
