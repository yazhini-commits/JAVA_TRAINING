package STREAMS.MAP_QUES;
import java.util.*;
import java.util.stream.Collectors;
public class STRINGS_TO_UPPERCASE {
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
        List<String> uppercase_strings = list.stream()
            .map(x-> x.toUpperCase())
            .collect(Collectors.toList());
        System.out.println(uppercase_strings);
    }
}
