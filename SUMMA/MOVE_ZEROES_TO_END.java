import java.util.*;
public class MOVE_ZEROES_TO_END{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr= new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int n =0;
        int[] arr2= new int[size];
        for(int i =0;i<size;i++){
            if(arr[i]!=0){
                arr2[n]=arr[i];
                n++;
            }
            else{
                count++;
            }
        }
        for(int i =0;i<count;i++){
            arr2[n]=0;
        }
        for(int i =0;i<size;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}