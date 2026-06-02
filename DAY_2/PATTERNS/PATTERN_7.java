package PATTERNS;

import java.util.Scanner;

public class PATTERN_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of times: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j); 
            }
            System.out.println();
        }
    }
    
}
