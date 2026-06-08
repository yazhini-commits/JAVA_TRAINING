package LINKED_LIST_METHODS;

import java.util.Scanner;

public class MID_VALUE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sll s = new Sll();
        s.insertEnd(10);
        s.insertEnd(20);
        s.insertEnd(30);
        s.insertEnd(40);
        s.insertEnd(50);
        s.insertEnd(60);
        s.insertEnd(70);
        
        s.traversal();
        s.mid_val();
        

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

class Sll {
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

    void mid_val(){
        if(head==null){
            System.out.println("The list is empty!");
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = (1+count) / 2;
        Node temp2 = head;
        int i = 1;
        while (i<mid) {
            temp2 = temp2.next;
            i++;
        }
        System.out.println("The Mid Value is: " + temp2.data);
    }

}
