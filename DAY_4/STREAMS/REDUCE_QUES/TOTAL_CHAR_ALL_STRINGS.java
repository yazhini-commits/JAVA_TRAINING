package STREAMS.REDUCE_QUES;

import java.util.*;
import java.util.stream.Collectors;

public class TOTAL_CHAR_ALL_STRINGS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter the List size:");
        int size = sc.nextInt();
        System.out.println("Enter the Numbers:");
        for (int i = 0; i <= size; i++) {
            String val = sc.nextLine();
            list.add(val);
        }
        int len = list.stream()
                .map(x -> x.length())
                .reduce(0, (a, b) -> a + b);
        System.out.println("Total Characters = " + len);
    }
}
