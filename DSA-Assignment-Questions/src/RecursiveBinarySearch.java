import java.util.Scanner;

public class RecursiveBinarySearch {
    static int search(int[] a, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;
        if (a[mid] == target) {
            return mid;
        }

        if (a[mid] > target) {
            return search(a, left, mid - 1, target);
        }
        return search(a, mid + 1, right, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(search(a, 0, n - 1, target));
    }
}