package All_loops;

import java.util.Scanner;

public class SumEvenNum {
	public static void main(String[] args) {
	
    Scanner sc = new Scanner (System.in);
     System.out.println("Enter the range ");
  
     System.out.println("Enter the start");
     int start = sc.nextInt();
     System.out.println("Enter the last ");
     int last = sc.nextInt();
     int sum=0;
     for(int i=start;i<last;i++) {
    	 if(i%2==0) {
    		 sum+=i;
    	 }
     }
     System.out.println(sum);
   
  
}
}
