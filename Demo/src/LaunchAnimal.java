class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Tiger extends Animal{
	void eat() {
		System.out.println("Tiger hunts and eats");
	}
	void movement() {
		System.out.println("Tiger runs");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("Deer grazes and eats");
	}
	void movement() {
		System.out.println("Deer jumps and move");
	}
}

class Monkey extends Animal{
	void eat() {
		System.out.println("Monkey steals and eats");
	}
	void movement() {
		System.out.println("Monkey jumps and runs");
	}
}

class Zoo{
	void permit(Animal ref) {
		ref.eat();
		ref.sleep();
	}
}

public class LaunchAnimal {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();
		
		Zoo a = new Zoo();
		a.permit(t);
		t.movement();
		a.permit(d);
		d.movement();
		a.permit(m);
		m.movement();

	}

}
