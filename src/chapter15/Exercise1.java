package chapter15;

public class Exercise1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
          sb.append(i+1).append(",");
        }
        String s = sb.toString();
        String[] a = s.split(",");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
