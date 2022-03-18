
/* default value of reference variable is null*/

public class CreatingStringObject {

	static String s;
	
	public static void main(String[] args) {
		
		//System.out.println(s.length());
		
		String s= new String("jbk"); 

		// s(1000) ==>[jbk length()  charAt()] String class object at address 1000

		String s1="javabykiran";
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(s1.length()-1));
		char c=s1.charAt(2);
		System.out.println(c);
		
		System.out.println("jbk".length());
		System.out.println("jbk".concat("java").contains("k"));// method chaining
		System.out.println("A");
	}
}


