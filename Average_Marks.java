package lecture_2_programming_Fundamentals_1;

import java.util.Scanner;

public class Average_Marks {

	public static void main (String... a) {
		Scanner s = new Scanner(System.in);
		
		char name = s.next().charAt(0);
		int marks1 = s.nextInt();
		int marks2 = s.nextInt();
		int marks3= s.nextInt();
		
		int averagemarks = (marks1+marks2+marks3)/3;
		
		System.out.println(name);
		System.out.println(averagemarks);
		
	}
}
