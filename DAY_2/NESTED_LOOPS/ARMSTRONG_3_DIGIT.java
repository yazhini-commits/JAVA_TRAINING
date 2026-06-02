package NESTED_LOOPS;
import java.util.*;
public class ARMSTRONG_3_DIGIT {
    public static void main(String[] args){
        for(int i=100;i<1000;i++){
            int num=i;
            int result=0;
            while(num!=0){
                int digit=num%10;
                result+=(digit*digit*digit);
                num/=10;
            }
            if(i==result){
                System.out.println(i);
            }
            
        }
    }
    
}
