package DAY_1_BASICS;
import java.util.*;
public class FIBONACCI {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int a=0;
        int b=1;
       System.out.println(a);
       System.out.println(b);
        for(int i=2;i<num;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            
            
        }
        
    }
}
