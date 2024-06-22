package Arrayprogram;

//WAP to print all the prime numbers in the array.
public class A6 {
	public static void main(String[] args) {
		int[] a = { 2, 5, 4, 7, 16, 29, 3 };
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}
}
