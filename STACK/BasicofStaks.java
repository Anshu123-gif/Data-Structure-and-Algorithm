
import java.util.Stack;
public class BasicofStaks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // Peek at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // Get the size of the stack
        int size = stack.size();
        System.out.println("Stack Size: " + size);
    }
}