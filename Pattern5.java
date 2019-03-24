package lecture2;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
	int rows = 1;
	while (rows<=n) {
		int count = 1;
		int val = rows;
		while (count<=rows) {
		
			System.out.print(val);
			val=val+1;
			count = count+1;
		}
		System.out.println("");
		rows=rows+1; 
	}

	}

}
