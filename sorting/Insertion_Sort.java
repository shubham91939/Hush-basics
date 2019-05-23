package sorting;

import java.util.Scanner;

public class Insertion_Sort {
	public static int[] inputArray() {
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void insertion_sort(int[] arr) {
		for (int i=0;i<arr.length;i++) {
		int j=i;
			
			while (j>=1 && arr[j-1]>arr[j]) { // jabtak j>=1 hain aur j ki preceeding value j ki present value se badhi hai
				
//				j>=1 as is same logic we apply when we want to swap numbers in an array we do "arr.length-1",
//				taaki array out of bound naa aaye. Simillarly when j=1 hoga toh wo j-1 that is j=0 ke liye bhi check karega. 
//				Aur agar hum j ko 0 se shuru kar dete hain kar dete hain toh wo swap ke liye j=j-1 that is j=-1 access karega jo available hi nahi hai.
				
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--; // to sort left hand side.of present value of i.
			}
		}
	}
	public static void main(String[] args) {

		int arr[] = inputArray();
		insertion_sort(arr);
		printArray(arr);
	}

}
