package All_loops;
import java.util.Scanner;
public class swapNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("before swaping number ; ");
	System.out.println("enter the number x:= ");
	int x= sc.nextInt();
	System.out.println("enter thr number y:= ");
	int y = sc.nextInt();
	System.out.println("After swaping number : ");
	// 1st method
	/*   int temp;
	        temp=x;
	        x=y;
	        y=temp;
	 */
	
	 // now 2nd Method
	x= x+y; 
	y=x-y;
	x=x-y;
	 
System.out.println("After swpping the number x = " +x);
System.out.println("After swpping the number y = "+y);
}
}
