import java.util.Scanner;
public class CheckPalindrome {
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); String s=sc.next(); int l=0,r=s.length()-1; boolean ok=true; while(l<r)if(s.charAt(l++)!=s.charAt(r--)){ok=false;break;} System.out.println(ok?"Palindrome":"Not palindrome"); }
}