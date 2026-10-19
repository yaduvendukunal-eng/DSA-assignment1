import java.util.Scanner;

public class RecursiveLinearSearch {
    static int search(int[] a, int index, int target) {
        if (index == a.length) {
            return -1;
        }
        if (a[index] == target) {
            return index;
        }
        return search(a, index + 1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(search(a, 0, target));
    }
}