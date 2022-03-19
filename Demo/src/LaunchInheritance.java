class Base{
	int a = 10;
	int b = 20;
//	Base(){
//		
//	}
//	Base(int a, int b){
//		this.a=a;
//		this.b=b;
//	}
//	Base(int a){
//		this(1000,2000);
//		this.a=a;
//	}
//	
//	void display() {
//		System.out.println(a);
//		System.out.println(b);
//	}
}
class Child extends Base{
//	Child(){
////		super(111,222);
//		super(111);
//		a=100;
//		b=200;
//	}
	int a = 100;
	void display() {
		int a = 1000;
		System.out.println(a); //1000
		System.out.println(this.a); //100
		System.out.println(super.a); //10
	}
}
public class LaunchInheritance {

	public static void main(String[] args) {
		Child d = new Child();
		d.display();
	}

}
