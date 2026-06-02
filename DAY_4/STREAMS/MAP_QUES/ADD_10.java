package STREAMS.MAP_QUES;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ADD_10 {
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
        List<Integer> add_10= list.stream()
            .map(x->x+10)
            .collect(Collectors.toList());
        System.out.println(add_10);
    }
    
}
