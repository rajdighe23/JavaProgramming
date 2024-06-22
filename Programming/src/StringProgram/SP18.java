package StringProgram;
//SOSSOSSOS-->

public class SP18 {
	public static void main(String[] args) {
		String s="SOSSQTSOA";
		int count=0;
		
		for(int i=0,j=i+1,k=j+1;i<s.length();i=i+3,j=j+3,k=k+3){
			if(s.charAt(i)!='S') {
				count++;
			}
			if(s.charAt(j)!='O') {
				count++;
			}
			if(s.charAt(k)!='S') {
				count++;
			}
		}
		System.out.println(count);
	}

}
