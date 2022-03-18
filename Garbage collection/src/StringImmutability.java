

public class StringImmutability {

	public static void main(String[] args) {
		
		/* String object's content do not change . hence it is called
		 * String constant .
		 * 
		 * String objects are immutable (unchangeable)
		 * 
		 * If we try to change , content of String object , then new String object 
		 * is created with modified content .
		 * */
		
		final int a=10; // [10] a   a is integer constant
		//a=20;
		
		String s ="java";  // s===> [java] String class object
		String s1=s.concat(" is easy"); //s1===> [java is easy] String class object
		System.out.println(s);
		System.out.println(s1);
		

	}

}

