package Arrayprogram;
//WAP to check whether given array is Arithmetic Progression, Geometric Progression or Fibonacci Series. 
//Print the next element of resultant series.
public class A31 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		if(isArithmetic(a)) {
			System.out.println("Arithmetic Progression");
			System.out.println(a[a.length-1]+(a[1]-a[0]));
		}
		else if(isGeometric(a)) {
			System.out.println("Geometric Progression");
			System.out.println(a[a.length-1]*(a[1]/a[0]));
		}
		else {
			System.out.println("Fibonacci Series");
			System.out.println(a[a.length-1]+a[a.length-2]);
		}
	}
	
	public static boolean isArithmetic(int[] a) {
		int commDiff=a[1]-a[0];
		for (int i = 2; i < a.length; i++) {
			if(a[i]-a[i-1]!=commDiff) {
				return false;
				
			}
		}
		
		return true;
	}
	public static boolean isGeometric(int[] a) {
		int commRatio=a[1]/a[0];
		for (int i = 2; i < a.length; i++) {
			if(a[i]/a[i-1]!=commRatio) {
				return false;
			}
		}
		
		return true;
	}
	

}
