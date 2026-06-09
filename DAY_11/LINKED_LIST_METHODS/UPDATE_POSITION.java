package LINKED_LIST_METHODS;

import java.util.Scanner;

public class UPDATE_POSITION {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sll3 s = new Sll3();
        s.insertEnd(10);
        s.insertEnd(20);
        s.insertEnd(30);
        s.insertEnd(40);
        s.insertEnd(50);
        s.insertEnd(60);
        s.insertEnd(70);
        s.traversal();
        s.update_position();
        s.traversal();   
    }
    
}
class Sll3 {
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

    void traversal() {
        Node temp = this.head;
        if (this.head == null) {
            System.out.println("The list is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println();
    }
    void update_position(){
        Scanner sc = new Scanner(System.in);
        if(head==null){
            System.out.println("The list is empty!");
            return;
        }
        System.out.println("Enter the position: ");
        int pos=sc.nextInt();
        System.out.println("Enter the new value: ");
        int val = sc.nextInt();
        Node temp =head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
       for(int i =1;i<pos-1 && temp!=null;i++){
             temp=temp.next;
       }
       if(temp==null){
        System.out.println("Invalid position");
       }
       if(pos==1){
        head.data=val;
       }
       temp.next.data=val;
        
       

    }

}

