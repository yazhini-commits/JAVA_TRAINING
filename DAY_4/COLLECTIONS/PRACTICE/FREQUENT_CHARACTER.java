package COLLECTIONS.PRACTICE;
import java.util.*;
public class FREQUENT_CHARACTER {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> arr= new HashMap<>();
        System.out.println("Enter the String:");
        String str= sc.next();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (arr.containsKey(ch)) {
                arr.put(ch, arr.get(ch) + 1);
            } else {
                arr.put(ch, 1);
            }
        }

        System.out.println(arr);
        


    }
    
}
