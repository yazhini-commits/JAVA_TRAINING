import java.util.*;
public class java_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        num= Math.abs(num);
        int count=0;
        while(num>0){
            int digit= num%10;
            count++;
            num= num/10;
        }
        System.out.println(count);
    }
    
}
