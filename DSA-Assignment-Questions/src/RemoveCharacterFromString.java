import java.util.Scanner;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char target = sc.nextLine().charAt(0);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != target) {
                result.append(s.charAt(i));
            }
        }

        System.out.println(result);
    }
}