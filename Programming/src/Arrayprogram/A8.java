package Arrayprogram;
//WAP to print largest and second largest number of array.
public class A8 {
	public static void main(String[] args) {
		int [] a = {-1,-5,-7,-29,-4,-6,-18,-3, -29, -19};
		int large=Integer.MIN_VALUE;
		int secondlarge=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i] > large) {
				secondlarge = large;
				large = a[i];
			}
			else if(a[i] > secondlarge && a[i] != large) {
				secondlarge = a[i];
			}
		}
		System.out.println("Largest Number: "+large);
		System.out.println("Second Largest Number: "+secondlarge);

	}

}
