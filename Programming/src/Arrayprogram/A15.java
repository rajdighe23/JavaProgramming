package Arrayprogram;
//Linear Search.
//WAP to search if the element is present in array using linear search.
public class A15 {
	public static void main(String[] args) {
		int [] a = {1,52,27,7,100,62,56,72};
		int search=100;
		boolean flag=false;
		for (int i = 0; i < a.length; i++) {		
		      if(a[i]==search) {
		    	  System.out.println(a[i]);
		    	  flag=true;
		    	  break;
		      }
		}
		if(flag) {
			System.out.println("The element "+ search +" is present");
		}
		else
		{
			System.out.println("The element"+ search +"is not present");
		}
	}
}

