package chapter17;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("三");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException例外をcatchしました");
        }
    }
}
