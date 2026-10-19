import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n < 0) {
            System.out.println("Enter a non-negative number");
            return;
        }

        System.out.println(n * (n + 1) / 2);
    }
}