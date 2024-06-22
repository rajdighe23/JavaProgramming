package StringProgram;
//WAP to find unique character in the String.

public class SP15 {
	public static void main(String[] args) {
		String a="maharashtra";
		boolean []b=new boolean[a.length()];
		
		for(int i=0;i<a.length();i++) {
			if(b[i]==false) {
				int count=1;
				for(int j=i+1;j<a.length();j++) {
					if(a.charAt(i)==a.charAt(j)) {
						count++;
						b[j]=true;
					}
					
				}
				if(count==1) {
					System.out.println(a.charAt(i)+":"+count);
				}
			
		}
		
		
	}

}
}
