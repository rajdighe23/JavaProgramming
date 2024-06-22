package Arrayprogram;
//Bubble Sort.
//WAP to print number in ascending order.
public class A14 {
	public static void main(String[] args) {
		int [] a = {50,60,10,40,20,80,30,100,5};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int temp=a[i];
				if(a[i]>a[j]) {
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		bubble();
	}


 public static void bubble() {
	 char a[]= {'R','A','J'};
	 for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			char temp=a[i];
			if(a[i]>a[j]) {
				a[i]=a[j];
				a[j]=temp;
		}
	}	 
 }
	 for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
 }
 }
