package Linked_list;

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LeftMiddle {
    // Function to find left middle
    public static Node leftMiddle(Node head) {
        if (head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head.next;  // 👈 start fast one step ahead

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;  // slow will be left middle
    }

    public static void main(String[] args) {
        // Example: 1->2->3->4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node mid = leftMiddle(head);
        System.out.println("Left middle is: " + mid.val); // Output: 2
    }
}
