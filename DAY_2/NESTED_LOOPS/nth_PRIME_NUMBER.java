package NESTED_LOOPS;

import java.util.*;

public class nth_PRIME_NUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n th Number : ");
        int n = sc.nextInt();
        int count = 0;
        int prime = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int c = 2; c <= Math.sqrt(i); c++) {
                if (i % c == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prime = i;
                count++;
            }
            i++;
        }

        System.out.println("The " + n + "th Prime Number is: " + prime);

    }

}
