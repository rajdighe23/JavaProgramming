package StringProgram;
//WAP to check a String is palindrome or not.
public class SP4 {
	public static void main(String[] args) {
		String str="madam";
		String rev="";
		
		for (int i =str.length()-1;i>=0; i--) {
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
