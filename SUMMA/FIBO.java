import java.util.*;
public class FIBO {
    static int fibo(int n ){
        if (n<=1) 
            return n; 
        return fibo(n-1) + fibo(n-2);  

    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            System.out.println(fibo(i));
        }
        
    }

}

