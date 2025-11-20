import java.util.Scanner;

public class SumReturnType {
    
        public static int sum (int n ){
        if (n==0 || n==1) return n ; // base call 
        return n+ sum(n-1); //call 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        System.out.println(sum(n));

    }
    
}
