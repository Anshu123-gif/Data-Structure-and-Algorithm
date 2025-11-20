package Linked_list;

// Remove import of org.w3c.dom.Node

// Node class for singly linked list
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// SILL class
class SILL {
    Node head;
    Node tail;
    int size;

    // insert at end (instance method)
    public void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;   // first node
        } else {
            tail.next = temp;     // link new node
            tail = temp;          // move tail
        }
        size++ ;
    }
    
    // insert at begin (instance method)
    
      void insertAtBegin(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;   // first node (head and tail same)
        } else {
            temp.next = head;     // link new node to old head
            head = temp;          // update head to new node
        }
        size++;
    }

    // insert node at any index
    public void insertNode(int val , int idx){
        if ( idx==0){
            insertAtBegin(val);
            return;
        }
        if ( idx==size){
            insertAtEnd(val);
            return;
        }
        if ( idx<0 || idx>size){
            System.out.println("invalid index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i =1 ;i<=idx-1;i++){
            x = x.next;   
        }
        // insertion logic to be added
        temp.next = x.next; //head → [10] → [20] → [30] → null
        x.next = temp;
        size++;
    }
     
    // get value at index
    public int get(int idx){
        if(idx == size-1){
            return tail.val;
        }
        if ( idx<0 || idx>=size){
            System.out.println("invalid index");
            return -1;
        }
        Node x = head;
        for (int i =0 ;i<idx;i++){
            x = x.next;   
        }
        return x.val;
    }
    // set value at index
    public int set(int idx , int val){
        if ( idx<0 || idx>=size){
            System.out.println("invalid index");
            return -1;
        }
        Node x = head;
        for (int i =0 ;i<idx;i++){
            x = x.next;   
        }
        int oldVal = x.val; //head → [10] → [20] → [30] → null

        x.val = val;
        return oldVal;
    }
    public void deteleAtHead(){
        if ( head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        size--;
        if ( size == 0){
            tail = null;
        }
    }

    public void deteleAtTail(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    // print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class implementationatend {
    public static void main(String[] args) {
        SILL list = new SILL();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.insertAtBegin(50);
        
        //for printing
        list.print(); // Output: 10 20 30 40 50

        // for inserting at end
        list.insertAtEnd(23);
        list.print();
        System.out.println(list.size);

        // for inserting at begin
        list.insertAtBegin(5);
        list.print();

        // New insertNode call
        list.insertNode(99, 3);
        list.print();
        System.out.println(list.size);

        
        System.out.println(list.get(4)); 


        System.out.println(list.set(1, 6));
        list.print();
        
    }
}
