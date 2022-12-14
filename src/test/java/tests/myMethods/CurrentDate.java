package tests.myMethods;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CurrentDate
{
    public static String date()
    {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
            LocalDateTime now = LocalDateTime.now();
           String today = dtf.format(now);


            return today;

    }
}
