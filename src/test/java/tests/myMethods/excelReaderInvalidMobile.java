package tests.myMethods;

import org.apache.poi.ss.format.CellFormat;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class excelReaderInvalidMobile {
    public static ArrayList<String> GetData(String TestCaseName) throws IOException {
        String path = "S:\\officeFramework\\SelleniumScripts\\SelleniumScripts\\src\\test\\resources\\ValidationDataInput.xlsx";
        ArrayList a = new ArrayList();
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook book = new XSSFWorkbook(file);
        int sheets = book.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (book.getSheetName(i).equalsIgnoreCase("Validations")) {
                XSSFSheet sheet = book.getSheetAt(i);
                Iterator<Row> row = sheet.iterator();
                Row firstrow = row.next();
                Iterator<Cell> cell = firstrow.cellIterator();
                int k = 0;
                int colom = 0;
                while (cell.hasNext()) {
                    Cell value = cell.next();

                    if (value.getStringCellValue().equalsIgnoreCase("Testcases")) {
                        colom = k;
                    }
                    k++;
                }
                while (row.hasNext()) {
                    Row rv = row.next();
                    if (rv.getCell(colom).getStringCellValue().equalsIgnoreCase("InvalidMobileNumber")) {
                        Iterator<Cell> cv = rv.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
                            if (c.getCellType() == Cell.CELL_TYPE_STRING) {
                                a.add(c.getStringCellValue());
                            } else {
                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                            }
                        }
                    }
                }
            }
        }

        return a;
    }


    /*public static void main(String[] args) throws IOException {

        ArrayList<String> b = excelReader.GetData("InvalidMobileNumber");
        for(int i=1;i<=1;i++) {
            System.out.println(b.get(i));
        }
    }*/
}

