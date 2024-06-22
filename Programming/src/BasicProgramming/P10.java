package BasicProgramming;
import java.util.Scanner;
public class P10 {

	public static void main(String[] args) {
		int e,r,t,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter energy");
		e=sc.nextInt();
		System.out.println("Enter rate");
		r=sc.nextInt();
		System.out.println("Enter time");
		t=sc.nextInt();
		res=e+(r*(t-1));
		System.out.println(res);
		

	}

}
