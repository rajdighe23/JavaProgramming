package Arrayprogram;
//WAP to Copy array

import java.util.Arrays;

public class A24 {
	public static void main(String[] args) {
		int[] a = { 0, 4, 0, 0, 1, 3, 4, 1, 0, 2 };
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];

		}

		int[] c = a.clone();  //Using clone method.
		int[] d = Arrays.copyOf(a, a.length-1);  //Using Arrays.copyOf()

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");

		}
	}

}