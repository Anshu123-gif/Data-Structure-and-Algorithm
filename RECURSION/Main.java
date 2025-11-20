import java.util.Scanner;

public class Main {
    public static int gcd(int a,int b){
  if (b%a ==0) return a ;
  return gcd(b%a,a) ;
    }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // create scanner only once

        System.out.println("Enter a:");
        int a = sc.nextInt();  // read integer

        System.out.println("Enter b:");
        int b = sc.nextInt();  // read integer

        System.out.println(gcd(a,b));
    }
}
