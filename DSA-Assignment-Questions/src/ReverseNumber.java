import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long remaining = Math.abs(number);
        long reversed = 0;

        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }

        System.out.println(number < 0 ? -reversed : reversed);
    }
}