package DAY_1_BASICS;
import java.util.*;
public class MULTIPLICATION_TABLE {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Table number:");
    int n = sc.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(i+" * "+n +" = "+(i*n));
    }
    }

}
