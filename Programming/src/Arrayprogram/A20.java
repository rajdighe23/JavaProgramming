package Arrayprogram;

import java.util.Scanner;

public class A20 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number of queries");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the N");
		for (int i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
			
		}
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if(j * j == j * j * j) {
					count++;
					continue;
				}
				if (j * j <= a[i]) {
					count++;
				}
				if (j * j * j <= a[i]) {
					count++;
				}
				
			}
			System.out.println(count);
		}
		sc.close();
		
		
	}

}
