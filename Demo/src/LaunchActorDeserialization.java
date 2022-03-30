import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Actor1 implements Serializable {
	String name;
	int age;
	float height;
	
	Actor1(String name, int age, float height){
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
}

public class LaunchActorDeserialization {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C://io//input.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Actor1 a = (Actor1)ois.readObject();
		a.display();
	}

}
