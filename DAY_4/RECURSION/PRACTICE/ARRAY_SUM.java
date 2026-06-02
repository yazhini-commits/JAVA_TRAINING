package RECURSION.PRACTICE;
import java.util.*;
public class ARRAY_SUM {
    public static int sum(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }
        return arr[i] + sum(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        //long size2 = sc.nextLong();
        
        int arr[] = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of array: " + sum(arr, 0));
    }
}
