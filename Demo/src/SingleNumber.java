//1. Given a non-empty array of integers nums, every element appears twice except for one.
//Find that single number. Example: input: {1,2,1}, output:2; Example: input: nums{1,2,1,2,4,3,4} output: 3

public class SingleNumber {
	public int findSingleNumber(int nums[]) {
		int res=0;
		for (int i=0; i<nums.length;i++) {
			res=res^nums[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int nums[]= {1,2,1,2,3};
		SingleNumber sn = new SingleNumber();
		int res = sn.findSingleNumber(nums);
		System.out.println(res);
	}
	
}