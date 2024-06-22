package Arrayprogram;
//Insertion sort.
public class A29 {
	public static void main(String[] args) {
		 int [] a = {3,4,1,5,2};
		   
		   for (int i = 0; i < a.length; i++) {
			int temp = a[i], j = i;
			
			while (j > 0 && a[j-1] > temp) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}  
		   
		   for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
