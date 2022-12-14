package tests.myMethods;
import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class updateCellvalue
{


       public static String update(String path) throws IOException {
            String mail = null;
            //Blank workbook
            FileInputStream fl=new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fl);

            //Create a blank sheet
            //XSSFSheet sheet = workbook.createSheet("Employee Data");
           XSSFSheet sheet1 = workbook.getSheetAt(0);
            //This data needs to be written (Object[])
            Map<String, Object[]> data = new TreeMap<String, Object[]>();
           String fleet = null;
           String num = null;
           data.put("1", new Object[] {GeneratingRandom.fourchar(fleet), GeneratingRandom.gmail(mail), GeneratingRandom.tenNumber(num),"bijapur","bangalore","karnataka","25004035","yes"});


            //Iterate over data and write to sheet
            Set<String> keyset = data.keySet();
            int rownum = 1;
            for (String key : keyset)
            {
                Row row = sheet1.createRow(rownum++);
                Object [] objArr = data.get(key);
                int cellnum = 0;
                for (Object obj : objArr)
                {
                    Cell cell = row.createCell(cellnum++);
                    if(obj instanceof String)
                        cell.setCellValue((String)obj);
                    else if(obj instanceof Integer)
                        cell.setCellValue((Integer)obj);
                }
            }
            try
            {
                //Write the workbook in file system
                FileOutputStream out = new FileOutputStream(new File("C:\\Users\\25004035\\Downloads\\newFleetupload.xlsx"));
                workbook.write(out);
                out.close();
                System.out.println("xlsx written successfully ");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return path;
    }


    public static String updateDriver(String path) throws IOException {
        String mail = null;
        //Blank workbook
        FileInputStream fl=new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fl);

        //Create a blank sheet
        //XSSFSheet sheet = workbook.createSheet("Employee Data");
        XSSFSheet sheet1 = workbook.getSheetAt(0);
        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        String driverFirstName = null;
        String driverSecondName = null;
       // String vinv = null;
        String num = null;
        data.put("1", new Object[] {GeneratingRandom.fourchar(driverFirstName),GeneratingRandom.fourchar(driverSecondName), GeneratingRandom.tenNumber(num),"Male",GeneratingRandom.gmail(mail), GeneratingRandom.Vin(),"1992-12-12","Bijapur"});


        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 1;
        for (String key : keyset)
        {
            Row row = sheet1.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("D:\\SelleniumScripts\\src\\test\\resources\\ExcelSheetToTest\\Drivers\\newFleetupload.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("xlsx written successfully ");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return path;
    }


  /*public static void main(String[] args) throws IOException {
        updateCellvalue.update("C:\\Users\\25004035\\Downloads\\newFleetupload.xlsx");
    }*/
}
