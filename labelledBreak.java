package All_loops;

public class labelledBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i =0; i<20; i++) {
			 x: if (i==10) {
				 i++; 
				break x;
				
			}
		
			System.out.println(i);
		}

	}

}
