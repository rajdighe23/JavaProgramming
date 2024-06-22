package StringProgram;
//WAP to swap to String using third variable.

public class SP22 {
	public static void main(String[] args) {
		String s1="Raj";
		String s2="Jay";
		
		System.out.println("Before swapping");
		System.out.println("s1- "+ s1);
		System.out.println("s2- "+ s2);
		System.out.println();
		
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After swapping");
		System.out.println("s1- "+ s1);
		System.out.println("s2- "+ s2);
		
		
	}

}
