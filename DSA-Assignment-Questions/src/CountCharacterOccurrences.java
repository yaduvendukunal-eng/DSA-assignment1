import java.util.Scanner;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char target = sc.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}