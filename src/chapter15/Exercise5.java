package chapter15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise5 {
    public static void main(String[] args) {
        LocalDateTime i1 = LocalDateTime.now();
        LocalDateTime i1p = i1.plusDays(100);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        String str = i1p.format(fmt);
        System.out.println(str);
        System.out.println(i1p.format(fmt));
    }
}
