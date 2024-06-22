package StringProgram;
//WAP to display string with smaller length

public class SP26 {
	public static void main(String[] args) {
		String []arr= {"bye","hello","hi","welcome","maharashtra"};
		String min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()<min.length()) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
