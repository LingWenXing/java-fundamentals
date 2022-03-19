class Plane{
	void takeOff() {
		System.out.println("Plane is taking off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}

class PassengerPlane extends Plane{
	void fly() {
		System.out.println("Passenger plane flies at low heights");
	}
	void carryPassenger() {
		System.out.println("Passenger plane carries the passengers");
	}
}

class CargoPlane extends Plane{
	void fly() {
		System.out.println("Cargo plane flies at medium heights");
	}
	void carryCargo() {
		System.out.println("Cargo plane carries the goods");
	}
}

class FighterPlane extends Plane{
	void fly() {
		System.out.println("Fighter plane flies at high heights");
	}
	void carryArms() {
		System.out.println("Fighter plane carries the arms and ammunitions");
	}
}

class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class LaunchPlane {

	public static void main(String[] args) {
		PassengerPlane pp = new PassengerPlane();
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		
		Airport a = new Airport();
		a.permit(pp);
//		pp.carryPassenger();
		a.permit(cp);
//		cp.carryCargo();
		a.permit(fp);
//		fp.carryArms();

	}

}
