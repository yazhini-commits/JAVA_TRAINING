package NESTED_LOOPS;
import java.util.*;
public class SINGLE_SUM_OF_DIGIT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int n=num;
        int digit=0;
        while(n>0){
            digit+=n%10;
            n=n/10;
        }
        if(digit>9){
            int t=digit;
            int sum=0;
            while (t > 0) {
                sum += t % 10;
                t = t / 10;
            }
        System.out.println("The Digit of a number is:"+sum);
        }
        else{
        System.out.println("The Digit of a number is:" + digit);
        }
    }
}
