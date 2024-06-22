package Arrayprogram;
//WAP to find the missing number in the range of 0-n.
public class A12 {
	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,8,0,1};
		int n=nums.length;
		int sum=n*(n+1)/2;
		int total=0;
		for(int i=0;i<nums.length;i++) {
			total=total+nums[i];
		}
		System.out.println("Missing number :"+ (sum-total));
		
	}

}
