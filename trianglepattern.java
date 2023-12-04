package All_loops;
import java.util.Scanner;
public class trianglepattern {
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of row and coloumn : ");
     int num = sc.nextInt();
     for(int i=0; i<=num; i++) {
    	// System.out.println("*");
    	 for(int j=num; j>=i; j--) {
    	 System.out.print(" ");
     }
    	 for(int k =0; k<i;k++) {
    		 System.out.print("*");
   }
    	 for(int m=0; m<=i;m++) {
    		 System.out.print("*");
    	 }
    System.out.print("\n");
     
	}
  }
}
