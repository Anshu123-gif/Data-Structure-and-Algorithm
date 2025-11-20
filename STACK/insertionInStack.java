import java.util.Stack;
public class insertionInStack {
    public static void main(String[] args) { 
        Stack<Integer> ac = new Stack<>();
        ac.push(1); 
        ac.push(2);
        ac.push(3);
        ac.push(4);
        ac.push(5);
        System.out.println("Original Stack: " + ac);
        int idx = 0 ;
        int x = 12 ;
        Stack<Integer> temp = new Stack<>();
        while(ac.size() > idx){
            temp.push(ac.pop());
    }
    ac.push(x);
    while(temp.size() > 0){
        ac.push(temp.pop());
    }
    System.out.println("Stack after insertion"+ ac);
    }
    
}
