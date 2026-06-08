package LINKED_LIST_METHODS;
import java.util.*;
class INSERTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList s = new SinglyLinkedList();
        while (true) {
            System.out.println("Enter the data:");
            int d = sc.nextInt();
            // s.insertStart(d);
            // s.insertEnd(d);
            s.insertSpecific(d);
            s.traversal(d);

        }

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

class SinglyLinkedList {
    Node head = null;
    Node tail = null;

    void insertStart(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        // System.out.println(head.data + " " + tail.data);
    }

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

    void insertSpecific(int data) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        System.out.println("Enter the position:");
        int pos = sc.nextInt();
        if (pos == 1) {
            insertStart(data);
            return;
        }
        Node temp=head;
        if(temp==null){
            System.out.println("Invalid Position");
            return;
        }
        if(temp.next==null){
            insertEnd(data);
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    int length(int count) {
        count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    void traversal(int data) {
        if (this.head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println();

    }
}