import java.util.*;
public class HOUSE_VISIT {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int i = 0;
        while (i < size) {
            i = i + arr[i];
            if (i >= size)
                break;
            count++;
        }
        System.out.println("House Visited: "+count);
    }
}
