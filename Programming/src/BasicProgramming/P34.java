package BasicProgramming;
//WAP to find all the special numbers in range 1-100.
public class P34 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			int temp=i;
			int sum=0;
			int prod=1;
			while(temp!=0) {
			int d=temp%10;
			sum=sum+d;
			prod=prod*d;
			temp=temp/10;
			}
			if(sum+prod==i)
			{
				System.out.println(i);
			
			}
		}
	}

}
