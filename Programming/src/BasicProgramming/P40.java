package BasicProgramming;
//WAP to find the given number is Armstrong number or not. 

public class P40 {
	public static void main(String[] args) {
		int a=153;
		int temp=a;
		int sum=0;
		int count=0;
		while(a>0) {
			count++;
			a=a/10;
		}
		a=temp;
		while(a>0) {
			int d=a%10;
			int pow=1;
			for(int i=1;i<=count;i++) {
				pow=d*pow;
			}
			sum=sum+pow;
			a=a/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
