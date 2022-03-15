class Dog{
	String name;
	String color;
	int cost;
	
	public Dog() {
		name="Ruby";
		color="Black";
		cost=15000;
	}
	//Constructor
	public Dog(String name) {
		this();
		this.name = name;
//		this.color = color;
		cost = 20000;
	}
	public Dog(String name, String color, int cost) {
		this("Spinny");
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
	
}
public class LaunchDog {

	public static void main(String[] args) {
		Dog d1 = new Dog("Rocky","White", 10000);
		d1.disp();
//		Dog d2 = new Dog();
//		d2.disp();
		
	}

}
