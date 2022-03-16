class Dog1{
	String name;
	String color;
	int cost;
	static int counter;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	Dog1() {
		
	}
	Dog1(String name, String color, int cost){
		counter++;
		this.name=name;
		this.color=color;
		this.cost=cost;
	}
}

public class CountObj {
	
	public static void main(String[] args) {
		System.out.println(Dog1.counter);
		Dog1 d1 = new Dog1();
		Dog1 d2 = new Dog1();
		System.out.println(Dog1.counter);
		Dog1 d3 = new Dog1("Rocky","White",10000);
		System.out.println(Dog1.counter);
	}
	static {
		System.out.println("Hello");
	}
	

}
