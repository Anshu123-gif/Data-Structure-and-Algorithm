package stack;

public class LinkListImplementationStack {

    // Node class
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Stack using LinkedList
    static class LLStack {
        private Node head = null; // top of stack
        private int size = 0;

        // push
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        // pop
        int pop() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        // peek
        int peek() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.val;
        }

        // size
        int size() {
            return size;
        }

        // isEmpty
        boolean isEmpty() {
            return size == 0;
        }

        // display from top to bottom
        void display() {
            Node temp = head;
            System.out.print("Stack : ");
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // display in reverse (bottom to top)
        void displayReverse(Node h) {
            if (h == null) return;
            displayReverse(h.next);
            System.out.print(h.val + " ");
        }

        void displayReverse() {
            System.out.print("Reverse Stack : ");
            displayReverse(head);
            System.out.println();
        }
    }

    // Test the stack
    public static void main(String[] args) {
        LLStack st = new LLStack();

        st.push(1);
        st.display();

        st.push(2);
        st.display();

        st.push(3);
        st.display();

        st.displayReverse();

        System.out.println("Size = " + st.size());

        st.pop();
        st.display();
        System.out.println("Size = " + st.size());
    }
}
