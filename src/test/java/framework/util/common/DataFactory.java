package framework.util.common;

import framework.entity.*;
import framework.util.globalConstants.FilePath;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class DataFactory {



    public static void loadUser() throws IOException, InvalidFormatException {
        int currencySheet = 0;
        DataFormatter formatter = new DataFormatter();

        // * Read the Excel *
        List<Users> UserList = new ArrayList<>();
        InputStream inp = new FileInputStream(FilePath.FILE_CONFIG_INPUT);
        Workbook wb = WorkbookFactory.create(inp);
        Sheet sheet = wb.getSheetAt(currencySheet);

        /* get last used row */
        int lastRow = sheet.getLastRowNum();

        for (int i = 1; i < lastRow; i++) {
            String userType = formatter.formatCellValue(sheet.getRow(i).getCell(0));
            if (userType == "") {
                continue;
            }
            String UN = formatter.formatCellValue(sheet.getRow(i).getCell(1));
            String PWD= formatter.formatCellValue(sheet.getRow(i).getCell(2));


            Users obj = new Users(userType,UN,PWD);

            UserList.add(obj);
        }
        GlobalData.UserList = UserList;
    }
    /**
     *
     * @param userType - eg User1
     * @return
     */
    public static Users getUserDetails(String userType){
        for (Users us : GlobalData.UserList){
            if(us.UserType.equalsIgnoreCase(userType)){
                return us;
            }
        }
        return null;
    }


    /**
     * @return
     */


    public static String getRandomNumberAsString(int length) {
        return "" + getRandomNumber(length);
    }

    /**
     * Generate Random Number
     * TODO - move to generic File
     * TODO - move to generic File
     *
     * @param length
     * @return
     */
    public static int getRandomNumber(int length) {
        Random r = new Random(System.currentTimeMillis());
        switch (length) {
            case 2: {
                return r.nextInt(20 - 10 + 1) + 10;
            }
            case 3: {
                return r.nextInt(999 - 100 + 1) + 100;
            }
            case 4: {
                return r.nextInt(9999 - 1000 + 1) + 1000;
            }
            case 5: {
                return r.nextInt(99999 - 10000 + 1) + 10000;
            }
            case 6: {
                return r.nextInt(999999 - 100000 + 1) + 100000;
            }
            case 7: {
                return r.nextInt(9999999 - 1000000 + 1) + 1000000;
            }
            case 8: {
                return r.nextInt(99999999 - 10000000 + 1) + 10000000;
            }
            case 9: {
                return r.nextInt(999999999 - 100000000 + 1) + 100000000;
            }
        }
        return length;
    }

}
