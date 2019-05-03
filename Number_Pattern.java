package lecture_3_Programming_Fundamentals_2;
import java.util.Scanner;
//55555
//45555
//34555
//23455
//12345
public class Number_Pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int value=n;
		
		for (int row=1;row<=n;row++) {
			int m =value;
			for (int count=1;count<=row;count++) {
				System.out.print(m);
				m+=1;
			}
			
			for (int count=row+1;count<=n;count++) {
				System.out.print(n);
			}
			System.out.println();
			value-=1;
		}
		
		
	}

}
