package StringProgram;
//WAP to convert uppercase char into lowercase char and viceversa

public class SP11 {
	public static void main(String[] args) {
		String a = "rAjDighE";
		char[] ch = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		String res = new String(ch);
		System.out.println(res);
	}

}
