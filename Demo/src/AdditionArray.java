import java.util.Arrays;

class AdditionClass{
	public int add(int arr[]) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}

public class AdditionArray {

	public static void main(String[] args) {
		int nums[] = new int[]{1,2,3,4,5};
        System.out.println("The addition of array element is : ");
        AdditionClass a = new AdditionClass();
        int sum = a.add(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(sum);

	}

}
