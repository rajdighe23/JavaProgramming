package BasicProgramming;
//WAP to find product of all the odd digits in the number.
public class P26 {
	public static void main(String[] args) {
		int n=8754132;
		int prod=1;
		while(n!=0)
		{
			int d=n%10;
			if(d%2!=0)
			{
				prod=prod*d;
			}
			n=n/10;
		}
		System.out.println(prod);
	}

}
