package LINKED_LIST_METHODS;
import java.util.*;
public class FIND{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Single_linked_list s = new Single_linked_list();
        s.insertEnd(10);
        s.insertEnd(20);
        s.insertEnd(30);
        s.insertEnd(40);
        s.insertEnd(50);
        s.traversal();
        s.find();
        

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
class Single_linked_list{
    Node head=null;
    Node tail=null;
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(this.head==null){
           this.head=newNode;
           this.tail=newNode;
           return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    void traversal(){
        Node temp=this.head;
        if(this.head==null){
            System.out.println("The list is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+" => ");
            temp=temp.next;
        }
        System.out.println();
    }
    void find(){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the value to find: ");
           int value=sc.nextInt();
           if(this.head==null){
             System.out.println("The list is empty");
             return;
           } 
           Node temp=head;
           int count=1;
           while(temp!=null){
             if(temp.data==value){
                System.out.println("The "+value+" found at "+count+" position");
                return;
             }
             temp = temp.next;
             count++;
           }
         System.out.println(value+" not found");
    }
}