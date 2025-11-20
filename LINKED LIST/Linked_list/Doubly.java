package Linked_list;

class dNode {
    int val;
    dNode next;
    dNode prev;

    dNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class Doubly{
    public static void print(dNode head) {
        dNode temp =tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);

        // Linking nodes
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;

        print(a);
        printreverse(d);
    }
}
