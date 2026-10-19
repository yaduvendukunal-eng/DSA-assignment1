import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Math.abs(sc.nextLong());
        long product = 1;

        do {
            product *= n % 10;
            n /= 10;
        } while (n > 0);

        System.out.println(product);
    }
}