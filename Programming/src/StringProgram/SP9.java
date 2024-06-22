package StringProgram;
//WAP to count special character in the string.

public class SP9 {
	public static void main(String[] args) {
		String a="11 ^aBc@ sad$ sah";
		a=a.toLowerCase();
		int miss=0;
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(c>='a' && c<='z') {
				miss=miss+0;
			}
			else if(c>=0 && c<=9) {
				miss=miss+0;
			}
			else if(c==' ') {
				miss=miss+0;
			}
			else {
				miss++;
			}
		}
		System.out.println(miss);
	}

}


////if(!(c>='A' && c<='Z') && !(c>='a' && c<='z') && !(c>=0 && c<=9) && c!=' '){
//miss++;
//}










