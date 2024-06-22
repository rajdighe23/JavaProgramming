package BasicProgramming;
//WAP to check if the number is perfect square or not.
public class P18 {
	public static void main(String[] args) {
		int n=100;
		int i=1;
		for(;i<=n/2;i++)
		{
			if(i*i==n)
			{
				System.out.println("Perfect square");
				break;
			}
			
		}
		if(i*i!=n)
		{
			System.out.println("Not a perfect square");
		}
	}

}
