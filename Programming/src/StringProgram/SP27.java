package StringProgram;

public class SP27 {
	public static void main(String[] args) {
		String s1="meet me at the clock tower in thane";
		String a[]=s1.split(" ");
		for (int i = 0; i < a.length; i++) {
			int x=i%3;
			if(x==0) {
				System.out.print(toVowel(a[i]+""));
			}
			else if(x==1) {
				System.out.print(toConsonant(a[i]+""));
			}
			else if(x==3) {
				System.out.print(toUppercase(a[i]+""));
			}
		}
	}
	public static String toVowel(String s) {
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				ch[i]='%';
			}
		}
		return new String(ch);
	}
	public static String  toConsonant(String s) {
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(s.charAt(i)!='a' || s.charAt(i)!='e' || s.charAt(i)!='i' || s.charAt(i)!='o' || s.charAt(i)!='u') {
				ch[i]='#';
			}
		}
		return new String(ch);
	}
	public static String toUppercase(String s) {
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
		ch[i]=(char)(ch[i]-32);
		}
		return new String(ch);
		
	}
}
