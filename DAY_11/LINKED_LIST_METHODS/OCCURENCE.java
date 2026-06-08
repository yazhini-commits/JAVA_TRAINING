package LINKED_LIST_METHODS;

import java.util.Scanner;

public class OCCURENCE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Single_linked_list_2 s = new Single_linked_list_2();
        s.insertEnd(10);
        s.insertEnd(20);
        s.insertEnd(20);
        s.insertEnd(30);
        s.insertEnd(40);
        s.insertEnd(40);
        s.insertEnd(40);
        s.insertEnd(30);
        s.insertEnd(30);
        s.insertEnd(30);
        s.traversal();
        s.occurence();
        

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

class Single_linked_list_2 {
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
    void occurence(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int val=sc.nextInt();
        if(head==null){
            System.out.println("The list is empty");
            return ;
        }
        int count=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                count++;
            }
            temp=temp.next;
        }
        if(count==0){
            System.out.println("The value not occured!");
            return;
        }
        System.out.println("The occurence is: "+count);
    }

}