public class RECURSION {

    public static void display(int num){
        
        if(num==6){
            return ;
        }
        display(num + 1);
        System.out.println(num);
        
    }

    public static void display2(int num) {

        if (num == 6) {
            return;
        }
       
        System.out.println(num);
        display(num + 1);

    }

    public static void main(String[] args){
        System.out.println("Tail Rcursion");
        display(1);
        System.out.println("Head Rcursion");
        display2(1);
    }
}
