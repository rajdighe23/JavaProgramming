package BasicProgramming;
//WAP to find all the prime number in the range 1-100.

public class P20 {
	public static void main(String[] args) {
		for(int n=1;n<=100;n++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n);
			}
			
		}
	}
	

}
