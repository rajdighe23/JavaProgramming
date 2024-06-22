package StringProgram;
//WAP to reverse the statement.
public class P14 {
	public static void main(String[] args) {
		String s="today is tuesday in sept";
		String[]a=s.split(" ");
		for (int i = a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
	}

}
