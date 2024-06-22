package BasicProgramming;
//WAP to find all perfect numbers in the range 1-1000.
public class P15 {
	public static void main(String[] args) {
		for(int n=1;n<=1000;n++)
		{
			int sum=0;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
			if(n==sum)
			{
				System.out.println(n);
			}
		}
		
	}
}
		
