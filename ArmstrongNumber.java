package All_loops;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int num =sc.nextInt();
      
      int temp=num;
      int r;
      int sum=0;
      
             while(num>0) {
    		  r=num%10;
    		  num=num/10;
    		  sum= sum+r*r*r;
    	  
         }
      if(temp==sum) {
    	  System.out.println( " arm");
      }
      else {
    	  System.out.println("not");
      }
	}

}
