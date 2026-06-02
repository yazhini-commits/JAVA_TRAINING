package COLLECTIONS;
import java.util.*;
public class MAP{
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",10);
        map.put("Banana",5);
        System.out.println(map);
        System.out.println(map.put("mango",map.getOrDefault("mango",1)));
        System.out.println(map.remove(2));
        System.out.println(map);
        System.out.println(map.keySet());
        for(String s:map.keySet()){
            System.out.println(s+" "+map.get(s));
        }
        System.out.println(map.get("Apple"));
    }
}