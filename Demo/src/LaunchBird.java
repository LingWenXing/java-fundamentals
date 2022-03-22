abstract class Bird{
	abstract void fly();
	abstract void eat();
}

abstract class Eagle extends Bird{
	void eat() {
		System.out.println("Eagle hunts and eats");
	}
}

class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrow flies at low heights");
	}
	void eat() {
		System.out.println("Sparrow eats the grains");
	}
}

class GoldenEagle extends Eagle{
	void fly() {
		System.out.println("Golden Eagle flies over the ocean");
	}
}

class SerpentEagle extends Eagle{
	void fly() {
		System.out.println("Serpent Eagle flies over the mountains");
	}
}

class Sky{
	void permit(Bird ref) {
		ref.eat();
		ref.fly();
	}
}

public class LaunchBird {

	public static void main(String[] args) {
//		Eagle e = new Eagle();
		SerpentEagle se = new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();
		Sparrow sp = new Sparrow();
		
		Sky s = new Sky();
		s.permit(se);
		s.permit(ge);
		s.permit(sp);
	}

}
