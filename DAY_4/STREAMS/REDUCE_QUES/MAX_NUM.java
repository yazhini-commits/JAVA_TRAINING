package STREAMS.REDUCE_QUES;
import java.util.*;
import java.util.stream.Collectors;
public class MAX_NUM {
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
        int max = list.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a>b?a:b);
        System.out.println(max);
    }
}
