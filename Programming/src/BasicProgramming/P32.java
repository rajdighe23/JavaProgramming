package BasicProgramming;
//WAP to print first 10 numbers from the fibonacci series.
public class P32 {
	public static void main(String[] args) {
		int a=0;
		int b=1;		
		for(int i=1;i<=10;i++)
		{
			int c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
			
		}
	}

}
