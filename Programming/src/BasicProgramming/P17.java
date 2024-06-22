package BasicProgramming;
//WAP to find LCM of a number
public class P17 {

	public static void main(String[] args) {
		int a=8;
		int b=10;
		int lcm=(a*b)/gcd(a,b);
		System.out.println(lcm);
		
	}
	public static int gcd(int a,int b) {
		int gcd=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		return gcd;
				
	}
	

}
