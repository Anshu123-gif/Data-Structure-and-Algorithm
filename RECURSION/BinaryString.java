  import java.util.Scanner;

public class BinaryString {
    public static void printString(String s , int n ){
        int m = s.length();
        
        // Base case: agar length n ho gayi
        if(m == n){
            System.out.println(s);
            return;
        }
        
        // Agar string khali hai, to 0 aur 1 dono laga sakte hain
        if(m == 0){
            printString(s + "0", n);
            printString(s + "1", n);
        }
        // Agar last char '1' hai, to sirf '0' laga sakte hain
        else if(s.charAt(m-1) == '1'){
            printString(s + "0", n);
        }
        // Agar last char '0' hai, to '0' aur '1' dono laga sakte hain
        else {
            printString(s + "0", n);
            printString(s + "1", n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printString("", n);
    }
}
