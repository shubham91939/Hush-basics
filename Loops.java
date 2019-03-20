package lecture2;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n =s.nextInt();
		int i = 1;
		while (i<=n) //while this condition is true keep repeating this step.
		{
			System.out.println(i);
			i=i+1;
		}
		
		System.out.println("Outside loop");

	}

}
