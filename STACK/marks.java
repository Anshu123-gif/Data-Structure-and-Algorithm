import java.util.*
;public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=90){
            System.out.println("a");
        }
        else if (n>=80){
            System.out.println("b");
        }
        else if (n>=70){
            System.out.println("c");
        }
        else if (n>=60){
            System.out.println("d");
        }
        else if (n>=50){
            System.out.println("e");
        }
        else{
            System.out.println("f");
        }
    }
    
}
