package BasicProgramming;

public class P39 {
	public static void main(String[] args) {
		int n=100000;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);
	
}

}
