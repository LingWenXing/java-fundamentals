class Parent{
	void eat() {
		System.out.println("Parent is eating");
		
	}
}

class Child1 extends Parent{
	void eat() {
		System.out.println("Child1 eats heavily");
	}
	void cry() {
		System.out.println("Child1 cries loudly");
	}
}

class Child2 extends Parent{
	void eat() {
		System.out.println("Child2 eats lightly");
	}
	void cry() {
		System.out.println("Child2 does not cry");
	}
}
class Animal1 {
	
}
class Tiger1 extends Animal1 {
	
}
class Exmp1{
	Animal1 display() {
		System.out.println("Inside Exmp1");
		Animal1 a = new Animal1();
		return a;
	}
}

class Exmp2 extends Exmp1{
	Tiger1 display() {
		System.out.println("Inside Exmp2");
		Tiger1 t = new Tiger1();
		return t;
	}
}

public class LaunchParent {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		Parent ref;
		ref=c1;
		ref.eat();
		((Child1)ref).cry();
		
		ref=c2;
		ref.eat();
		((Child2)ref).cry();
		
		Exmp2 e = new Exmp2();
		e.display();
	}

}
