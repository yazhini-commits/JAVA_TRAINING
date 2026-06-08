public class MATRIX_BOUNDARY_SUM {
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum=0;
        int len=arr.length;
        for(int i =0;i<len;i++){
            for(int j =0;j<len;j++){
                if(i==0|| j ==0|| i==len-1|| j==len-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
