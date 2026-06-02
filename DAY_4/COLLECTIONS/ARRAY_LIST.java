package COLLECTIONS;
import java.util.*;
public class ARRAY_LIST {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> list= new ArrayList <>(Arrays.asList(1, 2, 3, 4));
        arr.add("apple");
        arr.add("banana");
        arr.add(0,"Orange");
        System.out.println(arr.remove(2));
        System.out.println(arr.set(0,"guava"));
        System.out.println(arr);

    }
    
}
