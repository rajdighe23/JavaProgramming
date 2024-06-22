package Arrayprogram;
//WAP to check if the Array is Palindrome or not



public class A28 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,3,2,1};
		boolean flag = true;
		
		for (int i = 0; i < a.length / 2; i++) {
			if(a[i] != a[a.length - 1 - i]) {
				flag = false;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println("Array is Palindrome");
		}
		else {
			System.out.println("Array is not Palindrome");
		}
	}

}



/*public class A28 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,3,2,1};
		int [] b = new int[a.length];
		boolean flag = true;
		
		
		for (int i = 0, j = a.length-1; i < b.length; i++, j--) {
			b[i] = a[j];
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				flag = false;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println("array is palindrome");
		}
		else {
			System.out.println("array is not palindrome");
		}
	}

}*/