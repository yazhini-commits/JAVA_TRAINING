package LINKED_LIST_METHODS;

import java.util.Scanner;

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
        Node temp = head;
        int current = 1;
        while (current < pos - 1 && temp.next != null) {
            temp = temp.next;
            current++;
        }
        if (temp == null || current != pos - 1) {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    void removeFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
    }

    void removeLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
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
