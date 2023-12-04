package All_loops;
import java.util.Scanner;
public class FebonacciSeries {
  // 0,1,1,2,3,5,8,13,21,34...Fibonacci series.
	
	static int b=1;
	static int a=0;
	static int c=0;
	//int count=0;
	public static void febonacci(int num) {
		
		if(num>0) {
		  c=a+b;
		    a=b;
		    b=c;
		
		System.out.print(" "+c);
		febonacci(num-1);
		}  
	}
	
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int num=sc.nextInt();
	   System.out.print(a+" "+b);
	    febonacci(num-2);
		
	}

}
