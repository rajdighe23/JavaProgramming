package StringProgram;
//WAP to reverse the entire sentence without using inbuilt method.

public class SP17 {
	public static void main(String[] args) {
		String s="Today is tuesday in September";
		String rev="";
		
		for (int i = 0; i < s.length(); i++) {
			String word="";
			while(i<s.length()&&s.charAt(i)!=' ') {
				word=word+s.charAt(i);
				i++;
			}
			rev=word+" "+rev;
		}
		System.out.println(rev);
	}
}
