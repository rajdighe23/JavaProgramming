package StringProgram;
//contains() & indexOf()

public class SP28 {
	public static void main(String[] args) {
		String s="how are you I am fine you";
		System.out.println(s.contains("you"));
		System.out.println(s.indexOf('I'));
		System.out.println(s.indexOf('o', 4));
		System.out.println(s.indexOf("you"));
		System.out.println(s.indexOf("you",9));
	}
}
