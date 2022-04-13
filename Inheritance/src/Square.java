public class Square {

	protected int sides;
	public void Shape() {
	sides = 3;
	}
	public int getSides() {
	return sides;
	}
	public void printSides() {
	System.out.println("This object has " + sides + " sides.");
	}
	}

 class Square1 extends Square {
		public Square1(int nSides) {
		sides = nSides;
		// possible
		// don't need to call super class
		// constructor due to protected type of variable.
		}

		void display() {
		Square1 shape= new Square1(15);
		System.out.println(shape.sides);
		//error as we are not calling
		// through object of subclass
		}}
		class ProtectedVariableDemo {
			
			public static void main(String args[]) {
			Square1 sObj = new Square1(10);
			sObj.printSides();
	}


}
