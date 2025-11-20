package Linked_list;
class Node {
    int val ;
    Node next ; 
    Node(int val ){
       this.val= val ;
    }
}

public class ListNodee {
    //using while loop
    public static void print(Node head ){
        Node temp = head ;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;

            
        }


    }
    // public static void dislayrecursively(Node head){
    //     if (null==head) return ;
    //     System.out.println(head.val);
    //     dislayrecursively(head.next);


    // }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e;
        // System.out.println(a.val);
        // System.out.println(a.next.val);
        // System.out.println(a.next.next.val);
        // System.out.println(a.next.next.next.val);
        // System.out.println(a.next.next.next.next.val);

        //  1 Iterative print
       print (a);

         //  2 Recursive display
        //dislayrecursively(a);
        
    }
    
}
