package DAY_1_BASICS;
import java.util.*;
public class PERFECT_NUMBER {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number to check:");
        int num= sc.nextInt();
        int original=num;
        int sum=0;
        for(int i =1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        System.out.println(original==sum);
       

    }
    
}
