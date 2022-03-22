import java.util.*;

abstract class Shapes{
	float area;
	abstract void input();
	abstract void compute();
	void disp() {
		System.out.printf("Area: %.2f\n", this.area);
	}
}

class Triangle extends Shapes {
	float height;
	float base;
	
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Height of triangle: ");
		height = sc.nextFloat();
		System.out.println("Base of triangle: ");
		base = sc.nextFloat();
	}
	
	void compute() {
		this.area = 0.5f * height * base;
	}
}

class Rectangle extends Shapes {
	float length;
	float breadth;
	
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Length of rectangle: ");
		length = sc.nextFloat();
		System.out.println("Breadth of rectangle: ");
		breadth = sc.nextFloat();
	}
	
	void compute() {
		this.area = length * breadth;
	}
}

class Circle extends Shapes {
	float radius;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Radius of circle: ");
		radius = sc.nextFloat();
	}
	
	void compute() {
		// for PI, can use Math.PI
		this.area = ((float)Math.PI * radius * radius);
	}
}

class Geometry{
	void permit(Shapes ref) {
		ref.input();
		ref.compute();
		ref.disp();
	}
}

public class AreaOfShape {
	public static void main(String[] args) {
		Geometry g = new Geometry();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		g.permit(t);
		g.permit(r);
		g.permit(c);
		
//		t.input();
//		t.compute();
//		t.disp();
//		
//		r.input();
//		r.compute();
//		r.disp();
//		
//		c.input();
//		c.compute();
//		c.disp();
	}
}