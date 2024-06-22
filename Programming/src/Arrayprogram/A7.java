package Arrayprogram;
//WAP to print largest number in the array.
public class A7 {
	public static void main(String[] args) {
		int [] a = {99,5,996,1,7,10,89,2};
		int large=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println(large);
	}
}
