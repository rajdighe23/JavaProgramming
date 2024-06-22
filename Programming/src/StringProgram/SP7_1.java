package StringProgram;
//WAP to return the count of spaces present in the String.
public class SP7_1 {
	public static void main(String[] args) {
		String a=" Raj Dighe ";
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
