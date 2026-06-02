public class NESTED_REC {
    static int rec(int n ){
        if(n>100){
            return n-10;
        }
        return rec(rec(n+11));

    }
    public static void main(String[] args){
        System.out.println(rec(95));
    }
}
