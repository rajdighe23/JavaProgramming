package StringProgram;
//ComparTO

public class SP24 {
	public static void main(String[] args) {
		String s1="welcome";
		String s2="hello";
		
		System.out.println("A:"+s1.compareToIgnoreCase(s2)); //First String is bigger
		
		String s3="hello";
		String s4="he";
		System.out.println("B:"+s3.compareToIgnoreCase(s4)); //Difference of length is calculated
		
		String s5="he";
		String s6="hello";
		System.out.println("C:"+s5.compareToIgnoreCase(s6)); //Difference of length is calculated
		
		String s7="Raj";
		String s8="Raj";
		System.out.println("D:"+s7.compareToIgnoreCase(s8)); 
		
//		s1>s2 = +ve
//		s1<s2 = -ve
//		s1==s2 = 0
	}
}
