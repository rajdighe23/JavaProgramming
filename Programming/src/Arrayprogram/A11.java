package Arrayprogram;

public class A11 {
	public static void main(String[] args) {
		int[] a = {8,7,4,3,5,2};
		for(int i=0; i<a.length;i++) {
			int large = a[i];
			for(int j=i+1; j<a.length; j++) {
				if (a[j]>large) {
					large = a[j];
				}
			}
			if (large == a[i]) {
				System.out.println(a[i]);
			}
		}
	}

}
