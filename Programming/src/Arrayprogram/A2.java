package Arrayprogram;
//WAP to print array element.Using new keyword
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the array element");
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
				

	}

}
