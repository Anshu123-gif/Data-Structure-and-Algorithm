import java.util.*;
import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3); 
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: " + st);
        
        //reverse order
        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0){ 
            gt.push(st.pop());
        }
       System.out.println(gt);
       
       // restore original order
       Stack<Integer> ct = new Stack<>();
       while(gt.size() > 0){
           ct.push(gt.pop());
       }
       System.out.println(ct);
    }
}
