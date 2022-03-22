abstract class Plane{
	abstract void takeOff();
//	{
//		System.out.println("Plane is taking off");
//	}
	abstract void fly();
//	{
//		System.out.println("Plane is flying");
//	}
	abstract void land();
//	{
//		System.out.println("Plane is landing");
//	}
}

class PassengerPlane extends Plane{
	void takeOff() {
		System.out.println("Passenger plane takesoff from a medium sized runway");
	}
	void fly() {
		System.out.println("Passenger plane flies at medium heights");
	}
	void land() {
		System.out.println("Passenger plane lands on a medium sized runway");
	}
	void carryPassenger() {
		System.out.println("Passenger plane carries the passengers");
	}
}

class CargoPlane extends Plane{
	void takeOff() {
		System.out.println("Cargo plane takesoff from a larger sized runway");
	}
	void fly() {
		System.out.println("Cargo plane flies at low heights");
	}
	void carryCargo() {
		System.out.println("Cargo plane carries the goods");
	}
	void land() {
		System.out.println("Cargo plane lands on a larger sized runway");
	}
}

class FighterPlane extends Plane{
	void takeOff() {
		System.out.println("Fighter plane takesoff from a smaller sized runway");
	}
	void fly() {
		System.out.println("Fighter plane flies at high heights");
	}
	void carryArms() {
		System.out.println("Fighter plane carries the arms and ammunitions");
	}
	void land() {
		System.out.println("Fighter plane lands on a smaller sized runway");
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
