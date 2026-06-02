package DAY_1_BASICS;
import java.util.*;
public class ARMSTRONG_NUMBER {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int original=num;
        int result=0;
        int count=0;
        while(num>0){
            int digit=num%10;
            count++;
            num=num/10;
        }
        num=original;
        while(num>0){
            int digit = num%10;
            result+= Math.pow(digit,count);
            num=num/10;
            
        }
        
        if(original==result){
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
