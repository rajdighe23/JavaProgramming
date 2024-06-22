package Arrayprogram;
//WAP to print sum of all the elements of the array.
public class A4 {
	public static void main(String[] args) {
		int []a= {3,5,1,6};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	}
}
