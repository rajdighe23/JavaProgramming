package BasicProgramming;
//WAP to find smallest digit in the number.

public class P30 {
	public static void main(String[] args) {
		int n=584;
		int small=9;
		while(n!=0)
		{
			int d = n%10;
			if(d<small)
			{
				small=d;
			}
			n=n/10;
		}
		System.out.println(small);
	}

}
