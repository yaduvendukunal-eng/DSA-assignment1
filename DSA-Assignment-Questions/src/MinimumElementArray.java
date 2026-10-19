import java.util.Scanner;

public class MinimumElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            return;
        }

        int min = sc.nextInt();
        for (int i = 1; i < n; i++) {
            min = Math.min(min, sc.nextInt());
        }

        System.out.println(min);
    }
}