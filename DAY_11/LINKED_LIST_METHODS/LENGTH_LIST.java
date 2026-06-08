package LINKED_LIST_METHODS;

import java.util.Scanner;

public class LENGTH_LIST {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linked_list s = new Linked_list();
        s.insert(40);
        s.insert(30);
        s.insert(30);
        s.insert(30);
        s.traversal();
        s.len();
        
        

    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linked_list{
    Node head=null;
    Node tail=null;
    
    void insert(int data){
        Node newNode= new Node(data);
        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
            return;
        }
       tail.next=newNode;
       tail=newNode;
    }
    void traversal(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" =>");
            temp=temp.next;
        }
        System.out.println();
    }
    void len(){
        if(head==null){
            System.out.println("The List is empty!");
            return;
        }
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("The length is: "+count);
    }
}
