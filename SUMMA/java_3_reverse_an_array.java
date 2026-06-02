import java.util.*;
public class java_3_reverse_an_array{
    public static void main(String[] args){
        int arr1[]= {1,2,3,4,5};
        
        for(int i=0;i<=arr1.length/2;i++){
            int temp=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=temp;
            }
        
        System.out.println(Arrays.toString(arr1));

        // another method
        int arr2[] = { 1, 2, 3, 4, 5 };
            int start=0;
            int end=arr1.length-1;
            while(start<end){
                int temp= arr2[start];
                arr2[start]=arr2[end];
                arr2[end]=temp;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(arr2));
    }
}