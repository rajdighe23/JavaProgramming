package StringProgram;

import java.util.Arrays;

//WAP to check if the given String is Anagram or not.
//Anagram =No.of characters and letters are same.
//Eg.-->(cat=act) (race=care)(listen=silent)(brainy=binary)

//1.sort the data in String using toCharArray().
//2.compare the sorted data.

public class SP13 {
	public static void main(String[] args) {
		String s1="brainy";
		String s2="binary";
		
		if(s1.length()==s2.length()){
			char []c1=s1.toCharArray();
			char []c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean result=Arrays.equals(c1, c2);
			if(result==true) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not a Anagram");
			}
		}
		else {
			System.out.println("Length is not same,hence it is not an Anagram");
		}
	}

}
