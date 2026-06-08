
import java.util.*;
public class ANAGRAM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sign1=sc.next();
        String sign2 = sc.next();
        boolean flag=true;
        if(sign1.length()!=sign2.length()){
            flag=false;
        }
            for(int i =0;i<sign1.length();i++){
                if(sign2.contains(""+sign1.charAt(i))){
                    flag=true;
                }
                else
                {
                    flag=false;
                }
            }
        
        if(flag){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
    
}
