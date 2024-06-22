package Arrayprogram;
//Binary search
public class A19 {
	public static void main(String[] args) {
		int[] a = {11,22,33,44,55};
		 int search = 55;
		 int sp = 0, ep = a.length-1;
		 int mp = (sp+ep) / 2;
		 
		 while(sp<=ep) {
			 if(search == a[mp]) {
				 System.out.println("The index is "+mp);
				 break;
			 }
			 else if(search > a[mp]) {
				 sp = mp + 1;
			 }
			 else if(search < a[mp]) {
				 ep = mp - 1;
			 }
			 
			 mp = (sp + ep) / 2;
		 }
		 if(sp > ep) {
			 System.out.println("Element is not present.");
		 }
	}

}
