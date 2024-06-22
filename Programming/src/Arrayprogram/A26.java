package Arrayprogram;
//WAP to reverse the array.(1st way)
public class A26 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = new int[a.length];
		for (int i = 0, j = a.length-1; i <b.length; i++, j--) {
			 b[i] = a[j];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
			
		}
	}

}
