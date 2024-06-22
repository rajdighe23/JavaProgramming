package BasicProgramming;
//WAP to print all the Strong number in a range 1-10000.
public class P38 {
	public static void main(String[] args) {
		for(int n=1;n<=10000;n++)
		{
			int temp=n;
			int sum=0;
			while(temp!=0)
			{
				int d=temp%10;
				int fact=1;
				for(int i=1;i<=d;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				temp=temp/10;
			}
			if(sum==n)
			{
				System.out.println(sum);
			}
		}
		
	}

}
