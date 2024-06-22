package Arrayprogram;
//WAP to print all the old element of the array.
public class A3 {
	public static void main(String[] args) {
		int []a= {6,3,4,1,2,5,8,74,4};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}		
		}		
	}
}