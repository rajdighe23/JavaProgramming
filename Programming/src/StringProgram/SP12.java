package StringProgram;
//WAP to display BA1NGA2L3OR4E--->
//9BANGALORE10

public class SP12 {
	public static void main(String[] args) {
		String a = "BA1NGA2L3OR4E";
		String res = "";
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				res = res + c;
			} else {
				sum = sum + (c - '0');
			}
		}
		System.out.println(res.length() + res + sum);
	}

}



//'0'--->48-48=0;
//'1'--->49-48=1;
//'2'--->50-48=2;
//'3'--->51-48=3;