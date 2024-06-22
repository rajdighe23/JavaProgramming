package Arrayprogram;
//WAP to find product of all the even elements in the array.
public class A5 {

	public static void main(String[] args) {
		int [] a = {7,3,6,2,1,4,8,5,2,6};
		int prod=1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				prod=prod*a[i];
			}
		}
		System.out.println(prod);
	}
}
