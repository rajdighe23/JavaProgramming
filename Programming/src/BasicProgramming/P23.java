package BasicProgramming;
//WAP to print all the even digits from the number.
public class P23 {
	public static void main(String[] args) {
		int n=41524;
		while(n!=0)
		{
			int d=n%10;
			if(d%2==0)
			{
				System.out.println(d);
			}
			n=n/10;
			
		}
		
	}

}
