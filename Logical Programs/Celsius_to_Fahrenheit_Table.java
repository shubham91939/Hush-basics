package lecture_2_programming_Fundamentals_1;

import java.util.Scanner;

public class Celsius_to_Fahrenheit_Table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int start =s.nextInt();
		int end = s.nextInt();
		int stepsize = s.nextInt();
		int celcius =0;
		
		while (end>=start) {
			
			celcius = ((start-32)*5)/9;
			
			System.out.print(start);
			System.out.print("\t");
			System.out.println(celcius);
			
			start+=stepsize;
		}
		
	}

}
