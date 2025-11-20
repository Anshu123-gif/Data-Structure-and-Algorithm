import java.util.*;
public class recursiveiy {
     public static void displayreverseRecursively(Stack<Integer> ac){
       if(ac.size() == 0) return;
       int top = ac.pop();
       displayreverseRecursively(ac);
       System.out.print(top+"  ");
       ac.push(top);
       
    }
    public static void main(String[] args) {
        Stack<Integer> ac = new Stack<>();
        ac.push(1); 
        ac.push(2);
        ac.push(3);
        ac.push(4);
        ac.push(5);
        // System.out.println("Original Stack: " + ac);
        displayreverseRecursively(ac);
       
    }
}
        