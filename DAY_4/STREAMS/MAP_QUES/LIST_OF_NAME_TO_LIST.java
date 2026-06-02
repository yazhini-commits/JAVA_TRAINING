package STREAMS.MAP_QUES;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LIST_OF_NAME_TO_LIST {
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
        List <Integer> len_str= list.stream()
            .map(x->x.length())
            .collect(Collectors.toList());
        System.out.println(len_str);
    }
}
