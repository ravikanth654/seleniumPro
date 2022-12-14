package tests.myMethods;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dateConvert
{

        public static String date(String insideDate) throws ParseException
        {

           // String insideDate;
            String substr = insideDate.substring(insideDate.length()-12);
            String z = substr.substring(0, 2);
            System.out.println(z);
            String result;
            if(z.equals("nd")) {
                DateFormat originalFormat = new SimpleDateFormat("d'nd' MMM, yyyy", Locale.ENGLISH);
                DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = originalFormat.parse(insideDate);
                result = targetFormat.format(date);
                System.out.println(result);
            }
            else if (z.equals("st"))
            {
                DateFormat originalFormat = new SimpleDateFormat("d'st' MMM, yyyy", Locale.ENGLISH);
                DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = originalFormat.parse(insideDate);
                result = targetFormat.format(date);
                System.out.println(result);
            }
            else if(z.equals("rd"))
            {
                DateFormat originalFormat = new SimpleDateFormat("d'rd' MMM, yyyy", Locale.ENGLISH);
                DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = originalFormat.parse(insideDate);
                result = targetFormat.format(date);
                System.out.println(result);
            }
            else
            {
                DateFormat originalFormat = new SimpleDateFormat("d'th' MMM, yyyy", Locale.ENGLISH);
                DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = originalFormat.parse(insideDate);
                result = targetFormat.format(date);
                System.out.println(result);
            }

      /*  switch (day % 10) {
            case 1:
                return new SimpleDateFormat("d'st' 'of' MMMM yyyy").format(date);
            case 2:
                return new SimpleDateFormat("d'nd' 'of' MMMM yyyy").format(date);
            case 3:
                return new SimpleDateFormat("d'rd' 'of' MMMM yyyy").format(date);
            default:
                return new SimpleDateFormat("d'th' 'of' MMMM yyyy").format(date);
        }*/


            return result;
        }

       /* public static void main(String[] args) throws ParseException {
            date();
        }*/
    }


