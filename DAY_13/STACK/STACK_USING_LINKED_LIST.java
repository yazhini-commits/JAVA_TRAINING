package DAY_13.STACK;

import java.util.Scanner;

public class STACK_USING_LINKED_LIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.traversal();

        System.out.println("Popped: " + s.pop());
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

class Stack {
    Node head = null;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    boolean isEmpty() {
        return head == null;
    }

    void traversal() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("null");
    }
}