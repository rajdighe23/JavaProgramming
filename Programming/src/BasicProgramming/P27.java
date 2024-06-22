package BasicProgramming;
//WAP to find product of sum of even and odd number.
public class P27 {
	public static void main(String[] args) {
		int n=2514795;
		int evensum=0;
		int oddsum=0;
		while(n!=0)
		{
			int d =n%10;
			if(d%2==0)
			{
				evensum=evensum+d;
			}
			else
			{
				oddsum=oddsum+d;
			}
			n=n/10;	
		}
		System.out.println(evensum*oddsum);
	}

}
