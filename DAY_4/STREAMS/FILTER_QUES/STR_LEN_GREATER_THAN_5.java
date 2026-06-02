package STREAMS.FILTER_QUES;
import java.util.*;
import java.util.stream.Collectors;
public class STR_LEN_GREATER_THAN_5 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter the list size:");
        int size = sc.nextInt();
        System.out.println("Enter the Strings:");
        for (int i = 0; i < size; i++) {
            String val = sc.next();
            list.add(val);
        }
        List<String> len_greater_than_5 = list.stream()
            .filter(x-> x.length()>5)
            .collect(Collectors.toList());
        System.out.println(len_greater_than_5);
    }
}
