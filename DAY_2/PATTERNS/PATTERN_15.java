package PATTERNS;

import java.util.Scanner;

public class PATTERN_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of times: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }
            

            System.out.println();
        }
        
        for (int i = 1; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print(" *");
            }

            System.out.println();
        }
               
    }
}
