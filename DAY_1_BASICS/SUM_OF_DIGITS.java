package DAY_1_BASICS;
import java.util.*;
public class SUM_OF_DIGITS {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum=0;
        while(n>0){
            int digit= n %10;
            sum+=digit;
            n =n/10;
        }
        System.out.println("The sum of digit is: "+sum);
            
    }
}
