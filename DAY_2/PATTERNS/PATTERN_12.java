package PATTERNS;

import java.util.Scanner;

public class PATTERN_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of times: ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =n;j>i;j--){
                System.out.print(j);
                
                
            }
            System.out.println();
        }
    }
    
}
