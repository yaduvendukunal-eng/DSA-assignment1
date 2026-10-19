import java.util.Scanner;
public class FactorialNumber {
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); int n=sc.nextInt(); if(n<0||n>20){System.out.println("Enter n from 0 to 20");return;} long f=1; for(int i=2;i<=n;i++)f*=i; System.out.println(f); }
}