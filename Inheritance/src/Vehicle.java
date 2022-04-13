
public class Vehicle {

	String vehicleType;
}

class Car2 extends Vehicle {
	String modelType;

	public void showDetail() {
		
		vehicleType = "Car2"; // accessing Vehicle class member
		modelType = "sports";
		
		System.out.println(modelType + " " + vehicleType);
	}

	public static void main(String[] args) {
		Car2 car = new Car2();
		car.showDetail();
	}

}
