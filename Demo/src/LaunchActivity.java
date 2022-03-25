import java.util.Scanner;

class Demo extends Thread{
	public void run() {
		if(getName().equals("BANK")) {
			bank();
		}else if(getName().equals("PRINT")) {
			print();
		}else if(getName().equals("ADD")) {
			add();
		}
	}
	void bank() {
		System.out.println("Banking activity started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account no.: ");
		int an = scan.nextInt();
		System.out.println("Enter password: ");
		int pw = scan.nextInt();
		System.out.println("Collect your money");
		System.out.println("Banking activity completed");
	}
	void print() {
		System.out.println("Printing activity started");
		for(int i=0;i<5;i++) {
			System.out.println("Printing");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing activity completed");
	}
	void add() {
		System.out.println("Addition activity started");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition activity completed");
	}
}

class Bank1 implements Runnable{
	public void run() {
		System.out.println("Banking activity started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account no.: ");
		int an = scan.nextInt();
		System.out.println("Enter password: ");
		int pw = scan.nextInt();
		System.out.println("Collect your money");
		System.out.println("Banking activity completed");
	}
}

class Print implements Runnable{
	public void run() {
		System.out.println("Printing activity started");
		for(int i=0;i<5;i++) {
			System.out.println("Printing");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing activity completed");
	}
}

class Addition1 implements Runnable{
	public void run() {
		System.out.println("Addition activity started");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		System.out.println("Addition activity completed");
	}
}

public class LaunchActivity {

	public static void main(String[] args) {
//		Bank1 b = new Bank1();
//		Print p = new Print();
//		Addition1 a = new Addition1();
		
//		b.start();
//		p.start();
//		a.start();
		
//		Thread t1 = new Thread(b);
//		Thread t2 = new Thread(p);
//		Thread t3 = new Thread(a);
//		t1.start();
//		t2.start();
//		t3.start();
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		d1.setName("BANK");
		d2.setName("PRINT");
		d3.setName("ADD");
		
		d1.start();
		d2.start();
		d3.start();
	}

}
