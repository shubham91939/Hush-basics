package lecture_2_programming_Fundamentals_1;

import java.util.Scanner;

public class Triangle_of_Numbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		
		while (row<=n) {
			int value=row;
			
			for (int count=1;count<=(n-row);count++) {
				System.out.print(" ");
			}
			
			for (int count =1; count<=row;count++) {
				System.out.print(value);
				value+=1;
			}
			
			int value2 = value-2;
			for (int count=1;count<row;count++) {
				System.out.print(value2);
				value2-=1;
			}
			row+=1;
			System.out.println();
		}
		
	}

}
