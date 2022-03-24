interface Calculator{
	int count = 3;
	default void display() {
		System.out.println("Display method in an interface");
	}
	static void fun() {
		System.out.println("Function method in an interface");
	}
	void add();//public abstract
	void sub();
}
class MyCalculator implements Calculator {
	public void add() {//default
		System.out.println("Addition method");
	}
	public void sub() {
		System.out.println("Subtraction method");
	}
}

public class LaunchCalculator {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		mc.add();
		mc.sub();
		mc.display();
	}
}
