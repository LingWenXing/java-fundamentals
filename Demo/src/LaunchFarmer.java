//Static
import java.util.Scanner;

class Farmer{
	private float p;
	private float t;
	private static float r;
	private float si;
	
	static {
		r=2.5f;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter principle amount: ");
		p = scan.nextInt();
		System.out.println("Please enter duration: ");
		t = scan.nextInt();
	}
	public void compute() {
		this.si = (p*t*r)/100;
	}
	public void disp() {
		System.out.println(si);
	}
}

public class LaunchFarmer {

	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		f1.input();
		f1.compute();
		f1.disp();
		
		f2.input();
		f2.compute();
		f2.disp();
		
		f3.input();
		f3.compute();
		f3.disp();

	}

}
