package Linked_list;

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class rightMiddle {
    // Function to find right middle
    public static Node findRightMiddle(Node head) {
        if (head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow will be right middle
    }

    public static void main(String[] args) {
        // Example: 1->2->3->4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node mid = findRightMiddle(head);
        System.out.println("Right middle is: " + mid.val); // Output: 3
    }
}
