import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int num1=sc.nextInt();
		    int num2=sc.nextInt();
		    int num3=sc.nextInt();
		    int sec=0;
		    if(num1>num2 && num2<num3){
		        sec=num2;
		    }
		    else if(num2>num1 && num1<num3){
		        sec=num1;
		    }
		    else if(num1>num3 && num3<num1){
		        sec=num3;
		    }
		    System.out.println(sec);
		    t--;
		}

	}
}
