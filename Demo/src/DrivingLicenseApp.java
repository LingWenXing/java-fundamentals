import java.util.Scanner;

class Branch1{
	int age = 18;
	int userAge;
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		userAge = scan.nextInt();
	}
	void verify() {
		if(userAge >= age) {
			System.out.println("You are eligible to apply your driving license");
		}else {
			System.out.println("Sorry, you are underage");
		}
	}
}

public class DrivingLicenseApp {

	public static void main(String[] args) {
		Branch1 b1 = new Branch1();
		b1.acceptInput();
		b1.verify();
	}

}
