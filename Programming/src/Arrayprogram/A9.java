package Arrayprogram;
//WAP to print No. of negative values in the array.
public class A9 {
	public static void main(String[] args) {
        int [] a = {5,-6,4,-7,-1,-6,4};
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<0) {
				count++;
			}	
		}
		System.out.println(count);
	}
}
