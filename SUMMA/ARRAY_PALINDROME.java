
public class ARRAY_PALINDROME {
    public static void main(String[] args){
        int[] arr1= {1,2,3,2,1};
        boolean palindrome=true;
        int start=0;
        int end=arr1.length-1;
        while(start<end){
            if(arr1[start]!=arr1[end]){
                palindrome=false;
            }
           
            start++;
            end--;
        }
        if(palindrome){
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
    
}
