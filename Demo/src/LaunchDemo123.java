//Loops
public class LaunchDemo123 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		int sum=0;
		for(int a: arr) {
			sum+=a;
		}
		System.out.print(sum);
	}

}
