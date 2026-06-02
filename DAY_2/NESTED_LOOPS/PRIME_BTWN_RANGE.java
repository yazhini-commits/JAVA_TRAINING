package NESTED_LOOPS;
import java.util.*;
public class PRIME_BTWN_RANGE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Start: ");
        int s = sc.nextInt();
        System.out.println("End: ");
        int e = sc.nextInt();
        for(int i =s;i<=e;i++){
        boolean isPrime = true;
        if(i<2){
            isPrime=false;
        }
        for(int c = 2; c <= Math.sqrt(i); c++){
            if(i % c== 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print(i+" ");
        }
            
        }
    }
    
}
