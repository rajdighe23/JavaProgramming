package BasicProgramming;
//WAP to find all the factorial of numbers in the range 1-10.
public class P21 {
	public static void main(String[] args) {
		for(int n=1;n<=10;n++)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println(n + "!"+" "+ fact);
		}
		
	}

}
