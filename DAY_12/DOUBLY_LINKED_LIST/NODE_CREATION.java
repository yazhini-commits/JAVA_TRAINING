import java.util.*;
public class NODE_CREATION{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(100);
        dll.insertEnd(200);
        dll.insertEnd(300);
        dll.insertEnd(400);
        dll.traversal();
        dll.update();
        dll.traversal();
        //dll.insertStart(100);
        //dll.traversal();
        //dll.deleteEnd();
        //dll.traversal();

       

    }
}
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class DoublyLinkedList{
    Node head=null;
    Node tail=null;
    
    void insertStart(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
    }
    
    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }
    void insertSpecific(int data){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position:");
        int pos=sc.nextInt();
        if(pos==1){
            insertStart(data);
            return;
        }

        Node temp=head;
        for(int i=1;temp.next!=null && i<pos-1;i++){
            temp=temp.next;
        }
       
        if(temp==null || temp.next==null){
            insertEnd(data);
            return;
           
        }
        Node newNode= new Node(data);
        newNode.prev=temp;
        newNode.next=temp.next;
        temp.next=newNode;
        temp.next.prev=newNode;
        
    }
    void deleteStart(){
        if(head==null){
            System.out.println("The List is empty ");
            return;
        }
        if(head==tail){
            head=null;
            System.out.println("The One element is deleted ");
            return;
            
        }
        Node temp=head;
        head=temp.next;
        head.prev=null;
        
    }
    
    void deleteEnd() {
        if (head == null) {
            System.out.println("The List is empty ");
            return;
        }
        if (head == tail) {
            head=null;
            System.out.println("The One element is deleted ");
            return;
        }
        tail = tail.prev;
        tail.next=null;
    }
    void deleteSpecific(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int pos=sc.nextInt();
        if(pos==1){
            deleteStart();
            return;
        }

        Node temp=head;
        for(int i =1;i<pos && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        if(temp==tail){
            deleteEnd();
            return;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
       

    }
    void update(){
        Scanner sc = new Scanner(System.in);
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        System.out.println("Enter the old value: ");
        int val = sc.nextInt();
        System.out.println("Enter the new value:");
        int new_val=sc.nextInt();
        Node temp= head;
        while(temp!=null){
            if(temp.data==val){
                temp.data=new_val;
            }
            temp=temp.next;
        } 
        
    }
    void traversal(){
        Node temp=head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}