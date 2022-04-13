
 public class Car1 {

	public Car1() {
		System.out.println("Constructor of class Car");
	}
	public void vehicleType() {
		System.out.println("Vehicle Type : Car");
	}
}

class Maruti extends Car1 {
	public Maruti() {
		System.out.println("Constructor of class Maruti");
	}

	public void brand() {
		System.out.println("Brand : Maruti");
	}

	public void speed() {
		System.out.println("Max speed: 90Kmph");
	}
}

class Maruti800 extends Maruti {
	
	public Maruti800() {
		System.out.println("Constructor of class Maruti800");
	}

	public void speed() {
		System.out.println("Max speed: 80Kmph");
	}

	public static void main(String[] args) {
		
		Maruti800 obj = new Maruti800();
		
		obj.vehicleType();
		obj.brand();
		obj.speed();

	}
}