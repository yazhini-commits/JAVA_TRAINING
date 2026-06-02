package STREAMS.REDUCE_QUES;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MIN_NUM {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the List size:");
        int size = sc.nextInt();
        System.out.println("Enter the Numbers:");
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            list.add(val);
        }
        int min = list.stream()
                .reduce(1, (a, b) -> a<b?a:b);
        System.out.println(min);
    }
    
}
