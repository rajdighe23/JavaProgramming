package Arrayprogram;
//WAP to find Tripplet whose sum is equals to r.

public class A23 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int r = 8;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				for (int k = j + 1; k < a.length; k++) {

					if (a[i] + a[j] + a[k] == r) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);

					}
				}

			}

		}
	}

}