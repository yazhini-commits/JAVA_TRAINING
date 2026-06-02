package COLLECTIONS.PRACTICE;
import java.util.*;
public class FREQUENCY_WORDS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        String[] words= s.split(" ");
        Map<String,Integer> frq = new HashMap<>();
        for(String i:words){
            frq.put(i,frq.getOrDefault(i,0)+1);
           
        }
        System.out.println(frq);
    }
    
}
