package StringProgram;
//WAP to print reverse String without using inbuilt method(reverse()).
public class SP3 {
	public static void main(String[] args) {
		String str ="chocolate";
		String rev="";
		for (int i = str.length()-1; i>=0 ; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
