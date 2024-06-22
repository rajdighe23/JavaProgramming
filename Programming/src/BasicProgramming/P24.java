package BasicProgramming;
//WAP to print odd digits of the number.
public class P24 {
	public static void main(String[] args) {
		int n=4651654;
		while(n!=0)
		{
			int d=n%10;
			if(d%2!=0)
			{
				System.out.println(d);
			}
			n=n/10;
		}
	}

}
