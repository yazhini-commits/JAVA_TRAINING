import java.util.*;
public class ADD_TWO_VALUE {
    public static void main(String[] args){
        int arr[]={ 3, 4, 1, 6, 7, 8, 9};
        int add[]= new int[arr.length];
        for(int i=1;i<arr.length;i=i+2){
            add[i]=arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(add));
    }
    
}
