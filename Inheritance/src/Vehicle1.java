
public class Vehicle1 {

	String color;
	int speed;
	int size;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

class Car extends Vehicle1 {
	int CC;
	int gears;
	String color;
	 int setSize;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCC() {
		return CC;
	}

	public void setCC(int cC) {
		CC = cC;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}
};

class Test {
	public static void main(String[] args) {
		Car b1 = new Car();
		b1.color = "red";
		b1.setSpeed(200);
		b1.setSize(22);
		b1.CC = 1000;
		b1.gears = 5;
		System.out.println("Color of Car : " + b1.color);
		System.out.println("Speed of Car : " + b1.getSpeed());
		System.out.println("Size of Car : " + b1.getSize());
		System.out.println("CC of Car : " + b1.CC);
		System.out.println("No of gears of Car : " + b1.gears);
	}

}
