package LINKED_LIST_METHODS;

import java.util.Scanner;

public class UPDATE_VALUE {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sll2 s = new Sll2();
        s.insertEnd(10);
        s.insertEnd(20);
        s.insertEnd(30);
        s.insertEnd(40);
        s.insertEnd(50);
        s.insertEnd(60);
        s.insertEnd(70);
        s.traversal();
        s.update();
        s.traversal();
        
        

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

class Sll2 {
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
    void update(){
        Scanner sc = new Scanner(System.in);
        if(head==null){
            System.out.println("The list is empty!");
            return;
        }
        System.out.println("Enter the value: ");
        int val=sc.nextInt();
        System.out.println("Enter the new value: ");
        int new_val = sc.nextInt();
        Node temp =head;
        while(temp!=null){
            if(temp.next.data==val){
                temp.next.next.data=new_val;
                return;
            }
        }
        System.out.println("Please enter valid value");

    }

}
