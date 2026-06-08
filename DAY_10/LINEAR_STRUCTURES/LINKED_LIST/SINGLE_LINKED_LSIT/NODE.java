package DAY_10.LINEAR_STRUCTURES.LINKED_LIST.SINGLE_LINKED_LSIT;

class NODE{
    public NODE(int data){
        this.data=data;
        this.next=null;
    }
    int data;
    NODE next;
}
class main{
    public static void main(String[] args){
        NODE n1= new NODE(10);
        System.out.println(n1.data+" "+n1.next);
        n1.next=new NODE(20);
        n1.next.next=new NODE(30);
        n1.next.next.next=new NODE(40);
        System.out.println(n1.data+" "+n1.next);

    }
}
    

