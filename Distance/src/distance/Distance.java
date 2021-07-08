package distance;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		int x, y;
		System.out.println("Enter the value of x");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println("Enter the value of y");
		y = sc.nextInt();
		distance(x, y);
		sc.close();
	}

	public static void distance(int x, int y) {
		double distance = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
		System.out.println("Euclidean distance is " + distance);
	}
}
