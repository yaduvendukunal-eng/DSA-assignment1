import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Math.abs(sc.nextLong());
        long b = Math.abs(sc.nextLong());

        if (a == 0 || b == 0) {
            System.out.println(0);
            return;
        }

        long x = a, y = b;
        while (y != 0) {
            long remainder = x % y;
            x = y;
            y = remainder;
        }

        System.out.println((a / x) * b);
    }
}