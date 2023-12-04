package All_loops;
import java.util.Scanner;
/*
public class starPattern {
     
	public static void righttriangle(int num) {
		
		for( int i =0 ; i<=num; i++) {
	    	  
	    	//  System.out.println("1 ");
	       
	    	   for(int j=0 ;j<=i; j++) { 
	    		  System.out.print("* ");
	    	   }
	    	    System.out.print("\n");
	       }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number = ");
		 int num= sc.nextInt();
		 righttriangle(num);
		 System.out.println("now left side se");
	}
}
*/

public class starPattern{
	
	public static void righttriangle2(int num) {
		for(int i=0; i<num;i++) {
			//System.out.println();
			for(int j=num; j>i;j--) {
				System.out.print(" ");
			}
			 for(int k=0 ;k<=i; k++) { 
	    		  System.out.print("*");
	    	   }
	    	    System.out.print("\n");
		}
		
	}
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number = ");
		num=sc.nextInt();
		righttriangle2(num);
	}
}

