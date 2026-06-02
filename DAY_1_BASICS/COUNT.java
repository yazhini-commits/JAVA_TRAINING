package DAY_1_BASICS;
import java.util.*;
public class COUNT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count the digit:");
        int num = sc.nextInt();
        int count=0;
        num=Math.abs(num);
        while(num>0){
            int digit = num%10;
            count++;
            num=num/10;
        }
        System.out.println("The number of digit is: "+count);
    }
    
}
