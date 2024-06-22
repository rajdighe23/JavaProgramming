package Arrayprogram;
//WAP to print the occurrence of average in the given array.
//Given: 5,6,4,5  average: (5+6+4+5)/4 = 5  
//--> 5 is present 2 times, hence count=2.
public class A17 {
	public static void main(String[] args) {
		int [] a = {5,6,4,5};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		//System.out.println(sum);
		int avg = sum/a.length;
		//System.out.println(avg);
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==avg) {
				count++;
			}
		}
		System.out.println(count);		
	}
}
