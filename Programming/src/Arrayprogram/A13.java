package Arrayprogram;
/*
public class A13 {
public static void main(String[] args) {
	int [] a = {5,9,12,16,25};
	int n = a.length, k = 6, sum = 0;
	for (int i = 0; i < n; i++) {
		int count = 0;
		while(a[i] % k != 0) {
			a[i]--;
			count++;
		}
		sum = sum + count;
	}
	System.out.println(sum);
}

}*/


public class A13 {
public static void main(String[] args) {
	
	int [] a = {5,9,12,16,25};
	int n = a.length, k = 6, sum = 0;
	for (int i = 0; i < n; i++) {
		sum = sum + a[i] % k;
	}
	System.out.println(sum);
}

}



