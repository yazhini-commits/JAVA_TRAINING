import java.util.*;
public class DIAGONAL_MATRIX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        int size = sc.nextInt();
        int arr[][]= new int[size][size];
        for(int i =0;i<size;i++){
            for(int j =0;j<size;j++){
                System.out.println("Enter arr"+"["+i+"]"+"["+j+"]"+":");
                arr[i][j]=sc.nextInt(); 
            }
        }
        boolean diagonal=false;
        for(int i =0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i!=j){
                    if(arr[i][j]==0){
                        diagonal=true;
                    }
                    else{
                        diagonal=false;
                    }
                    
                }
               
            }
        }
        if(diagonal){
            System.out.println("Diagonal");
        }
        else
        {
            System.out.println("Not diagonal");
        }
       
        int n = sc.nextInt();
        int arr1[][] = new int[n][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if ((i == j && arr1[i][j] == 0) || (i != j && arr1[i][j] != 0)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        if (flag)
            System.out.println("No");
        else
            System.out.println("Yes");

    }
    
    
}

