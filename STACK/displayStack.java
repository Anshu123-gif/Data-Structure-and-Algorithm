import java.util.*;
public class displayStack {
    public static void displayRec(Stack<Integer> ac){
        ac.push(20);
    }
    public static void main(String[] args) {
        Stack<Integer> ac = new Stack<>();
        ac.push(1); 
        ac.push(2);
        ac.push(3);
        ac.push(4);
        ac.push(5);
        System.out.println("Original Stack: " + ac);
        displayRec(ac);
        System.out.print(ac);
    }   
}
