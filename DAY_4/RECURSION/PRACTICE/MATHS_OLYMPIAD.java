package RECURSION.PRACTICE;
import java.util.*;
public class MATHS_OLYMPIAD {
    public static int sum(int n ,int m){
        int tot=0;
        int num=n+1;
        if(m>1){
            return sum(sum(n,m-1),1);
        }
        else{
            return (n*(n+1))/2;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println("Enter M:");
        int m = sc.nextInt();
        System.out.println(sum(n,m));
    }
}
