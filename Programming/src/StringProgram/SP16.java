package StringProgram;
//WAP to find each character in the String.(2nd approch)

public class SP16 {
	public static void main(String[] args) {
		String s="nitin";
		int index=-1;
		boolean []b=new boolean[s.length()];
		
		for(int i=0;i<s.length();i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						count++;
						b[j]=true;
					}
				}
				if(count==1) {
					index=i+1;
					break;
				}
				System.out.println(s.charAt(i)+":"+count);
			}
		}
	}
}
