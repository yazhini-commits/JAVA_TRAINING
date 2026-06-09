package CIRCULAR_LINKED_LIST;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        System.out.println("Circular Linked List:");
        cll.display();
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

class CircularLinkedList {

    Node head = null;
    Node tail = null;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // circular
        }
    }

    // Display
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while{temp!=head){
            temp=temp.next;
        }
        System.out.println("head");
    }

}
`