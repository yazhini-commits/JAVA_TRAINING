public class STRING {
    public static void main(String[] args){
        String s3="abacde";
        String s2="abcde";
        String s4 = new String("abcde");
        //System.out.println(s1.equals(s3));
        //System.out.println(s1==s3);
        //System.out.println(s1.charAt(2));
        //System.out.println(s1.substring(0, 2));
        String s1=s3.replace("abac", " ");
        s2=s3.replaceFirst("a","z");
        System.out.println(s1);
        System.out.println(s2);
        
    }
    
}
