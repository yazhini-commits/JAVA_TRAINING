package STREAMS.FILTER_QUES;
import java.util.*;
import java.util.stream.Collectors;
public class NUMBER_GREATER_THAN_50 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of list:");
        int size = sc.nextInt();
        System.out.println("Enter Elements:");
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            list.add(val);
        }
        List<Integer> even = list.stream()
                .filter(x -> x >50 )
                .collect(Collectors.toList());
        System.out.println(even);
    }
}
