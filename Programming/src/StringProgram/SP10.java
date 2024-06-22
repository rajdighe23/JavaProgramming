package StringProgram;

//WAP to convert all lowercase character into uppercase
public class SP10 {
	public static void main(String[] args) {
		String a = "Thane@123";
		char[] ch = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		String res = new String(ch);
		System.out.println(res);
	}
}


//lowercase ASCII-32 =Uppercase
//uppercase ASCII+32 =Lowercase