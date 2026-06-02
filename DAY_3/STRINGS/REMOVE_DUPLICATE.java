package STRINGS;

public class REMOVE_DUPLICATE {
    public static void main(String[] args){
        String str="abcaabcade";
        String rem_str="";
        int n = str.length();
        for(int i =0;i<n;i++){
            if(!rem_str.contains(str.charAt(i)+"")){
                rem_str+=str.charAt(i);
            }

        }
        System.out.println(rem_str);
    }
}
