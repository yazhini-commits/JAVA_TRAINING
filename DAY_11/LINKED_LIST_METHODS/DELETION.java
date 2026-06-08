package LINKED_LIST_METHODS;

import java.util.Scanner;

class DELETION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList s = new SinglyLinkedList();
        //System.out.println("Enter the data:");
        //int d = sc.nextInt();
        s.insertEnd(10);
        s.insertEnd(20);
        s.insertEnd(30);
        s.insertEnd(40);
        s.insertEnd(50);
        s.insertEnd(60);
        s.traversal();
        //s.removeFirst();
        s.removeValue();
        s.traversal();
        //s.removeSpecific();
       

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList  {
    Node head = null;
    Node tail = null;
    
    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void removeFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return ;
        }  
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;

    }
    void removeLast(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        Node temp=head;
        while(temp.next!=tail){//temp.next.next!=tail
            temp=temp.next;
        }
        temp.next=null;
        temp=tail;

    }
    void removeSpecific(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Position: ");
        int pos=sc.nextInt();
        if(pos==1){
            removeFirst();
            return;
        }
        Node temp=head;//pos-1 to stop before
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null){//temp.next=null means cannot delete the last when the temp is the last
            System.out.println("Invalid position");
            return;
        }
        if(temp.next==tail){
            tail=temp;
        }
        temp.next=temp.next.next;

    }
    void removeValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value:");
        int val=sc.nextInt();
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.data == val) {
            removeFirst();
            return;
        }
        if (tail.data == val) {
            removeLast();
            return;
        }
        Node temp1 = head;
        while (temp1.next != null && temp1.next.data != val) {
            temp1 = temp1.next;
        }
        if (temp1 == null || temp1.next == null) {
            System.out.println("Value not found");
            return;
        }
        if (temp1.next == tail) {
            tail = temp1;
        }
        temp1.next = temp1.next.next;
        // Node temp2 = null;
        // while(temp1 != null){
        // if(temp1.data == value){
        // if(temp2.next == tail) {
        // tail = temp2;
        // }
        // temp2.next = temp1.next;
        // return;
        // }
        // temp2 = temp1;
        // temp1 = temp1.next;
        // }

        // System.out.println("value not found");
    }



    void traversal() {
        if (this.head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println();

    }


}
