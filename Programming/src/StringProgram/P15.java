package StringProgram;
//WAP to reverse the statement. 
public class P15 {
	public static void main(String[] args) {
		String s="today is tuesday in sept";
		String rev="";
		for (int i = 0;i<s.length(); i++) {
			String word="";
			while(i<s.length() && s.charAt(i)!=' ') {
				word=word+s.charAt(i);
				i++;
			}
			rev=word+" "+rev;
		}
		System.out.println(rev);
	}

}
