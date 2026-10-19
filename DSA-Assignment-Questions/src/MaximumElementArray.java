import java.util.Scanner;

public class MaximumElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            return;
        }

        int max = sc.nextInt();
        for (int i = 1; i < n; i++) {
            max = Math.max(max, sc.nextInt());
        }

        System.out.println(max);
    }
}