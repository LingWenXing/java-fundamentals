class Warriors extends Thread {
	String resource1 = "knife";
	String resource2 = "gun";
	String resource3 = "bomb";
	
	synchronized public void run() {
		if(getName().equals("Warrior1")) {
			w1AcquiredResource();
		}else if(getName().equals("Warrior2")) {
			w2AcquiredResource();
		}
	}
	
	void w1AcquiredResource() {
		try {
			synchronized(resource1) {
				System.out.println("Warrior1 has acquired "+ resource1);
				Thread.sleep(5000);
				synchronized(resource2) {
					System.out.println("Warrior1 has acquired "+ resource2);
					Thread.sleep(5000);
					synchronized(resource1) {
						System.out.println("Warrior1 has acquired "+ resource3);
						Thread.sleep(5000);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void w2AcquiredResource() {
		try {
			synchronized(resource1) {
				System.out.println("Warrior2 has acquired "+ resource1);
				Thread.sleep(5000);
				synchronized(resource2) {
					System.out.println("Warrior2 has acquired "+ resource2);
					Thread.sleep(5000);
					synchronized(resource1) {
						System.out.println("Warrior2 has acquired "+ resource3);
						Thread.sleep(5000);
					}
				}
			}
		}catch(Exception e) {
			// handle exception
			e.printStackTrace();
		}
	}
}

public class LaunchWar {

	public static void main(String[] args) {
		Warriors w1 = new Warriors();
		Warriors w2 = new Warriors();
		
		w1.setName("Warrior1");
		w2.setName("Warrior2");
		
		w1.start();
		w2.start();

	}

}
