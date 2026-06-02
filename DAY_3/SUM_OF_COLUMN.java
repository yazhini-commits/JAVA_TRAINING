
public class SUM_OF_COLUMN{
    public static void main(String[] args){
        int arr[][]= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum=0;
            for(int j =0;j<arr[i].length;j++){
                sum+=arr[j][i];
            }
            System.out.print(sum+" ");
        }
       

    }
}