package StringProgram;
//WAP to swap to String without using third variable.

public class SP23 {
	public static void main(String[] args) {
		String s1="Raj";
		String s2="JayDighe";
		
		System.out.println("Before swapping");
		System.out.println("s1- "+ s1);
		System.out.println("s2- "+ s2);
		System.out.println();
		
		s1=s1.concat(s2);
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swapping");
		System.out.println("s1- "+ s1);
		System.out.println("s2- "+ s2);
		System.out.println();
	}

}
