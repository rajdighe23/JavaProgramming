package StringProgram;
//SOSSOSSOS--> 2nd approch
public class SP19 {
	public static void main(String[] args) {
		String s="SOSSQRPOT";
		int n=s.length()/3;
		String original="";
		
		for(int i=1;i<=n;i++) {
			original=original+"SOS";
		}
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=original.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
