import java.util.*;
public class java_2{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the transmission number:");
        int n = sc.nextInt();
        int num= n;
        int result=0;
        while(num>0){
            int digit= num%10;
            result+= digit*digit*digit;
            num = num/10;
        }
        if(n == result){
            System.out.println("Valid ");
        }
        else{
            System.out.println("Invalid");
        }
    }
    

}