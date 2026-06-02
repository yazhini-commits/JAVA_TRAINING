package STREAMS.MAP_QUES;
import java.util.*;
import java.util.stream.Collectors;
public class LIST_TO_SQUARES {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list= new ArrayList<>();
        System.out.println("Enter the list size:");
        int size= sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            int val= sc.nextInt();
            list.add(val);
        }
        List<Integer> squares = list.stream()
            .map(x-> x*x)
            .collect(Collectors.toList());
        System.out.println(squares);
    }
}
