package BasicProgramming;
//WAP to find sum of all the digits in a number.
public class P25 {
	public static void main(String[] args) {
		int n=5465;
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);

	}
}
