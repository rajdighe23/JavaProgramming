package BasicProgramming;
//WAP to find the largest digit in the number.
public class P29 {
	public static void main(String[] args) {
		int n=584;
		int large=0;
		while(n!=0)
		{
			int d=n%10;
			if(d>large)
			{
				large=d;
			}
			n=n/10;
		}
		System.out.println(large);
		
	}

}
