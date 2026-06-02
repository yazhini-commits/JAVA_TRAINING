package DAY_1_BASICS;
import java.util.*;
public class REVERSE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        System.out.println("The reverse of the number is: "+reverse);
    }
}
