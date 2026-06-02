package STREAMS.MAP_QUES;
import java.util.*;
import java.util.stream.Collectors;
public class MULTIPLY_ARRAY_ELEMENTS_BY_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size= sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements:");
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> mul_2= Arrays.stream(arr)
            .map(x-> x*2)
            .boxed()
            .collect(Collectors.toList());
        System.out.println(mul_2);
    }
}
