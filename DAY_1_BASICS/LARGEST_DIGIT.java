package DAY_1_BASICS;
import java.util.*;
public class LARGEST_DIGIT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int max=num%10;
        while(num>0){
            int digit=num%10;
            if(digit>max){
                max=digit;
            }
            num=num/10;

        }
        System.out.println(max);
    }
    
}
