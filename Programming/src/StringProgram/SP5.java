package StringProgram;

//WAP to check weather a String is Palindrome or not using trim() and equalsIgnoreCase() method.

//trim()--> removes the starting and ending spaces from string
//equalsIgnoreCase()--> this method does not follow case.


public class SP5 {
	public static void main(String[] args) {
		String a = " Level";
		a = a.trim();

		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		
		if (a.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
