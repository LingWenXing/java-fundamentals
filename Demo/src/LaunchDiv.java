import java.util.InputMismatchException;
import java.util.Scanner;

class Launch1{
	void fun1() throws ArithmeticException {
		System.out.println("Connection established");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			System.out.println("Enter the denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
			
			System.out.println("Enter the size of an array");
			int size = scan.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the index at which the element has to be inserted");
			int index= scan.nextInt();
			System.out.println("Enter the element to be inserted");
			int elem=scan.nextInt();
			arr[index]=elem;
			System.out.println(arr[index]);
			
		}catch(ArithmeticException e) {
			System.out.println("fun(): Enter a non-zero denominator");
			throw e;
		}catch(NegativeArraySizeException e) {
			System.out.println("Be positive");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Be within your limits");
		}catch(InputMismatchException e) {
			System.out.println("Enter an integer element");
		}catch(Exception e) {
			System.out.println("Invalid input");
		}finally{
			System.out.println("Connection terminated");
		}
	}
}
class Launch2{
	void fun2() {
		Launch1 l1 = new Launch1();
		l1.fun1();
	}
}
class Launch3{
	void fun3() {
		Launch2 l2 = new Launch2();
		l2.fun2();
	}
}
class Launch4{
	void fun4() {
		Launch3 l3 = new Launch3();
		l3.fun3();
	}
}

public class LaunchDiv {

	public static void main(String[] args) {
		try {
			Launch4 l4 = new Launch4();
			l4.fun4();
		}catch(ArithmeticException e) {
			System.out.println("main(): Enter a non-zero denominator");
		}
		
		
	}

}
