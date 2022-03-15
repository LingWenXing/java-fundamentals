import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// Given an array of N integers where N>1. Write a code to print 
		// the result/output such that res[i] is equal to the product of 
		// all elements of an array except self
		// Example: input: {4, 2, 1, 7}
		// output: {14, 28, 56, 8}
		
		int nums[] = { 4, 2, 1, 7 };
        int product=1;
        int arr[] = new int[nums.length];
        System.out.println("The product of array element is : ");
        for(int i=0; i<nums.length;i++) {
        	product*=nums[i];
        }
        for(int i=0; i<arr.length;i++) {
        	arr[i]=product/nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));

	}

}
