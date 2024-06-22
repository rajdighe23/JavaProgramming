package Arrayprogram;
//WAP to display number which is having maximum occurrence of k digit.

public class A22 {
	public static void main(String[] args) {
		
	
	int [] a = {37,823,122,2322,6017,222222};
	int k = 2;
	int max = 0; //to store number with max occurrence
	int maxCount=0;  //to store the max occurrence
	for (int i = 0; i < a.length; i++) {
		int count = countDigits(a[i], k);
		if (count > maxCount) {
			maxCount = count;
			max = a[i];
		}
	}
	System.out.println(max);
	}

public static int countDigits(int n, int k) {
	int count = 0;
	while (n != 0) {
		int d = n % 10;
		if (d == k) {
			count++;
		}
		n = n / 10;
	}
	return count;

}
}

