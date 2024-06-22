package BasicProgramming;
//WAP to swap 2 numbers.
public class P12 {

	public static void main(String[] args) {
		int a=-3;
		int b=8;
		System.out.println("Before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
