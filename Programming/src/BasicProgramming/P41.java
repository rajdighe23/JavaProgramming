package BasicProgramming;
//WAP to print Armstrong number from 1-10000.

public class P41 {
	public static void main(String[] args) {
		for(int b=1;b<=10000;b++) {
			int a=b;
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
				System.out.println(b);
			}
		}
	}
}
