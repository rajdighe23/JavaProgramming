package BasicProgramming;

import java.util.Scanner;

//WAP to check if the number is perfect number or not.
public class P14 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt(); //6
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("Perfect number");
			
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}

}
