import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Stack<Integer> ac = new Stack<>();
        ac.push(1); 
        ac.push(2); 
        ac.push(3);
        ac.push(4);
        ac.push(5);

        System.out.println("Original Stack: " + ac);
        
        Stack<Integer> bc = new Stack<>();
        // Step 1: Move from ac → bc (reversing order)
        while (ac.size() > 0) {
            bc.push(ac.pop());
            System.out.println("bc: " + bc);
        }

        Stack<Integer> cc = new Stack<>();
        // Step 2: Move from bc → cc
        while (bc.size() > 0) {
            cc.push(bc.pop());
            System.out.println("cc: " + cc);
        }

        // Step 3: Move from cc → ac (restoring original)
        while (cc.size() > 0) {
            ac.push(cc.pop());
            System.out.println("ac: " + ac);
        }

        System.out.println("\nFinal Stack (Restored): " + ac);
    }
}
