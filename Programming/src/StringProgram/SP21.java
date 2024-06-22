package StringProgram;
//WAP to occurance of each word in the given String.

public class SP21 {
	public static void main(String[] args) {
		String s="java is programming language used to write java programming";
		String []a=s.split(" ");
		boolean []b=new boolean[a.length];
		
		for (int i = 0; i < b.length; i++) {
			if(b[i]==false) {
			   int count=1;
				for (int j = i+1; j < a.length; j++) {
					if(a[i].equals(a[j])) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]+":"+count);
			}
			
		}
	}

}
