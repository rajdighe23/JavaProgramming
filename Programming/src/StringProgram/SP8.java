package StringProgram;

//WAP to print all consonants present in String
public class SP8 {
	public static void main(String[] args) {
		String a="education";
		a=a.toLowerCase();
		String rev="";
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if((c!='a' && c!='e' && c!='i' && c!='o' && c!='u')) {
				rev=rev+c;
			}
		}
		System.out.println(rev);
	}
	

}
