package BasicProgramming;
//WAP to find sum of all the prime digits of a number.
public class P35 {
	public static void main(String[] args) {
		int n=547;
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			int count=0;
			for(int i=1;i<=d;i++)
			{
				if(d%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+d;
			}
			n=n/10;
		}
		System.out.println(sum);
		}
		
	}


