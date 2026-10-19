import java.util.Scanner;
public class CountDigits {
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); long n=Math.abs(sc.nextLong()); int count=0; do{count++;n/=10;}while(n>0); System.out.println(count); }
}