package BasicProgramming;
import java.util.Scanner;
public class P36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),p=sc.nextInt();
		int pow=1;
		for(int i=1;i<=p;i++)
		{
			pow=pow*n;
		}
		System.out.println(pow);
	}

}