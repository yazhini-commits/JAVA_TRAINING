package COLLECTIONS.PRACTICE;
import java.util.*;
public class COUNT_NUMBERS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Map<String,Integer> num= new HashMap<>();
        num.put("positive", 0);
        num.put("negative", 0);
        num.put("zero", 0);

        System.out.println("Enter the no of values:");
        int no = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i =0;i<no;i++){
            int val = sc.nextInt();
            list.add(val);
        }
        for(int i :list){
             if (i > 0) {
                num.put("positive", num.get("positive") + 1);
            }

            else if (i < 0) {
                num.put("negative", num.get("negative") + 1);
            }

            else {
                num.put("zero", num.get("zero") + 1);
        }
       
    }
    System.out.println(num);
}
}
