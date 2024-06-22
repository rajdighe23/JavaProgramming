package StringProgram;

public class SP29 {
	public static void main(String[] args) {
		String s = "aaHiaaaHiaaiaurHi";
		System.out.println("Count:" + countHi(s));
	}

	public static int countHi(String s) {
		int count = 0;
		if (s.contains("Hi")) {
			return 1 + countHi(s.substring(s.indexOf("Hi") + 1));
		} else {
			return 0;
		}
	}
}
