package BasicProgramming;
//WAP to separate each digit from the number.
public class P22 {
	public static void main(String[] args) {
		int n=396;
		while(n!=0)
		{
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}
		
	}

}
