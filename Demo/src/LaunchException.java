import java.util.Scanner;

public class LaunchException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numberator");
		int num = sc.nextInt();
		System.out.println("Enter the denominator");
		int den = sc.nextInt();
		int res = num/den;
		System.out.println(res);
	}

}
