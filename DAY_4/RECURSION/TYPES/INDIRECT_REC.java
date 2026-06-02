public class INDIRECT_REC {
    static void A(int n ){
        if(n<=0)
            return;
        System.out.println(n);
        B(n-1);
    }
    static void B(int n ){
        if(n<=0)
            return;
        System.out.println(n);
        A(n-1);
    }
    public static void main(String[] args){
        A(4);
    }
}
