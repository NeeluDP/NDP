

public class Demo {

	int a=10;
	
	/* Every java class should override toString() so that
	 * it will return content of an object
	 * */
	
	@Override
	public String toString() {
		return "Demo [a=" + a + "]";
	}



	public static void main(String[] args) {
		
		Demo d = new Demo();// [a=10 toString()] Demo class object
		System.out.println(d);//toString() is called automatically when we print object reference
		System.out.println(d.toString());
	}
}



