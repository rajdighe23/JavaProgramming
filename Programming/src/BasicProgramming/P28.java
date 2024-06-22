package BasicProgramming;

public class P28 {
	public static void main(String[] args) {
		int n=2514795;
		int oddsum=0;
		while(n!=0)
		{
			int d=n%10;
			if(d%2!=0)
			{
				oddsum=oddsum+d;				
			}
			n=n/10; 
			
		}
		System.out.println(oddsum);

	}
}
