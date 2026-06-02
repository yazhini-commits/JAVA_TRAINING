package ARRAY_QUESTIONS;
import java.util.*;
public class UNIQUE_PRINT {
    public static void main(String[] args){
        int arr[]={1,2,5,4,3};
        
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            if(start!=end){
            System.out.print(arr[start]+" ");
            System.out.print(arr[end]+" ");
            
            }
            else{
                System.out.print(arr[start]);
            }
            start++;
            end--;
        }

       
    }
}
