package chapter15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise4 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(df.format(now));
        c.setTime(now);
        int day = c.get(Calendar.DAY_OF_MONTH);
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        Date future = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));
    }
}
