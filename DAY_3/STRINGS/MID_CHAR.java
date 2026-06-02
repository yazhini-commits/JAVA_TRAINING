package STRINGS;
import java.util.*;
public class MID_CHAR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();
        System.out.println("Enter the Character:");
        char c=sc.next().charAt(0);
        System.out.println("Enter the character to replace:");
        char n= sc.next().charAt(0);
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(c==str.charAt(i)){
                count++;
            }
            }
            
            int mid = (count / 2)+1;
           

        int occ = 0;

        String result = "";

        
        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == c) {

                occ++;

                if(occ == mid) {
                    result = result + n;
                }
                else {
                    result = result + ch;
                }
            }
            else {
                result = result + ch;
            }
        }

        System.out.println("Output: " + result);
    }
}

        
       

    
    

