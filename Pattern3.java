package lecture2;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int row = 1;
		
		while (row<=n) {
			
			int count =1;
			while (count <=row) {
				System.out.print(row);
				count = count+1;
			}
			System.out.println("");
			row=row+1;
		}
		

	}

}
