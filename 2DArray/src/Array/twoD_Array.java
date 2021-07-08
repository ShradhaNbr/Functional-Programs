package Array;

import java.util.Scanner;

public class twoD_Array {
	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		m = sc.nextInt();
		System.out.println("Enter number of rows");
		n = sc.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("Enter the numbers");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println(" ");
			    }
	}
}
