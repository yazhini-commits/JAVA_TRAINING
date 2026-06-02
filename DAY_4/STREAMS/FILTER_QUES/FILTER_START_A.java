package STREAMS.FILTER_QUES;
import java.util.*;
import java.util.stream.Collectors;
public class FILTER_START_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter the size of list:");
        int size = sc.nextInt();
        System.out.println("Enter Strings:");
        for (int i = 0; i < size; i++) {
            String val = sc.next();
            list.add(val);
        }
        List<String> start_A = list.stream()
                .filter(x -> x.startsWith("A")||x.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(start_A);
    }
}
