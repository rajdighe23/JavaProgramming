package StringProgram;
//WAP to Capitalize first character of each word of the string.

public class SP20 {
	public static void main(String[] args) {
		String s="today at 3pm is programming batch";
		String []a=s.split(" ");
		for(int i=0;i<a.length;i++) {
			a[i]=firstCharUpperCase(a[i]);
			System.out.print(a[i]+" ");
		}
		
	}
	public static String firstCharUpperCase(String s) {
		char []ch=s.toCharArray();
		if(ch[0]>='a' && ch[0]<='z') {
			ch[0]=(char)(ch[0]-32);
		}
		return new String(ch);
	}

}
