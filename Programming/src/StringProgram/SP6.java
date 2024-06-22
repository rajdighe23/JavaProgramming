package StringProgram;
//WAP to check weather a string is PAlindrome or not using less iteration.

public class SP6 {

	public static void main(String[] args) {
		String a = "malayalam";
		boolean flag = true;
		for (int i = 0, j = a.length() - 1; i < a.length() / 2; i++, j--) {
			if (a.charAt(i) != a.charAt(j)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a PAlindrome");

		}
	}
}
