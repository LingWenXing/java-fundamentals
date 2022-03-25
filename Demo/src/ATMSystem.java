import java.util.Scanner;

class InvalidCredentialsException extends Exception{
	public String getMessage() {
		return "Invalid credentials";
	}
}

class ATM{
	static int accountNo = 1111;
	static int pin = 2222;
	int accno,pwd;
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Account No.: ");
		accno = scan.nextInt();
		System.out.println("Pin: ");
		pwd = scan.nextInt();
	}
	void verify() throws InvalidCredentialsException {
		if(accno == ATM.accountNo && pwd == ATM.pin) {
			System.out.println("Collect your $$$");
		}else {
			InvalidCredentialsException ice = new InvalidCredentialsException();
			System.out.println(ice.getMessage() + " - Message display in ATM");
			throw ice;
		}
	}
}

class Bank{
	void init() {
		ATM atm = new ATM();
		atm.acceptInput();
		try {
			atm.verify();
		}catch(InvalidCredentialsException ice) {
			System.out.println(ice.getMessage() + " - Message display in Bank");
		}
		
	}
}

public class ATMSystem {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.init();
	}

}
