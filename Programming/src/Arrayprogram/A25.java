package Arrayprogram;
//Array magic number

import java.util.Arrays;
public class A25 {
	public static void main(String[] args) {
		int [] a = {0,4,0,0,1,3,4,1,0,2};
		int [] b = a.clone();
		Arrays.sort(b);
		int goodsum = 0, badsum = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i] == b[i]) {
				goodsum = goodsum + a[i];
			}
			else {
				badsum = badsum + a[i];
			}
			
		}
		System.out.println(goodsum - badsum);
	}

}
