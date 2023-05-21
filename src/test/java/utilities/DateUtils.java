package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    public static  String[] returnNextMonth(){
        //create date object
        Date dNow = new Date();
        //create calendar object for Gregorian Calendar
        Calendar calendar = new GregorianCalendar();
        //Set calendar object to current date
        calendar.setTime(dNow);
        //Create object for Simple date format
        //Defining Date format to example : (Jan-2022)
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-yyyy");
        //increment the current month
        calendar.add(Calendar.MONTH,1);
        //generate the date base on the specified object
        String date = sdf.format(calendar.getTime());
        //returning the value of month and year in an array
        return date.split("-");

    }
}
