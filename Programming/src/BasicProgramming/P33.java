package BasicProgramming;
//WAP to check if the number is special number or not.
public class P33 {
	public static void main(String[] args) {
		int n=39;
		int temp=n;
		int sum=0;
		int prod=1;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			prod=prod*d;
			n=n/10;
		}
		if(sum+prod==temp)
		{
			System.out.println("Special number");
		}
		else
		{
			System.out.println("Not a special number");
		}
		
	}

}
