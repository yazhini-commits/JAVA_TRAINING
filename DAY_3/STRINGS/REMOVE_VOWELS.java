package STRINGS;

public class REMOVE_VOWELS {
    public static void main(String[] args){
        String str = "hello all";
        String str2="";
        String vowels = "aAeEiIoOuU";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (!vowels.contains(str.charAt(i)+"")) {
                str2+=str.charAt(i);
            }

        }
        System.out.println(str2);
        
    }
    
}
