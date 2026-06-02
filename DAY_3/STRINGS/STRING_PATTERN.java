package STRINGS;

public class STRING_PATTERN {
    public static void main(String[] args){
        String ip="hello";
        int n=0;
        String str="";
        while(n<ip.length()){
            str+=ip.charAt(n);
            System.out.println(str);
            n++;
        }
    }
    
}
