package JC.Day71;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;



public class Main {

    public static void printCalendar(Calendar c){
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        
        System.out.println(c.get(Calendar.AM_PM));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));


    }

    static Calendar todate(String st){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dd = new Date();
        try {
           dd = sdf.parse(st);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(dd);
        return cal;
    }
    static String toYMD(Calendar ca){
        SimpleDateFormat sdf = new SimpleDateFormat();
        return sdf.format(ca.getTime());
    }
    public static void main(String[] args) {
    
        // Date d = new Date();
        // System.out.println(d);

        Calendar today = Calendar.getInstance();
        // // System.out.println(today.getTime());

        
        // printCalendar(today);        
        String st = "2018-10-23"; //날짜 형태가 년-월-일 형식
                                  //SimpleDateFormat을 이용해서 Calander로 변화할 수 있다.
        Calendar d2 = todate(st);   //날자로 변환

        System.out.println(toYMD(d2));



    }
}
