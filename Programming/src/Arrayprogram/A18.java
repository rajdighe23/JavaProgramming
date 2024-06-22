package Arrayprogram;
//WAP to print average of largest and smallest numbers of the array.
//consider duplicate numbers during calculation.
public class A18 {
	public static void main(String[] args) {
		int [] a = {1,4,3,4,4,4,1}; //1+4+4+4+4+1=18  18/6=3
		int large = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		int countl = 0;
		int counts = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>large) {
				large = a[i];
			}
			
			if(a[i]<small) {
				small = a[i];
			}
		}
		
		//System.out.println(large);
	    //System.out.println(small);
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==large) {
				countl++;
			}
		}
		//System.out.println(countl);
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==small) {
				counts++;
			}
		}
		//System.out.println(counts);
		
		int num = countl+counts;
		
		double avg = (double) (large*countl+small*counts) / num;
		System.out.println(avg);
		
		
		/*float sum = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == large || a[i] == small) {
				sum = sum + a[i];
				count++;
			}	
		}
		
		System.out.println(sum/count);*/
	}

}
