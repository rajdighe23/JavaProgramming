package Arrayprogram;
//WAP to print count of numbers which are factors of disAmount.
//ignore the negative sign.
public class A10 {
	public static void main(String[] args) {
		int [] a = {-9,-13,8,-7,-8,18,10}; // -9 and 18 are factors of disAmount i.e.18.
		int disAmount=18;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (disAmount % a[i] == 0) {
				count++;
			}
		}
		System.out.println(count);			
		}		
	}
