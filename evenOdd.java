package All_loops;
import java.util.Scanner;
public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to check := ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println(num +"even number");
		}
		else {
			System.out.println("odd number");
		}
	}

}
