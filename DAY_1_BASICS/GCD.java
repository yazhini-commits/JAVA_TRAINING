package DAY_1_BASICS;
import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int num1= sc.nextInt();
        System.out.println("Enter num 2:");
        int num2= sc.nextInt();
        int min=0;
        int gcd=1;
        if(num1>num2){
            min=num2;
        }
        else{
            min=num1;
        }
        for(int i=1;i<=min;i++){
            if(num1%i==0){
                if(num2%i==0){
                    gcd=i;
                }
            }
        }
        System.out.println("The GCD is :"+gcd);


    }
}
