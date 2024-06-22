
package StringProgram;
//WAP to return the count of vowels present in the String.

public class SP7 {
	public static void main(String[] args) {
		String a = "RajDighe";
		a = a.toLowerCase();
		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u') {
				count++;

			}
		}
		System.out.println(count);

	}

}
