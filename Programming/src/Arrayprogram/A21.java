package Arrayprogram;
//IGNORE

import java.util.Scanner;
public class A21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		int large = 0;
		int max = 0;
		int digit = 2;
		for (int i = 0; i < a.length; i++) {
			int r = a[i];
			int count = 0;
			while (a[i] != 0) {
				int d = a[i] % 10;
				if (d == digit) {
					count++;
				}
				a[i] = a[i] / 10;
			}
			// System.out.println(count);

			if (count > large) {
				large = count;
				max = r;
			}
		}
		System.out.println(max);
	}
}