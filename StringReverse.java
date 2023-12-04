package All_loops;

public class StringReverse {
  public static void main(String[] args) {
	String name = "Ashutosh Yadav you are the Boss";
	int length = name.length();
	 String rev="";
	 for(int i=length-1;i>=0;i--) {
		 rev = rev+name.charAt(i);
	 }
	 System.out.println(rev);
	
 }
}
