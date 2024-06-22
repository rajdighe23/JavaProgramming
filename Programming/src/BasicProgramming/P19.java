package BasicProgramming;
//WAP to check if the number is prime number or not.
public class P19 {
	public static void main(String[] args) {
		int n=5;
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
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
		
	}

}
