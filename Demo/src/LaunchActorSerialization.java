import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Actor implements Serializable {
	String name;
	int age;
	float height;
	
	Actor(String name, int age, float height){
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


public class LaunchActorSerialization {

	public static void main(String[] args) throws Exception {
		Actor a1 = new Actor("Haziq", 28, 178.5f);
		a1.display();

		FileOutputStream fos = new FileOutputStream("C://io//input.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("C://io//input.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ois.readObject();
		System.out.println("String data: " + ois.readObject());
	}

}
