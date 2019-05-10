package lecture2;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main (String... a) {
	
	Scanner s = new Scanner (System.in); // sca+crtl+space
	
	String str = s.nextLine();
	System.out.println(str);
	
	int principle = s.nextInt(); 
	double rate = s.nextDouble();
	int time = s.nextInt();
	
	double si = (principle*rate*time)/100;
	
	// char ch = s.next().charAt(arg0); for character input
	// String str = s.nextLine() for next line next
	
	System.out.println(si);
	
	
	}
}
